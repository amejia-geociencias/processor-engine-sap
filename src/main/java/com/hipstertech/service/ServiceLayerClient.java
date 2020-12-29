package com.hipstertech.service;

import java.text.ParseException;

import org.apache.commons.csv.CSVRecord;
//import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hipstertech.service.entities.Document;
import com.hipstertech.service.entities.DocumentLines;
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

	public Document GetInvoice(int docNumber,int serie) {
		try {
			Document invoiceSAP = GetSAPDocument(docNumber, "Invoices");
			Document documentResult = setDocumentValues(invoiceSAP, serie);


			return null;

		}catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}


	private Document GetSAPDocument(int docNumber, String resource) {
		try {
			OkHttpClient client = new OkHttpClient().newBuilder()
					.build();
			Request request = new Request.Builder()
					.url(url + "/"+  resource + "?$filter=DocNum eq " + docNumber)
					.method("GET", null)
					.addHeader("Content-Type", "application/json")
					.addHeader("Cookie", cookie)
					.build();
			Response response = client.newCall(request).execute();
			Gson gson = new GsonBuilder().serializeNulls().create();
			Document entity = gson.fromJson(response.toString(), Document.class);
			return entity;
		}catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}

	private DocumentLines getLineWithValues(DocumentLines lineSAP) {
		DocumentLines line = new DocumentLines();
		line.setAccountCode(lineSAP.getAccountCode());
		line.setCOGSCostingCode(lineSAP.getCOGSCostingCode());
		line.setCOGSCostingCode2(lineSAP.getCOGSCostingCode2());
		line.setCOGSCostingCode3(lineSAP.getCOGSCostingCode3());
		line.setCOGSCostingCode4(lineSAP.getCOGSCostingCode4());
		line.setCOGSCostingCode5(lineSAP.getCOGSCostingCode5());
		line.setCostingCode(lineSAP.getCostingCode());
		line.setCostingCode2(lineSAP.getCostingCode2());
		line.setCostingCode3(lineSAP.getCostingCode3());
		line.setCostingCode4(lineSAP.getCostingCode4());
		line.setCostingCode5(lineSAP.getCostingCode5());
		line.setCurrency(lineSAP.getCurrency());
		line.setItemDescription(lineSAP.getItemDescription());
		line.setLineTotal(lineSAP.getLineTotal());
		line.setOpenAmount(lineSAP.getOpenAmount());
		line.setPrice(lineSAP.getPrice());
		line.setPriceAfterVAT(lineSAP.getPriceAfterVAT());
		line.setSalesPersonCode(lineSAP.getSalesPersonCode());
		line.setTaxCode(lineSAP.getTaxCode());
		line.setUnitPrice(lineSAP.getUnitPrice());
		return line;
	}

	private Document setDocumentValues(Document invoiceSAP,int serie) throws ParseException {
		Document invoiceResult = new Document();
		invoiceResult.setCardCode(invoiceSAP.getCardCode());
		invoiceResult.setComments(invoiceSAP.getComments());
		invoiceResult.setDocCurrency(invoiceSAP.getDocCurrency());
		invoiceResult.setDocTotal(invoiceSAP.getDocTotal());
		invoiceResult.setDocType(invoiceSAP.getDocType());
		invoiceResult.setNumAtCard(invoiceSAP.getNumAtCard());
		invoiceResult.setReference1(invoiceSAP.getReference1());
		invoiceResult.setReference2(invoiceSAP.getReference2());
		invoiceResult.setReserve(invoiceSAP.getReserve());
		invoiceResult.setReserveInvoice(invoiceSAP.getReserveInvoice());
		invoiceResult.setU_BDOC(invoiceSAP.getU_BDOC());
		invoiceResult.setU_FormPag(invoiceSAP.getU_FormPag());
		invoiceResult.setU_NAR(invoiceSAP.getU_NAR());
		invoiceResult.setU_NCA(invoiceSAP.getU_NCA());
		invoiceResult.setU_NNE(invoiceSAP.getU_NNE());
		invoiceResult.setU_NPR(invoiceSAP.getU_NPR());
		invoiceResult.setU_NSP(invoiceSAP.getU_NSP());
		invoiceResult.setSeries(serie);
		return invoiceResult;
	}


}
