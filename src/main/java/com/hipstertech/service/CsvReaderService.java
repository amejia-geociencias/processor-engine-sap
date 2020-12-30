package com.hipstertech.service;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.hipstertech.domain.enumeration.DocumentType;
import com.hipstertech.service.entities.BatchNumberObject;
import com.hipstertech.service.entities.Document;
import com.hipstertech.service.entities.DocumentLines;

@Service
public class CsvReaderService {
	private final Logger log = LoggerFactory.getLogger(CsvReaderService.class);

	public Document getDocumentByDocNumber(int docNumber,int serie, DocumentType type) {
		Document document=null;
		try {
			List<DocumentLines> lines = new ArrayList<DocumentLines>();
			Iterable<CSVRecord> csvRecords = parseFile();
			for(CSVRecord record : csvRecords) {
				if(record.get("OINV_DOCNUM").equals(docNumber+"")) {
					if(document==null) {
						document = setDocumentValues(record,serie,type);
					}
					lines.add(getLineWithValues(record,type));
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

	private DocumentLines getLineWithValues(CSVRecord record,DocumentType type) {
		boolean isNCOpen = false;
		DocumentLines line = new DocumentLines();
		line.setAccountCode(record.get("INV1_ACCTCODE"));
		line.setCOGSCostingCode(record.get("INV1_COGSOCRCOD").equals("?") ? null:record.get("INV1_COGSOCRCOD"));
		line.setCOGSCostingCode2(record.get("INV1_COGSOCRCO2").equals("?") ? null:record.get("INV1_COGSOCRCO2"));
		line.setCOGSCostingCode3(record.get("INV1_COGSOCRCO3").equals("?") ? null:record.get("INV1_COGSOCRCO3"));
		line.setCOGSCostingCode4(record.get("INV1_COGSOCRCO4").equals("?") ? null:record.get("INV1_COGSOCRCO4"));
		line.setCOGSCostingCode5(record.get("INV1_COGSOCRCO5").equals("?") ? null:record.get("INV1_COGSOCRCO5"));
		line.setCostingCode(record.get("INV1_OCRCODE").equals("?") ? null:record.get("INV1_OCRCODE"));
		line.setCostingCode2(record.get("INV1_OCRCODE2").equals("?") ? null:record.get("INV1_OCRCODE2"));
		line.setCostingCode3(record.get("INV1_OCRCODE3").equals("?") ? null:record.get("INV1_OCRCODE3"));
		line.setCostingCode4(record.get("INV1_OCRCODE4").equals("?") ? null:record.get("INV1_OCRCODE4"));
		line.setCostingCode5(record.get("INV1_OCRCODE5").equals("?") ? null:record.get("INV1_OCRCODE5"));
		line.setCurrency(record.get("INV1_CURRENCY"));
		line.setItemDescription(record.get("INV1_DSCRIPTION"));
		line.setItemDetails(record.get("INV1_TEXT"));
		line.setLineTotal(record.get("INV1_LINETOTAL")==null?null:Double.parseDouble(record.get("INV1_LINETOTAL").replace(",","")));
		line.setOpenAmount(record.get("INV1_OPENSUM")==null?null:Double.parseDouble(record.get("INV1_OPENSUM").replace(",","")));//check!!!!!!!!!!!!!
		line.setPrice(record.get("INV1_PRICE")==null?null:Double.parseDouble(record.get("INV1_PRICE").replace(",","")));
		line.setPriceAfterVAT(record.get("INV1_PRICEAFVAT")==null?null:Double.parseDouble(record.get("INV1_PRICEAFVAT").replace(",","")));
		line.setSalesPersonCode(record.get("INV1_SLPCODE")==null?null:Integer.parseInt(record.get("INV1_SLPCODE")));
		line.setTaxCode(record.get("INV1_TAXCODE"));
		line.setUnitPrice(record.get("INV1_PRICEBEFDI")==null?null:Double.parseDouble(record.get("INV1_PRICEBEFDI").replace(",","")));
		line.setItemCode(record.get("INV1_ITEMCODE"));
		line.setQuantity(Double.parseDouble(record.get("INV1_QUANTITY")));
		line.setDiscountPercent(Double.parseDouble(record.get("INV1_DISCPRCNT")));
		line.setWarehouseCode(record.get("INV1_WHSCODE"));
		line.setU_PLAZOSUS(record.get("INV1_U_PLAZOSUS"));

		//line.setActualBaseLine(record.get("INV1_BASELINE"));
		if(type.equals(DocumentType.NC)) {
			line.setBaseEntry(isNCOpen ? 0 :Integer.parseInt(record.get("OINV_DOCENTRY")));
			line.setBaseLine(isNCOpen ? "" :record.get("INV1_LINENUM"));
			line.setBaseType(isNCOpen ? 0 :13);
		}

		if(type.equals(DocumentType.FE)) {

		}


		return line;
	}

	private Document setDocumentValues(CSVRecord record,int serie, DocumentType type) throws ParseException {

		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		cal.add(Calendar.MONTH, 1);
		Date todayPlus30Days = cal.getTime();

		Document document;
		document = new Document();
		document.setCardCode(record.get("OINV_CARDCODE"));
		document.setComments(record.get("OINV_COMMENTS"));
		document.setDocCurrency(record.get("OINV_DOCCUR"));
		document.setDocDate(today);
		document.setDocDueDate(todayPlus30Days);
		document.setDocTotal(record.get("OINV_DOCTOTAL")==null?null:Double.parseDouble(record.get("OINV_DOCTOTAL").replace(",","")));
		document.setDocType("dDocument_Items");
		document.setNumAtCard(record.get("OINV_NUMATCARD"));
		document.setReference1(record.get("OINV_REF1"));
		document.setReference2(record.get("OINV_REF2"));
		document.setU_BDOC((record.get("OINV_U_BDOC")) + "-1");
		document.setU_TipoDoc(record.get("OINV_U_TIPODOC"));
		document.setDocObjectCode(type.equals(DocumentType.FE) ? "13" : "14"); 
		document.setU_SCGRMS_Referencia9("Documento origen docuNum 9.2: " + record.get("OINV_DOCNUM"));
		document.setSeries(serie);

		if(type.equals(DocumentType.NC)) {
			document.setU_BDOC(record.get("OINV_DOCNUM"));
		}

		if(type.equals(DocumentType.FE)) {
			document.setReserve("tNO");
			document.setReserveInvoice("tYES");
		}


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
