package com.hipstertech.service.entities;

import java.io.Serializable;

import com.google.gson.Gson;

public class LoginSAP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String UserName;
	private String Password;
	private String CompanyDB;
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getCompanyDB() {
		return CompanyDB;
	}
	public void setCompanyDB(String companyDB) {
		CompanyDB = companyDB;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// GSON library for JSON
	@Override
	public String toString(){
	    return new Gson().toJson(this);
	}
	
	

}
