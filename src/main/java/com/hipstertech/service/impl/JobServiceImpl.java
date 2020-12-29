package com.hipstertech.service.impl;

import java.time.Instant;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hipstertech.domain.Job;
import com.hipstertech.domain.enumeration.DocumentType;
import com.hipstertech.domain.enumeration.Status;
import com.hipstertech.repository.JobRepository;
import com.hipstertech.service.CsvReaderService;
import com.hipstertech.service.JobService;
import com.hipstertech.service.MarketingDocumentsService;
import com.hipstertech.service.ServiceLayerClient;
import com.hipstertech.service.dto.JobDTO;
import com.hipstertech.service.dto.MarketingDocumentsDTO;
import com.hipstertech.service.entities.Document;
import com.hipstertech.service.mapper.JobMapper;

/**
 * Service Implementation for managing {@link Job}.
 */
@Service
@Transactional
public class JobServiceImpl implements JobService {

    private final Logger log = LoggerFactory.getLogger(JobServiceImpl.class);

    private final JobRepository jobRepository;

    private final JobMapper jobMapper;
    
    private final MarketingDocumentsService marketingDocumentsService;
    
    private final ServiceLayerClient serviceLayerClient;
    
    private final CsvReaderService csvReaderService;

    public JobServiceImpl(JobRepository jobRepository, JobMapper jobMapper, 
    		MarketingDocumentsService marketingDocumentsService,
    		ServiceLayerClient serviceLayerClient,
    		CsvReaderService csvReaderService) 
    {
        this.jobRepository = jobRepository;
        this.jobMapper = jobMapper;
        this.marketingDocumentsService = marketingDocumentsService;
        this.serviceLayerClient = serviceLayerClient;
        this.csvReaderService = csvReaderService;
    }

    @Override
    public JobDTO save(JobDTO jobDTO) {
        log.debug("Request to save Job : {}", jobDTO);
        Job job = jobMapper.toEntity(jobDTO);
        job = jobRepository.save(job);
        return jobMapper.toDto(job);
    }

    @Override
    @Transactional(readOnly = true)
    public List<JobDTO> findAll() {
        log.debug("Request to get all Jobs");
        return jobRepository.findAll().stream()
            .map(jobMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<JobDTO> findOne(Long id) {
        log.debug("Request to get Job : {}", id);
        return jobRepository.findById(id)
            .map(jobMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Job : {}", id);
        jobRepository.deleteById(id);
    }

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void run(Long idJob) {
		try {
			
			//Job data
			JobDTO job = findOne(idJob).get();
			job.setStatus(Status.INPROGRESS);
			save(job);
			
			String resourceName = job.getDocumentType().name().equals(DocumentType.FE) ? "Invoices" : "CreditNotes";
			
			//Documents
			List<MarketingDocumentsDTO> documentList = marketingDocumentsService.findByJobAndStatus(idJob,Status.PENDING.name());
			
			//forEach
			documentList.forEach(i->{
				Document documentInfo = null;
				if(job.getSourceType().equals("SL")) {
					documentInfo = serviceLayerClient.getDocumentByDocNumber(i.getDocNumber(), job.getSerie());
				}else
					documentInfo = csvReaderService.getDocumentByDocNumber(i.getDocNumber(), job.getSerie());
				
				//Create document
				Document createdDocument = serviceLayerClient.createDocument(documentInfo, resourceName);
				
				//Update status document
				boolean success = createdDocument !=null;
				i.setProcessedDate(Instant.now());
				i.setComments(success ? "OK" : "Error en createdDocument");
				i.setStatus(success ? Status.PROCESSED : Status.ERROR);
				marketingDocumentsService.save(i);

			});
			
			//Update job
			job.setStatus(Status.PROCESSED);
			save(job);
			
			
		}catch (Exception e) {
			log.error(e.getMessage());
		}
	}
}
