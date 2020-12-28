package com.hipstertech.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hipstertech.service.ServiceLayerClient;

@RestController
@RequestMapping("/api")
public class SapResources {
	
	@Autowired
	ServiceLayerClient serviceLayerClient;
	
    @GetMapping("/sap/login")
    public void getLogin() {
        serviceLayerClient.login();
    }

}
