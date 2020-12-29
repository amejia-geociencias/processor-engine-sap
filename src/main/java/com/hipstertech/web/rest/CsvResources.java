package com.hipstertech.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hipstertech.service.CsvReaderService;

@RestController
@RequestMapping("/api")
public class CsvResources {

	@Autowired
	CsvReaderService csvReaderService;
	
	@GetMapping("/csv-get-doc/{docNum}/{serie}")
	public void getDoc(@PathVariable int docNum,@PathVariable  int serie) {
		csvReaderService.getDocumentByDocNumber(docNum, serie);
	}
	
}
