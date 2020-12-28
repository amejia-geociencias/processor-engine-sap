package com.hipstertech.service.entities;

public class DocumentLinesBinAllocation {
	
    /// <summary>
    /// Enumeration: BoYesNoEnum. 
    /// </summary>
    
    public String AllowNegativeQuantity;

    
    public int BaseLineNumber;

    
    public int BinAbsEntry;

    
    public double Quantity;

    
    public int SerialAndBatchNumbersBaseLine;


	public String getAllowNegativeQuantity() {
		return AllowNegativeQuantity;
	}


	public void setAllowNegativeQuantity(String allowNegativeQuantity) {
		AllowNegativeQuantity = allowNegativeQuantity;
	}


	public int getBaseLineNumber() {
		return BaseLineNumber;
	}


	public void setBaseLineNumber(int baseLineNumber) {
		BaseLineNumber = baseLineNumber;
	}


	public int getBinAbsEntry() {
		return BinAbsEntry;
	}


	public void setBinAbsEntry(int binAbsEntry) {
		BinAbsEntry = binAbsEntry;
	}


	public double getQuantity() {
		return Quantity;
	}


	public void setQuantity(double quantity) {
		Quantity = quantity;
	}


	public int getSerialAndBatchNumbersBaseLine() {
		return SerialAndBatchNumbersBaseLine;
	}


	public void setSerialAndBatchNumbersBaseLine(int serialAndBatchNumbersBaseLine) {
		SerialAndBatchNumbersBaseLine = serialAndBatchNumbersBaseLine;
	}

    
}
