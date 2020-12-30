package com.hipstertech.service.entities;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BatchNumberObject {


	public Date AddmisionDate;


	public Integer BaseLineNumber;


	public String BatchNumber;


	public Date ExpiryDate;


	public String IntegerernalSerialNumber;


	public String Location;


	public String ManufacturerSerialNumber;


	public Date ManufacturingDate;


	public String Notes;


	public Double Quantity;


	public Integer TrackingNote;


	public Integer TrackingNoteLine;


	public Date getAddmisionDate() {
		return AddmisionDate;
	}


	public void setAddmisionDate(Date addmisionDate) {
		AddmisionDate = addmisionDate;
	}


	public Integer getBaseLineNumber() {
		return BaseLineNumber;
	}


	public void setBaseLineNumber(Integer baseLineNumber) {
		BaseLineNumber = baseLineNumber;
	}


	public String getBatchNumber() {
		return BatchNumber;
	}


	public void setBatchNumber(String batchNumber) {
		BatchNumber = batchNumber;
	}


	public Date getExpiryDate() {
		return ExpiryDate;
	}


	public void setExpiryDate(Date expiryDate) {
		ExpiryDate = expiryDate;
	}


	public String getIntegerernalSerialNumber() {
		return IntegerernalSerialNumber;
	}


	public void setIntegerernalSerialNumber(String IntegerernalSerialNumber) {
		IntegerernalSerialNumber = IntegerernalSerialNumber;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}


	public String getManufacturerSerialNumber() {
		return ManufacturerSerialNumber;
	}


	public void setManufacturerSerialNumber(String manufacturerSerialNumber) {
		ManufacturerSerialNumber = manufacturerSerialNumber;
	}


	public Date getManufacturingDate() {
		return ManufacturingDate;
	}


	public void setManufacturingDate(Date manufacturingDate) {
		ManufacturingDate = manufacturingDate;
	}


	public String getNotes() {
		return Notes;
	}


	public void setNotes(String notes) {
		Notes = notes;
	}


	public Double getQuantity() {
		return Quantity;
	}


	public void setQuantity(Double quantity) {
		Quantity = quantity;
	}


	public Integer getTrackingNote() {
		return TrackingNote;
	}


	public void setTrackingNote(Integer trackingNote) {
		TrackingNote = trackingNote;
	}


	public Integer getTrackingNoteLine() {
		return TrackingNoteLine;
	}


	public void setTrackingNoteLine(Integer trackingNoteLine) {
		TrackingNoteLine = trackingNoteLine;
	}
	
	// GSON library for JSON
	@Override
	public String toString(){
		Gson gson = new GsonBuilder().create();
		return gson.toJson(this);
	}
	

}
