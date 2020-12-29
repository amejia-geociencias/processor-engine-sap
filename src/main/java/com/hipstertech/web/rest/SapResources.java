package com.hipstertech.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hipstertech.service.RunService;

@RestController
@RequestMapping("/api")
public class SapResources {
	
	@Autowired
	RunService RunServiceImpl;
	
    @PostMapping("/sap/run/{id}")
    public void getLogin(@PathVariable Long id) {
    	RunServiceImpl.run(id);
    }
}
