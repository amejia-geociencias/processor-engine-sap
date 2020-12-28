package com.hipstertech.service;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hipstertech.service.entities.Document;
import com.hipstertech.service.entities.DocumentLines;

@Service
public class CsvReaderService {
	private final Logger log = LoggerFactory.getLogger(CsvReaderService.class);
	
	public Document getDocumentByDocNumber(String docNumber) {
		Document document=null;
		try {
			List<DocumentLines> lines = new ArrayList<DocumentLines>();
			Iterable<CSVRecord> csvRecords = parseFile();
			for(CSVRecord record : csvRecords) {
				if(record.get("OINV_DOCNUM").equals(docNumber)) {
					if(document==null) {
						document = new Document();
						document.setDocNum(Integer.parseInt(record.get("OINV_DOCNUM")));
						//add pending document items
					}
					DocumentLines line = new DocumentLines();
					line.AccountCode=record.get("INV1_COGSOCRCOD");
					//add p
					lines.add(line);
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
	
	private Iterable<CSVRecord> parseFile() throws IOException{
		Reader csvFile;
		Iterable<CSVRecord> csvRecords;
		csvFile = new FileReader("D:\\Users\\riverad\\Downloads\\InvoicesDuplicated.csv");
		csvRecords = CSVFormat.DEFAULT.withDelimiter(';').withFirstRecordAsHeader().withTrim().parse(csvFile);
		return csvRecords;
	}
	      
}
