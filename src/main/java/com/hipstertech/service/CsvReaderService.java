package com.hipstertech.service;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.hipstertech.service.entities.Document;
import com.hipstertech.service.entities.DocumentLines;

@Service
public class CsvReaderService {
	private final Logger log = LoggerFactory.getLogger(CsvReaderService.class);
	
	public Document getDocumentByDocNumber(String docNumber,int serie) {
		Document document=null;
		try {
			List<DocumentLines> lines = new ArrayList<DocumentLines>();
			Iterable<CSVRecord> csvRecords = parseFile();
			for(CSVRecord record : csvRecords) {
				if(record.get("OINV_DOCNUM").equals(docNumber)) {
					if(document==null) {
						document = setDocumentValues(record,serie);
					}
					lines.add(getLineWithValues(record));
				}
			if(document!=null)
				document.setDocumentLines(lines);
			}
		}catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
		return document;
	}

	private DocumentLines getLineWithValues(CSVRecord record) {
		DocumentLines line = new DocumentLines();
		line.setAccountCode(record.get("INV1_COGSOCRCOD"));
		line.setCOGSCostingCode(record.get("INV1_COGSOCRCOD"));
		line.setCOGSCostingCode2(record.get("INV1_COGSOCRCO2"));
		line.setCOGSCostingCode3(record.get("INV1_COGSOCRCO3"));
		line.setCOGSCostingCode4(record.get("INV1_COGSOCRCO4"));
		line.setCOGSCostingCode5(record.get("INV1_COGSOCRCO5"));
		line.setCostingCode(record.get("INV1_OCRCODE"));
		line.setCostingCode2(record.get("INV1_OCRCODE2"));
		line.setCostingCode3(record.get("INV1_OCRCODE3"));
		line.setCostingCode4(record.get("INV1_OCRCODE4"));
		line.setCostingCode5(record.get("INV1_OCRCODE5"));
		line.setCurrency(record.get("INV1_CURRENCY"));
		line.setItemDescription(record.get("INV1_TEXT"));
		line.setLineTotal(record.get("INV1_LINETOTAL")==null?null:Double.parseDouble(record.get("INV1_LINETOTAL").replace(",","")));
		line.setOpenAmount(record.get("INV1_OPENSUM")==null?null:Double.parseDouble(record.get("INV1_OPENSUM").replace(",","")));//check!!!!!!!!!!!!!
		line.setPrice(record.get("INV1_PRICE")==null?null:Double.parseDouble(record.get("INV1_PRICE").replace(",","")));
		line.setPriceAfterVAT(record.get("INV1_PRICEAFVAT")==null?null:Double.parseDouble(record.get("INV1_PRICEAFVAT").replace(",","")));
		line.setSalesPersonCode(record.get("INV1_SLPCODE")==null?null:Integer.parseInt(record.get("INV1_SLPCODE")));
		line.setTaxCode(record.get("INV1_TAXCODE"));
		line.setUnitPrice(record.get("INV1_PRICEBEFDI")==null?null:Double.parseDouble(record.get("INV1_PRICEBEFDI").replace(",","")));
		return line;
	}

	private Document setDocumentValues(CSVRecord record,int serie) throws ParseException {
		Document document;
		document = new Document();
		document.setDocNum(record.get("OINV_DOCNUM")==null?null:Integer.parseInt(record.get("OINV_DOCNUM")));
		document.setCardCode(record.get("OINV_CARDCODE"));
		document.setComments(record.get("OINV_COMMENTS"));
		document.setDocCurrency(record.get("OINV_DOCCUR"));
		//document.setDocDate(record.get("OINV_DOCDATE")==null?null:new SimpleDateFormat("MMM dd, yyyy hh:mm:ss.S a").parse(record.get("OINV_DOCDATE")));
		//document.setDocDueDate(record.get("OINV_DOCDUEDATE")==null?null:new SimpleDateFormat("MMM dd, yyyy hh:mm:ss.S a").parse(record.get("OINV_DOCDUEDATE")));
		document.setDocTotal(record.get("OINV_DOCTOTAL")==null?null:Double.parseDouble(record.get("OINV_DOCTOTAL").replace(",","")));
		document.setDocType(record.get("OINV_DOCTYPE"));
		document.setNumAtCard(record.get("OINV_NUMATCARD"));
		document.setReference1(record.get("OINV_REF1"));
		document.setReference2(record.get("OINV_REF2"));
		document.setReserve(record.get("OINV_RESERVE"));
		document.setReserveInvoice(record.get("OINV_RETINVOICE"));//CHECK!!!!!!!!!
		document.setU_BDOC(record.get("OINV_U_BDOC"));
		document.setU_FormPag(record.get("OINV_U_FORMPAG"));
		document.setU_NAR(record.get("OINV_U_NAR"));
		document.setU_NCA(record.get("OINV_U_NCA"));
		document.setU_NNE(record.get("OINV_U_NNE"));
		document.setU_NPR(record.get("OINV_U_NPR"));
		document.setU_NSP(record.get("OINV_U_NSP"));
		document.setSeries(serie);
		return document;
	}
	
	private Iterable<CSVRecord> parseFile() throws IOException{
		Reader csvFile;
		Iterable<CSVRecord> csvRecords;
		File file = ResourceUtils.getFile("classpath:InvoicesDuplicated.csv");
		csvFile = new FileReader(file);
		csvRecords = CSVFormat.DEFAULT.withDelimiter(';').withFirstRecordAsHeader().withTrim().parse(csvFile);
		return csvRecords;
	}
	      
}
