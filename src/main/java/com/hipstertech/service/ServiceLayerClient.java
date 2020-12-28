package com.hipstertech.service;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Scope("singleton")
public class ServiceLayerClient {

	private final Logger log = LoggerFactory.getLogger(ServiceLayerClient.class);

	@Value("${sap.url}")
	public String url;

	@Value("${sap.username}")
	public String username;

	@Value("${sap.pwd}")
	public String pwd;

	@Value("${sap.bd}")
	public String bd;

	private HashMap<String,String> listCookiesLogin;


	public ServiceLayerClient () {

	}


	public void login() {
		try {
			
			String urlLogin = url + "/Login";
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			JSONObject loginJsonObject = new JSONObject();
			loginJsonObject.put("UserName", username);
			loginJsonObject.put("Password", pwd);
			loginJsonObject.put("CompanyDB", bd);
			ResponseEntity<String> responseString = restTemplate.postForEntity(urlLogin, loginJsonObject, String.class);
			System.out.print(responseString);
			
		}catch(Exception ex){
			log.error(ex.getMessage());
		}
	}



}
