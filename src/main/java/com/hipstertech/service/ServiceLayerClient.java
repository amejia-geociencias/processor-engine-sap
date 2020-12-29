package com.hipstertech.service;

//import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hipstertech.service.entities.Document;
import com.hipstertech.service.entities.LoginSAP;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

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

	private String cookie = null;


	public ServiceLayerClient () {
		if(cookie == null)
			login();
	}


	public void login() {
		try {
			cookie = "";
			LoginSAP loginObject = new LoginSAP();
			loginObject.setUserName(username);
			loginObject.setPassword(pwd);
			loginObject.setCompanyDB(bd);

			OkHttpClient client = new OkHttpClient().newBuilder()
					.build();
			MediaType mediaType = MediaType.parse("text/plain");
			RequestBody body = RequestBody.create(mediaType, loginObject.toString());
			Request request = new Request.Builder()
					.url(url + "/Login")
					.method("POST", body)
					.addHeader("Content-Type", "text/plain")
					.build();
			Response response = client.newCall(request).execute();	
			for(int i = 0; i < response.headers().size(); i++) {
				String headerName = response.headers().name(i);
				if(headerName.equals("Set-Cookie")) {
					String headerValue = response.headers().value(i);
					if(headerValue.contains("B1SESSION") || headerValue.contains("CompanyDB")) {
						String [] cookies = headerValue.split("=");
						cookie = cookie + " " + cookies[0] + "=" + cookies[1];
					}
				}
			}
			cookie = cookie.replace(";HttpOnly", "");
			cookie = cookie.substring(0,cookie.length()-1);

		}catch(Exception ex){
			log.error(ex.getMessage());
		}
	}

	public boolean CreateDocument(Document document, String resource) {
		try {

			OkHttpClient client = new OkHttpClient().newBuilder()
					.build();
			MediaType mediaType = MediaType.parse("application/json");
			RequestBody body = RequestBody.create(mediaType,document.toString());
			Request request = new Request.Builder()
					.url( url + "/" + resource)
					.method("POST", body)
					.addHeader("Content-Type", "application/json")
					.addHeader("Cookie", cookie)
					//.addHeader("Cookie", "CompanyDB=ZTESTGN; B1SESSION=3b58900a-495f-11eb-8000-026956b68215")
					.build();
			Response response = client.newCall(request).execute();


			return true;
		}catch (Exception e) {
			log.error(e.getMessage());
			return false;
		}

	}
	






}
