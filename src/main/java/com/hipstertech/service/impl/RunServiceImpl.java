package com.hipstertech.service.impl;


import java.time.Instant;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hipstertech.domain.enumeration.DocumentType;
import com.hipstertech.domain.enumeration.SourceType;
import com.hipstertech.domain.enumeration.Status;
import com.hipstertech.service.CsvReaderService;
import com.hipstertech.service.JobService;
import com.hipstertech.service.MarketingDocumentsService;
import com.hipstertech.service.RunService;
import com.hipstertech.service.ServiceLayerClient;
import com.hipstertech.service.dto.JobDTO;
import com.hipstertech.service.dto.MarketingDocumentsDTO;
import com.hipstertech.service.entities.Document;


@Service
public class RunServiceImpl implements RunService {
	
	private final Logger log = LoggerFactory.getLogger(RunServiceImpl.class);
	
	private final MarketingDocumentsService marketingDocumentsService;

	private final ServiceLayerClient serviceLayerClient;

	private final CsvReaderService csvReaderService;
	
	private final JobService jobService;
	
	public RunServiceImpl(
			MarketingDocumentsService marketingDocumentsService,
			ServiceLayerClient serviceLayerClient,
			CsvReaderService csvReaderService,
			JobService jobService
			) 
	{
		this.marketingDocumentsService=marketingDocumentsService;
		this.serviceLayerClient = serviceLayerClient;
		this.csvReaderService = csvReaderService;
		this.jobService = jobService;
		
	}
	
	

	@Override
	public void run(Long idJob) {
		try {

			//Job data
			JobDTO job = jobService.findOne(idJob).get();
			job.setStatus(Status.INPROGRESS);
			jobService.save(job);

			String resourceName = job.getDocumentType().name().equals(DocumentType.FE.name()) ? "Invoices" : "CreditNotes";

			//Documents
			List<MarketingDocumentsDTO> documentList = marketingDocumentsService.findByJobAndStatus(idJob.intValue(),Status.PENDING);

			//forEach
			documentList.forEach(i->{
				Document documentInfo = null;
				if(job.getSourceType().equals(SourceType.SL)) {
					documentInfo = serviceLayerClient.getDocumentByDocNumber(i.getDocNumber(), job.getSerie(),job.getDocumentType());
				}else
					documentInfo = csvReaderService.getDocumentByDocNumber(i.getDocNumber(), job.getSerie(),job.getDocumentType());

				if(documentInfo != null) {
					//Create document
					Document createdDocument = serviceLayerClient.createDocument(documentInfo, resourceName);

					//Update status document
					boolean success = createdDocument !=null && createdDocument.getDocNum() !=null;
					i.setProcessedDate(Instant.now());
					i.setComments(success ? "Documento generado " + createdDocument.getDocNum()  : "Error en SAP createdDocument");
					i.setStatus(success ? Status.PROCESSED : Status.ERROR);
					marketingDocumentsService.save(i);
					
				}else {
					i.setProcessedDate(Instant.now());
					i.setComments("Error documento no encontrado");
					i.setStatus(Status.ERROR);
					marketingDocumentsService.save(i);
				}

			});

			//Update job
			job.setStatus(Status.PROCESSED);
			jobService.save(job);


		}catch (Exception e) {
			log.error(e.getMessage());
		}
	}

}
