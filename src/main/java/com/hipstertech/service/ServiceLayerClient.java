package com.hipstertech.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class ServiceLayerClient {
	
	@Value("${sap.url}")
	public String url;
	
	@Value("${sap.username}")
	public String username;
	
	@Value("${sap.pwd}")
	public String pwd;
	
	@Value("${sap.bd}")
	public String bd;
	
    private HashMap<String,String> listCookiesLogin;
    
    private RestTemplate restClient;
	
	

}
