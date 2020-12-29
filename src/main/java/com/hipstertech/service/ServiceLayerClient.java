package com.hipstertech.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

//import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hipstertech.domain.enumeration.DocumentType;
import com.hipstertech.service.entities.Document;
import com.hipstertech.service.entities.DocumentLines;
import com.hipstertech.service.entities.LoginSAP;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

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
	

	public String getCookie() {
		if (cookie == null || cookie.isEmpty()) {
			login();
		}
		return cookie;
	}


	public void setCookie(String cookie) {
		this.cookie = cookie;
	}


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



	public Document createDocument(Document document, String resource) {
		try {

			String objectToCreate =document.toJson();
			OkHttpClient client = new OkHttpClient().newBuilder()
					.build();
			MediaType mediaType = MediaType.parse("application/json");
			RequestBody body = RequestBody.create(mediaType,objectToCreate);
			Request request = new Request.Builder()
					.url( url + "/" + resource)
					.method("POST", body)
					.addHeader("Content-Type", "application/json")
					.addHeader("Cookie", getCookie() )
					.build();
			ResponseBody responseBody = client.newCall(request).execute().body();
			Document entity = getDocumentFromResponseBodyPost(responseBody.string());
			return entity;
		}catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}

	public Document getDocumentByDocNumber(int docNumber,int serie, DocumentType type) {
		try {
			Document invoiceSAP = getDocumentByDocNumberSAP(docNumber, "Invoices");
			Document documentResult = setDocumentValues(invoiceSAP, serie, type);
			documentResult.setDocumentLines(getLineWithValues(invoiceSAP.getDocumentLines(),type,invoiceSAP.getDocEntry()));
			return documentResult;
		}catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}


	private Document getDocumentByDocNumberSAP(int docNumber, String resource) {
		try {
			OkHttpClient client = new OkHttpClient().newBuilder()
					.build();
			Request request = new Request.Builder()
					.url(url + "/"+  resource + "?$filter=DocNum eq " + docNumber)
					.method("GET", null)
					.addHeader("Content-Type", "application/json")
					.addHeader("Cookie", getCookie())
					.build();
			ResponseBody responseBody = client.newCall(request).execute().body();
			Document entity = getDocumentFromResponseBody(responseBody.string());
			return entity;
		}catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}
	
	private Document getDocumentFromResponseBody(String responseBody) {
		Document document = null;
		JsonObject convertedObject = new Gson().fromJson(responseBody, JsonObject.class);
		document = new Gson().fromJson(convertedObject.getAsJsonArray("value").get(0).toString(),Document.class);
		return document;
	}
	
	private Document getDocumentFromResponseBodyPost(String responseBody) {
		Document document = null;
		JsonObject convertedObject = new Gson().fromJson(responseBody, JsonObject.class);
		document = new Gson().fromJson(convertedObject.toString(),Document.class);
		return document;
	}

	private List<DocumentLines> getLineWithValues(List<DocumentLines>  linesSAP, DocumentType type, int docEntry ) {
		
		List<DocumentLines> resultLines = new ArrayList<DocumentLines>();
		linesSAP.forEach(lineSAP->{
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
			line.setItemCode(lineSAP.getItemCode());
			line.setItemDescription(lineSAP.getItemDescription());
			line.setLineTotal(lineSAP.getLineTotal());
			line.setOpenAmount(lineSAP.getOpenAmount());
			line.setPrice(lineSAP.getPrice());
			line.setPriceAfterVAT(lineSAP.getPriceAfterVAT());
			line.setSalesPersonCode(lineSAP.getSalesPersonCode());
			line.setTaxCode(lineSAP.getTaxCode());
			line.setUnitPrice(lineSAP.getUnitPrice());
			line.setQuantity(lineSAP.getQuantity());
			line.setDiscountPercent(lineSAP.getDiscountPercent());
			//line.setActualBaseLine(lineSAP.getActualBaseLine());
			
			if(type.equals(DocumentType.FE)) {
				
			}
			
			if(type.equals(DocumentType.NC)) {
				line.setBaseEntry(docEntry);
				line.setBaseLine(lineSAP.getLineNum()+"");
				line.setBaseType(13);
				line.setWarehouseCode(lineSAP.getWarehouseCode());
			}
			
			resultLines.add(line);
		});
		
		return resultLines;
	}

	private Document setDocumentValues(Document invoiceSAP,int serie, DocumentType type) throws ParseException {
		
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		cal.add(Calendar.MONTH, 1);
		Date todayPlus30Days = cal.getTime();
		
		Document invoiceResult = new Document();
		invoiceResult.setCardCode(invoiceSAP.getCardCode());
		invoiceResult.setComments(invoiceSAP.getComments());
		invoiceResult.setDocDate(today);
		invoiceResult.setDocDueDate(todayPlus30Days);
		invoiceResult.setDocCurrency(invoiceSAP.getDocCurrency());
		invoiceResult.setDocTotal(invoiceSAP.getDocTotal());
		invoiceResult.setDocType(invoiceSAP.getDocType());
		invoiceResult.setNumAtCard(invoiceSAP.getNumAtCard());
		invoiceResult.setReference1(invoiceSAP.getReference1());
		invoiceResult.setReference2(invoiceSAP.getReference2());
		invoiceResult.setU_BDOC(invoiceSAP.getU_BDOC());
		invoiceResult.setU_FormPag(invoiceSAP.getU_FormPag());
		invoiceResult.setU_NAR(invoiceSAP.getU_NAR());
		invoiceResult.setU_NCA(invoiceSAP.getU_NCA());
		invoiceResult.setU_NNE(invoiceSAP.getU_NNE());
		invoiceResult.setU_NPR(invoiceSAP.getU_NPR());
		invoiceResult.setU_NSP(invoiceSAP.getU_NSP());
		invoiceResult.setU_TipoDoc(invoiceSAP.getU_TipoDoc());
		invoiceResult.setDocObjectCode(type.equals(DocumentType.FE) ? "13" : "14");
		//invoiceResult.setIssuingReason(invoiceSAP.getIssuingReason());
		//invoiceResult.setRelatedType(invoiceSAP.getRelatedType());
		//invoiceResult.setU_GTI_MOTIVOS(invoiceSAP.getU_GTI_MOTIVOS());
		//invoiceResult.setU_TipoExon(invoiceSAP.getU_TipoExon());
		invoiceResult.setSeries(serie);
		if(type.equals(DocumentType.NC)) {
			invoiceResult.setU_BDOC(invoiceSAP.getDocNum()+"");
		}
		
		if(type.equals(DocumentType.FE)) {
			invoiceResult.setReserve(invoiceSAP.getReserve());
			invoiceResult.setReserveInvoice(invoiceSAP.getReserveInvoice());
		}
		return invoiceResult;
	}


}
