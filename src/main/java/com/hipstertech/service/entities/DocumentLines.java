package com.hipstertech.service.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DocumentLines implements Serializable {


	public String AccountCode ;


	public Integer ActualBaseEntry ;


	public String ActualBaseLine;


	public Date ActualDeliveryDate ;


	public String Address ;


	public Integer AgreementNo ;


	public Integer AgreementRowNumber ;


	public Double AppliedTax ;


	public Double AppliedTaxFC ;


	public Double AppliedTaxSC ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String BackOrder ;


	public String BarCode ;


	public Integer BaseEntry ;


	public String BaseLine;


	public Double BaseOpenQuantity ;


	public Integer BaseType ;


	public List<BatchNumberObject> BatchNumbers ;


	public String CFOPCode ;


	public String ChangeAssemlyBoMWarehouse ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String ChangeInventoryQuantityIndependently ;


	public String COGSAccountCode ;


	public String COGSCostingCode ;


	public String COGSCostingCode2 ;


	public String COGSCostingCode3 ;


	public String COGSCostingCode4 ;


	public String COGSCostingCode5 ;


	public Double CommisionPercent ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String ConsiderQuantity ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String ConsumerSalesForecast ;

	/// <summary>
	/// Enumeration: BoCorInvItemStatus. 
	/// </summary>

	public String CorrectionInvoiceItem ;


	public Double CorrInvAmountToDiffAcct ;


	public Double CorrInvAmountToStock ;


	public String CostingCode ;


	public String CostingCode2 ;


	public String CostingCode3 ;


	public String CostingCode4 ;


	public String CostingCode5 ;


	public String CountryOrg ;


	public String CreditOriginCode ;


	public String CSTCode ;


	public String CSTforCOFINS ;


	public String CSTforIPI ;


	public String CSTforPIS ;


	public String Currency ;


	public Double DefectAndBreakup ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String DeferredTax ;


	public Double DiscountPercent ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String DistributeExpense ;


	public Integer DocEntry ;


	public List<DocumentLineAdditionalExpense> DocumentLineAdditionalExpenses ;


	public List<DocumentLinesBinAllocation> DocumentLinesBinAllocations ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String EnableReturnCost ;


	public Double EqualizationTaxPercent ;


	public Double ExciseAmount ;


	public String ExLineNo ;


	public Double Factor1 ;


	public Double Factor2 ;


	public Double Factor3 ;


	public Double Factor4 ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String FreeOfChargeBP ;


	public String FreeText ;


	public Integer GrossBase ;


	public Double GrossBuyPrice ;


	public Double GrossProfitTotalBasePrice ;


	public Double Height1 ;


	public Double Height2 ;


	public Integer Height2Unit ;


	public Integer Hight1Unit ;


	public Integer Incoterms ;


	public Double InventoryQuantity ;


	public String ItemCode ;


	public String ItemDescription ;


	public String ItemDetails ;

	/// <summary>
	/// Enumeration: BoDocItemType. 
	/// </summary>

	public String ItemType ;


	public Double LastBuyDistributeSum ;


	public Double LastBuyDistributeSumFc ;


	public Double LastBuyDistributeSumSc ;


	public Double LastBuyInmPrice ;


	public Double Lengh1 ;


	public Integer Lengh1Unit ;


	public Double Lengh2 ;


	public Integer Lengh2Unit ;


	public Integer LineNum ;

	/// <summary>
	/// Enumeration: BoStatus. 
	/// </summary>

	public String LineStatus ;


	public List<LineTaxJurisdiction> LineTaxJurisdictions ;


	public Double LineTotal ;

	/// <summary>
	/// Enumeration: BoDocLineType. 
	/// </summary>

	public String LineType ;


	public String LineVendor ;


	public Integer LocationCode ;


	public String MeasureUnit ;


	public Double NetTaxAmount ;


	public Double NetTaxAmountFC ;


	public Double NetTaxAmountSC ;


	public Double OpenAmount ;


	public Double OpenAmountFC ;


	public Double OpenAmountSC ;


	public String OriginalItem ;


	public Double PackageQuantity ;


	public Integer ParentLineNum ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String PartialRetirement ;


	public Integer PickListIdNumber ;


	public Double PickQuantity ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String PickStatus ;

	/// <summary>
	/// Enumeration: BoDocumentLinePickStatus. 
	/// </summary>

	public String PickStatusEx ;


	public String POTargetEntry ;


	public Integer POTargetNum ;


	public Integer POTargetRowNum ;


	public Double Price ;


	public Double PriceAfterVAT ;


	public String ProjectCode ;


	public Double Quantity ;


	public Double Rate ;


	public Double RemainingOpenInventoryQuantity ;


	public Double RemainingOpenQuantity ;


	public Date RequiredDate ;


	public Double RequiredQuantity ;


	public Double RetirementAPC ;


	public Double RetirementQuantity ;


	public Double ReturnCost ;


	public Double RowTotalFC ;


	public Double RowTotalSC ;


	public Integer SalesPersonCode ;


	public String SerialNum ;


	public List<SerialNumber> SerialNumbers ;


	public Date ShipDate ;


	public Integer ShippingMethod ;


	public String ShipToCode ;


	public String ShipToDescription ;


	public Double Shortages ;


	public Double StockDistributesum ;


	public Double StockDistributesumForeign ;


	public Double StockDistributesumSystem ;


	public Double StockInmPrice ;


	public String SupplierCatNum ;


	public Double Surpluses ;


	public String SWW ;


	public Double TaxBeforeDPM ;


	public Double TaxBeforeDPMFC ;


	public Double TaxBeforeDPMSC ;


	public String TaxCode ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String TaxLiable ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String TaxOnly ;


	public Double TaxPercentagePerRow ;


	public Double TaxPerUnit ;


	public Double TaxTotal ;

	/// <summary>
	/// Enumeration: BoTaxTypes. 
	/// </summary>

	public String TaxType ;


	public String Text ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String ThirdParty ;


	public Double TotalEqualizationTax ;


	public Double TotalEqualizationTaxFC ;


	public Double TotalEqualizationTaxSC ;


	public Double TotalInclTax ;

	/// <summary>
	/// Enumeration: BoTransactionTypeEnum. 
	/// </summary>

	public String TransactionType ;


	public Integer TransportMode ;

	/// <summary>
	/// Enumeration: BoItemTreeTypes. 
	/// </summary>

	public String TreeType ;


	public String U_CODEMP ;


	public String U_CODPRO ;


	public String U_CODSECC ;


	public String U_LineId ;


	public Double U_SCGCOM_GANac ;


	public String U_ZonaPre ;


	public Double UnitPrice ;


	public Double UnitsOfMeasurment ;


	public String UoMCode ;


	public Integer UoMEntry ;


	public Integer Usage ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String UseBaseUnits ;


	public String VatGroup ;


	public String VendorNum ;


	public Integer VisualOrder ;


	public Double Volume ;


	public Integer VolumeUnit ;


	public String WarehouseCode ;


	public Double Weight1 ;


	public Integer Weight1Unit ;


	public Double Weight2 ;


	public Integer Weight2Unit ;


	public Double Width1 ;


	public Integer Width1Unit ;


	public Double Width2 ;


	public Integer Width2Unit ;


	public List<WithholdingTaxLine> WithholdingTaxLines ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String WithoutInventoryMovement ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String WTLiable ;
	
	public String U_PLAZOSUS;
	
	public String getU_PLAZOSUS() {
		return U_PLAZOSUS;
	}

	public void setU_PLAZOSUS(String u_PLAZOSUS) {
		U_PLAZOSUS = u_PLAZOSUS;
	}


	public String getAccountCode() {
		return AccountCode;
	}

	public void setAccountCode(String accountCode) {
		AccountCode = accountCode;
	}

	public Integer getActualBaseEntry() {
		return ActualBaseEntry;
	}

	public void setActualBaseEntry(Integer actualBaseEntry) {
		ActualBaseEntry = actualBaseEntry;
	}

	public String getActualBaseLine() {
		return ActualBaseLine;
	}

	public void setActualBaseLine(String actualBaseLine) {
		ActualBaseLine = actualBaseLine;
	}

	public Date getActualDeliveryDate() {
		return ActualDeliveryDate;
	}

	public void setActualDeliveryDate(Date actualDeliveryDate) {
		ActualDeliveryDate = actualDeliveryDate;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Integer getAgreementNo() {
		return AgreementNo;
	}

	public void setAgreementNo(Integer agreementNo) {
		AgreementNo = agreementNo;
	}

	public Integer getAgreementRowNumber() {
		return AgreementRowNumber;
	}

	public void setAgreementRowNumber(Integer agreementRowNumber) {
		AgreementRowNumber = agreementRowNumber;
	}

	public Double getAppliedTax() {
		return AppliedTax;
	}

	public void setAppliedTax(Double appliedTax) {
		AppliedTax = appliedTax;
	}

	public Double getAppliedTaxFC() {
		return AppliedTaxFC;
	}

	public void setAppliedTaxFC(Double appliedTaxFC) {
		AppliedTaxFC = appliedTaxFC;
	}

	public Double getAppliedTaxSC() {
		return AppliedTaxSC;
	}

	public void setAppliedTaxSC(Double appliedTaxSC) {
		AppliedTaxSC = appliedTaxSC;
	}

	public String getBackOrder() {
		return BackOrder;
	}

	public void setBackOrder(String backOrder) {
		BackOrder = backOrder;
	}

	public String getBarCode() {
		return BarCode;
	}

	public void setBarCode(String barCode) {
		BarCode = barCode;
	}

	public Integer getBaseEntry() {
		return BaseEntry;
	}

	public void setBaseEntry(Integer baseEntry) {
		BaseEntry = baseEntry;
	}

	public String getBaseLine() {
		return BaseLine;
	}

	public void setBaseLine(String baseLine) {
		BaseLine = baseLine;
	}

	public Double getBaseOpenQuantity() {
		return BaseOpenQuantity;
	}

	public void setBaseOpenQuantity(Double baseOpenQuantity) {
		BaseOpenQuantity = baseOpenQuantity;
	}

	public Integer getBaseType() {
		return BaseType;
	}

	public void setBaseType(Integer baseType) {
		BaseType = baseType;
	}

	public List<BatchNumberObject> getBatchNumbers() {
		return BatchNumbers;
	}

	public void setBatchNumbers(List<BatchNumberObject> batchNumbers) {
		BatchNumbers = batchNumbers;
	}

	public String getCFOPCode() {
		return CFOPCode;
	}

	public void setCFOPCode(String cFOPCode) {
		CFOPCode = cFOPCode;
	}

	public String getChangeAssemlyBoMWarehouse() {
		return ChangeAssemlyBoMWarehouse;
	}

	public void setChangeAssemlyBoMWarehouse(String changeAssemlyBoMWarehouse) {
		ChangeAssemlyBoMWarehouse = changeAssemlyBoMWarehouse;
	}

	public String getChangeInventoryQuantityIndependently() {
		return ChangeInventoryQuantityIndependently;
	}

	public void setChangeInventoryQuantityIndependently(String changeInventoryQuantityIndependently) {
		ChangeInventoryQuantityIndependently = changeInventoryQuantityIndependently;
	}

	public String getCOGSAccountCode() {
		return COGSAccountCode;
	}

	public void setCOGSAccountCode(String cOGSAccountCode) {
		COGSAccountCode = cOGSAccountCode;
	}

	public String getCOGSCostingCode() {
		return COGSCostingCode;
	}

	public void setCOGSCostingCode(String cOGSCostingCode) {
		COGSCostingCode = cOGSCostingCode;
	}

	public String getCOGSCostingCode2() {
		return COGSCostingCode2;
	}

	public void setCOGSCostingCode2(String cOGSCostingCode2) {
		COGSCostingCode2 = cOGSCostingCode2;
	}

	public String getCOGSCostingCode3() {
		return COGSCostingCode3;
	}

	public void setCOGSCostingCode3(String cOGSCostingCode3) {
		COGSCostingCode3 = cOGSCostingCode3;
	}

	public String getCOGSCostingCode4() {
		return COGSCostingCode4;
	}

	public void setCOGSCostingCode4(String cOGSCostingCode4) {
		COGSCostingCode4 = cOGSCostingCode4;
	}

	public String getCOGSCostingCode5() {
		return COGSCostingCode5;
	}

	public void setCOGSCostingCode5(String cOGSCostingCode5) {
		COGSCostingCode5 = cOGSCostingCode5;
	}

	public Double getCommisionPercent() {
		return CommisionPercent;
	}

	public void setCommisionPercent(Double commisionPercent) {
		CommisionPercent = commisionPercent;
	}

	public String getConsiderQuantity() {
		return ConsiderQuantity;
	}

	public void setConsiderQuantity(String considerQuantity) {
		ConsiderQuantity = considerQuantity;
	}

	public String getConsumerSalesForecast() {
		return ConsumerSalesForecast;
	}

	public void setConsumerSalesForecast(String consumerSalesForecast) {
		ConsumerSalesForecast = consumerSalesForecast;
	}

	public String getCorrectionInvoiceItem() {
		return CorrectionInvoiceItem;
	}

	public void setCorrectionInvoiceItem(String correctionInvoiceItem) {
		CorrectionInvoiceItem = correctionInvoiceItem;
	}

	public Double getCorrInvAmountToDiffAcct() {
		return CorrInvAmountToDiffAcct;
	}

	public void setCorrInvAmountToDiffAcct(Double corrInvAmountToDiffAcct) {
		CorrInvAmountToDiffAcct = corrInvAmountToDiffAcct;
	}

	public Double getCorrInvAmountToStock() {
		return CorrInvAmountToStock;
	}

	public void setCorrInvAmountToStock(Double corrInvAmountToStock) {
		CorrInvAmountToStock = corrInvAmountToStock;
	}

	public String getCostingCode() {
		return CostingCode;
	}

	public void setCostingCode(String costingCode) {
		CostingCode = costingCode;
	}

	public String getCostingCode2() {
		return CostingCode2;
	}

	public void setCostingCode2(String costingCode2) {
		CostingCode2 = costingCode2;
	}

	public String getCostingCode3() {
		return CostingCode3;
	}

	public void setCostingCode3(String costingCode3) {
		CostingCode3 = costingCode3;
	}

	public String getCostingCode4() {
		return CostingCode4;
	}

	public void setCostingCode4(String costingCode4) {
		CostingCode4 = costingCode4;
	}

	public String getCostingCode5() {
		return CostingCode5;
	}

	public void setCostingCode5(String costingCode5) {
		CostingCode5 = costingCode5;
	}

	public String getCountryOrg() {
		return CountryOrg;
	}

	public void setCountryOrg(String countryOrg) {
		CountryOrg = countryOrg;
	}

	public String getCreditOriginCode() {
		return CreditOriginCode;
	}

	public void setCreditOriginCode(String creditOriginCode) {
		CreditOriginCode = creditOriginCode;
	}

	public String getCSTCode() {
		return CSTCode;
	}

	public void setCSTCode(String cSTCode) {
		CSTCode = cSTCode;
	}

	public String getCSTforCOFINS() {
		return CSTforCOFINS;
	}

	public void setCSTforCOFINS(String cSTforCOFINS) {
		CSTforCOFINS = cSTforCOFINS;
	}

	public String getCSTforIPI() {
		return CSTforIPI;
	}

	public void setCSTforIPI(String cSTforIPI) {
		CSTforIPI = cSTforIPI;
	}

	public String getCSTforPIS() {
		return CSTforPIS;
	}

	public void setCSTforPIS(String cSTforPIS) {
		CSTforPIS = cSTforPIS;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public Double getDefectAndBreakup() {
		return DefectAndBreakup;
	}

	public void setDefectAndBreakup(Double defectAndBreakup) {
		DefectAndBreakup = defectAndBreakup;
	}

	public String getDeferredTax() {
		return DeferredTax;
	}

	public void setDeferredTax(String deferredTax) {
		DeferredTax = deferredTax;
	}

	public Double getDiscountPercent() {
		return DiscountPercent;
	}

	public void setDiscountPercent(Double discountPercent) {
		DiscountPercent = discountPercent;
	}

	public String getDistributeExpense() {
		return DistributeExpense;
	}

	public void setDistributeExpense(String distributeExpense) {
		DistributeExpense = distributeExpense;
	}

	public Integer getDocEntry() {
		return DocEntry;
	}

	public void setDocEntry(Integer docEntry) {
		DocEntry = docEntry;
	}

	public List<DocumentLineAdditionalExpense> getDocumentLineAdditionalExpenses() {
		return DocumentLineAdditionalExpenses;
	}

	public void setDocumentLineAdditionalExpenses(List<DocumentLineAdditionalExpense> documentLineAdditionalExpenses) {
		DocumentLineAdditionalExpenses = documentLineAdditionalExpenses;
	}

	public List<DocumentLinesBinAllocation> getDocumentLinesBinAllocations() {
		return DocumentLinesBinAllocations;
	}

	public void setDocumentLinesBinAllocations(List<DocumentLinesBinAllocation> documentLinesBinAllocations) {
		DocumentLinesBinAllocations = documentLinesBinAllocations;
	}

	public String getEnableReturnCost() {
		return EnableReturnCost;
	}

	public void setEnableReturnCost(String enableReturnCost) {
		EnableReturnCost = enableReturnCost;
	}

	public Double getEqualizationTaxPercent() {
		return EqualizationTaxPercent;
	}

	public void setEqualizationTaxPercent(Double equalizationTaxPercent) {
		EqualizationTaxPercent = equalizationTaxPercent;
	}

	public Double getExciseAmount() {
		return ExciseAmount;
	}

	public void setExciseAmount(Double exciseAmount) {
		ExciseAmount = exciseAmount;
	}

	public String getExLineNo() {
		return ExLineNo;
	}

	public void setExLineNo(String exLineNo) {
		ExLineNo = exLineNo;
	}

	public Double getFactor1() {
		return Factor1;
	}

	public void setFactor1(Double factor1) {
		Factor1 = factor1;
	}

	public Double getFactor2() {
		return Factor2;
	}

	public void setFactor2(Double factor2) {
		Factor2 = factor2;
	}

	public Double getFactor3() {
		return Factor3;
	}

	public void setFactor3(Double factor3) {
		Factor3 = factor3;
	}

	public Double getFactor4() {
		return Factor4;
	}

	public void setFactor4(Double factor4) {
		Factor4 = factor4;
	}

	public String getFreeOfChargeBP() {
		return FreeOfChargeBP;
	}

	public void setFreeOfChargeBP(String freeOfChargeBP) {
		FreeOfChargeBP = freeOfChargeBP;
	}

	public String getFreeText() {
		return FreeText;
	}

	public void setFreeText(String freeText) {
		FreeText = freeText;
	}

	public Integer getGrossBase() {
		return GrossBase;
	}

	public void setGrossBase(Integer grossBase) {
		GrossBase = grossBase;
	}

	public Double getGrossBuyPrice() {
		return GrossBuyPrice;
	}

	public void setGrossBuyPrice(Double grossBuyPrice) {
		GrossBuyPrice = grossBuyPrice;
	}

	public Double getGrossProfitTotalBasePrice() {
		return GrossProfitTotalBasePrice;
	}

	public void setGrossProfitTotalBasePrice(Double grossProfitTotalBasePrice) {
		GrossProfitTotalBasePrice = grossProfitTotalBasePrice;
	}

	public Double getHeight1() {
		return Height1;
	}

	public void setHeight1(Double height1) {
		Height1 = height1;
	}

	public Double getHeight2() {
		return Height2;
	}

	public void setHeight2(Double height2) {
		Height2 = height2;
	}

	public Integer getHeight2Unit() {
		return Height2Unit;
	}

	public void setHeight2Unit(Integer height2Unit) {
		Height2Unit = height2Unit;
	}

	public Integer getHight1Unit() {
		return Hight1Unit;
	}

	public void setHight1Unit(Integer hight1Unit) {
		Hight1Unit = hight1Unit;
	}

	public Integer getIncoterms() {
		return Incoterms;
	}

	public void setIncoterms(Integer incoterms) {
		Incoterms = incoterms;
	}

	public Double getInventoryQuantity() {
		return InventoryQuantity;
	}

	public void setInventoryQuantity(Double inventoryQuantity) {
		InventoryQuantity = inventoryQuantity;
	}

	public String getItemCode() {
		return ItemCode;
	}

	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}

	public String getItemDescription() {
		return ItemDescription;
	}

	public void setItemDescription(String itemDescription) {
		ItemDescription = itemDescription;
	}

	public String getItemDetails() {
		return ItemDetails;
	}

	public void setItemDetails(String itemDetails) {
		ItemDetails = itemDetails;
	}

	public String getItemType() {
		return ItemType;
	}

	public void setItemType(String itemType) {
		ItemType = itemType;
	}

	public Double getLastBuyDistributeSum() {
		return LastBuyDistributeSum;
	}

	public void setLastBuyDistributeSum(Double lastBuyDistributeSum) {
		LastBuyDistributeSum = lastBuyDistributeSum;
	}

	public Double getLastBuyDistributeSumFc() {
		return LastBuyDistributeSumFc;
	}

	public void setLastBuyDistributeSumFc(Double lastBuyDistributeSumFc) {
		LastBuyDistributeSumFc = lastBuyDistributeSumFc;
	}

	public Double getLastBuyDistributeSumSc() {
		return LastBuyDistributeSumSc;
	}

	public void setLastBuyDistributeSumSc(Double lastBuyDistributeSumSc) {
		LastBuyDistributeSumSc = lastBuyDistributeSumSc;
	}

	public Double getLastBuyInmPrice() {
		return LastBuyInmPrice;
	}

	public void setLastBuyInmPrice(Double lastBuyInmPrice) {
		LastBuyInmPrice = lastBuyInmPrice;
	}

	public Double getLengh1() {
		return Lengh1;
	}

	public void setLengh1(Double lengh1) {
		Lengh1 = lengh1;
	}

	public Integer getLengh1Unit() {
		return Lengh1Unit;
	}

	public void setLengh1Unit(Integer lengh1Unit) {
		Lengh1Unit = lengh1Unit;
	}

	public Double getLengh2() {
		return Lengh2;
	}

	public void setLengh2(Double lengh2) {
		Lengh2 = lengh2;
	}

	public Integer getLengh2Unit() {
		return Lengh2Unit;
	}

	public void setLengh2Unit(Integer lengh2Unit) {
		Lengh2Unit = lengh2Unit;
	}

	public Integer getLineNum() {
		return LineNum;
	}

	public void setLineNum(Integer lineNum) {
		LineNum = lineNum;
	}

	public String getLineStatus() {
		return LineStatus;
	}

	public void setLineStatus(String lineStatus) {
		LineStatus = lineStatus;
	}

	public List<LineTaxJurisdiction> getLineTaxJurisdictions() {
		return LineTaxJurisdictions;
	}

	public void setLineTaxJurisdictions(List<LineTaxJurisdiction> lineTaxJurisdictions) {
		LineTaxJurisdictions = lineTaxJurisdictions;
	}

	public Double getLineTotal() {
		return LineTotal;
	}

	public void setLineTotal(Double lineTotal) {
		LineTotal = lineTotal;
	}

	public String getLineType() {
		return LineType;
	}

	public void setLineType(String lineType) {
		LineType = lineType;
	}

	public String getLineVendor() {
		return LineVendor;
	}

	public void setLineVendor(String lineVendor) {
		LineVendor = lineVendor;
	}

	public Integer getLocationCode() {
		return LocationCode;
	}

	public void setLocationCode(Integer locationCode) {
		LocationCode = locationCode;
	}

	public String getMeasureUnit() {
		return MeasureUnit;
	}

	public void setMeasureUnit(String measureUnit) {
		MeasureUnit = measureUnit;
	}

	public Double getNetTaxAmount() {
		return NetTaxAmount;
	}

	public void setNetTaxAmount(Double netTaxAmount) {
		NetTaxAmount = netTaxAmount;
	}

	public Double getNetTaxAmountFC() {
		return NetTaxAmountFC;
	}

	public void setNetTaxAmountFC(Double netTaxAmountFC) {
		NetTaxAmountFC = netTaxAmountFC;
	}

	public Double getNetTaxAmountSC() {
		return NetTaxAmountSC;
	}

	public void setNetTaxAmountSC(Double netTaxAmountSC) {
		NetTaxAmountSC = netTaxAmountSC;
	}

	public Double getOpenAmount() {
		return OpenAmount;
	}

	public void setOpenAmount(Double openAmount) {
		OpenAmount = openAmount;
	}

	public Double getOpenAmountFC() {
		return OpenAmountFC;
	}

	public void setOpenAmountFC(Double openAmountFC) {
		OpenAmountFC = openAmountFC;
	}

	public Double getOpenAmountSC() {
		return OpenAmountSC;
	}

	public void setOpenAmountSC(Double openAmountSC) {
		OpenAmountSC = openAmountSC;
	}

	public String getOriginalItem() {
		return OriginalItem;
	}

	public void setOriginalItem(String originalItem) {
		OriginalItem = originalItem;
	}

	public Double getPackageQuantity() {
		return PackageQuantity;
	}

	public void setPackageQuantity(Double packageQuantity) {
		PackageQuantity = packageQuantity;
	}

	public Integer getParentLineNum() {
		return ParentLineNum;
	}

	public void setParentLineNum(Integer parentLineNum) {
		ParentLineNum = parentLineNum;
	}

	public String getPartialRetirement() {
		return PartialRetirement;
	}

	public void setPartialRetirement(String partialRetirement) {
		PartialRetirement = partialRetirement;
	}

	public Integer getPickListIdNumber() {
		return PickListIdNumber;
	}

	public void setPickListIdNumber(Integer pickListIdNumber) {
		PickListIdNumber = pickListIdNumber;
	}

	public Double getPickQuantity() {
		return PickQuantity;
	}

	public void setPickQuantity(Double pickQuantity) {
		PickQuantity = pickQuantity;
	}

	public String getPickStatus() {
		return PickStatus;
	}

	public void setPickStatus(String pickStatus) {
		PickStatus = pickStatus;
	}

	public String getPickStatusEx() {
		return PickStatusEx;
	}

	public void setPickStatusEx(String pickStatusEx) {
		PickStatusEx = pickStatusEx;
	}

	public String getPOTargetEntry() {
		return POTargetEntry;
	}

	public void setPOTargetEntry(String pOTargetEntry) {
		POTargetEntry = pOTargetEntry;
	}

	public Integer getPOTargetNum() {
		return POTargetNum;
	}

	public void setPOTargetNum(Integer pOTargetNum) {
		POTargetNum = pOTargetNum;
	}

	public Integer getPOTargetRowNum() {
		return POTargetRowNum;
	}

	public void setPOTargetRowNum(Integer pOTargetRowNum) {
		POTargetRowNum = pOTargetRowNum;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Double getPriceAfterVAT() {
		return PriceAfterVAT;
	}

	public void setPriceAfterVAT(Double priceAfterVAT) {
		PriceAfterVAT = priceAfterVAT;
	}

	public String getProjectCode() {
		return ProjectCode;
	}

	public void setProjectCode(String projectCode) {
		ProjectCode = projectCode;
	}

	public Double getQuantity() {
		return Quantity;
	}

	public void setQuantity(Double quantity) {
		Quantity = quantity;
	}

	public Double getRate() {
		return Rate;
	}

	public void setRate(Double rate) {
		Rate = rate;
	}

	public Double getRemainingOpenInventoryQuantity() {
		return RemainingOpenInventoryQuantity;
	}

	public void setRemainingOpenInventoryQuantity(Double remainingOpenInventoryQuantity) {
		RemainingOpenInventoryQuantity = remainingOpenInventoryQuantity;
	}

	public Double getRemainingOpenQuantity() {
		return RemainingOpenQuantity;
	}

	public void setRemainingOpenQuantity(Double remainingOpenQuantity) {
		RemainingOpenQuantity = remainingOpenQuantity;
	}

	public Date getRequiredDate() {
		return RequiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		RequiredDate = requiredDate;
	}

	public Double getRequiredQuantity() {
		return RequiredQuantity;
	}

	public void setRequiredQuantity(Double requiredQuantity) {
		RequiredQuantity = requiredQuantity;
	}

	public Double getRetirementAPC() {
		return RetirementAPC;
	}

	public void setRetirementAPC(Double retirementAPC) {
		RetirementAPC = retirementAPC;
	}

	public Double getRetirementQuantity() {
		return RetirementQuantity;
	}

	public void setRetirementQuantity(Double retirementQuantity) {
		RetirementQuantity = retirementQuantity;
	}

	public Double getReturnCost() {
		return ReturnCost;
	}

	public void setReturnCost(Double returnCost) {
		ReturnCost = returnCost;
	}

	public Double getRowTotalFC() {
		return RowTotalFC;
	}

	public void setRowTotalFC(Double rowTotalFC) {
		RowTotalFC = rowTotalFC;
	}

	public Double getRowTotalSC() {
		return RowTotalSC;
	}

	public void setRowTotalSC(Double rowTotalSC) {
		RowTotalSC = rowTotalSC;
	}

	public Integer getSalesPersonCode() {
		return SalesPersonCode;
	}

	public void setSalesPersonCode(Integer salesPersonCode) {
		SalesPersonCode = salesPersonCode;
	}

	public String getSerialNum() {
		return SerialNum;
	}

	public void setSerialNum(String serialNum) {
		SerialNum = serialNum;
	}

	public List<SerialNumber> getSerialNumbers() {
		return SerialNumbers;
	}

	public void setSerialNumbers(List<SerialNumber> serialNumbers) {
		SerialNumbers = serialNumbers;
	}

	public Date getShipDate() {
		return ShipDate;
	}

	public void setShipDate(Date shipDate) {
		ShipDate = shipDate;
	}

	public Integer getShippingMethod() {
		return ShippingMethod;
	}

	public void setShippingMethod(Integer shippingMethod) {
		ShippingMethod = shippingMethod;
	}

	public String getShipToCode() {
		return ShipToCode;
	}

	public void setShipToCode(String shipToCode) {
		ShipToCode = shipToCode;
	}

	public String getShipToDescription() {
		return ShipToDescription;
	}

	public void setShipToDescription(String shipToDescription) {
		ShipToDescription = shipToDescription;
	}

	public Double getShortages() {
		return Shortages;
	}

	public void setShortages(Double shortages) {
		Shortages = shortages;
	}

	public Double getStockDistributesum() {
		return StockDistributesum;
	}

	public void setStockDistributesum(Double stockDistributesum) {
		StockDistributesum = stockDistributesum;
	}

	public Double getStockDistributesumForeign() {
		return StockDistributesumForeign;
	}

	public void setStockDistributesumForeign(Double stockDistributesumForeign) {
		StockDistributesumForeign = stockDistributesumForeign;
	}

	public Double getStockDistributesumSystem() {
		return StockDistributesumSystem;
	}

	public void setStockDistributesumSystem(Double stockDistributesumSystem) {
		StockDistributesumSystem = stockDistributesumSystem;
	}

	public Double getStockInmPrice() {
		return StockInmPrice;
	}

	public void setStockInmPrice(Double stockInmPrice) {
		StockInmPrice = stockInmPrice;
	}

	public String getSupplierCatNum() {
		return SupplierCatNum;
	}

	public void setSupplierCatNum(String supplierCatNum) {
		SupplierCatNum = supplierCatNum;
	}

	public Double getSurpluses() {
		return Surpluses;
	}

	public void setSurpluses(Double surpluses) {
		Surpluses = surpluses;
	}

	public String getSWW() {
		return SWW;
	}

	public void setSWW(String sWW) {
		SWW = sWW;
	}

	public Double getTaxBeforeDPM() {
		return TaxBeforeDPM;
	}

	public void setTaxBeforeDPM(Double taxBeforeDPM) {
		TaxBeforeDPM = taxBeforeDPM;
	}

	public Double getTaxBeforeDPMFC() {
		return TaxBeforeDPMFC;
	}

	public void setTaxBeforeDPMFC(Double taxBeforeDPMFC) {
		TaxBeforeDPMFC = taxBeforeDPMFC;
	}

	public Double getTaxBeforeDPMSC() {
		return TaxBeforeDPMSC;
	}

	public void setTaxBeforeDPMSC(Double taxBeforeDPMSC) {
		TaxBeforeDPMSC = taxBeforeDPMSC;
	}

	public String getTaxCode() {
		return TaxCode;
	}

	public void setTaxCode(String taxCode) {
		TaxCode = taxCode;
	}

	public String getTaxLiable() {
		return TaxLiable;
	}

	public void setTaxLiable(String taxLiable) {
		TaxLiable = taxLiable;
	}

	public String getTaxOnly() {
		return TaxOnly;
	}

	public void setTaxOnly(String taxOnly) {
		TaxOnly = taxOnly;
	}

	public Double getTaxPercentagePerRow() {
		return TaxPercentagePerRow;
	}

	public void setTaxPercentagePerRow(Double taxPercentagePerRow) {
		TaxPercentagePerRow = taxPercentagePerRow;
	}

	public Double getTaxPerUnit() {
		return TaxPerUnit;
	}

	public void setTaxPerUnit(Double taxPerUnit) {
		TaxPerUnit = taxPerUnit;
	}

	public Double getTaxTotal() {
		return TaxTotal;
	}

	public void setTaxTotal(Double taxTotal) {
		TaxTotal = taxTotal;
	}

	public String getTaxType() {
		return TaxType;
	}

	public void setTaxType(String taxType) {
		TaxType = taxType;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	public String getThirdParty() {
		return ThirdParty;
	}

	public void setThirdParty(String thirdParty) {
		ThirdParty = thirdParty;
	}

	public Double getTotalEqualizationTax() {
		return TotalEqualizationTax;
	}

	public void setTotalEqualizationTax(Double totalEqualizationTax) {
		TotalEqualizationTax = totalEqualizationTax;
	}

	public Double getTotalEqualizationTaxFC() {
		return TotalEqualizationTaxFC;
	}

	public void setTotalEqualizationTaxFC(Double totalEqualizationTaxFC) {
		TotalEqualizationTaxFC = totalEqualizationTaxFC;
	}

	public Double getTotalEqualizationTaxSC() {
		return TotalEqualizationTaxSC;
	}

	public void setTotalEqualizationTaxSC(Double totalEqualizationTaxSC) {
		TotalEqualizationTaxSC = totalEqualizationTaxSC;
	}

	public Double getTotalInclTax() {
		return TotalInclTax;
	}

	public void setTotalInclTax(Double totalInclTax) {
		TotalInclTax = totalInclTax;
	}

	public String getTransactionType() {
		return TransactionType;
	}

	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}

	public Integer getTransportMode() {
		return TransportMode;
	}

	public void setTransportMode(Integer transportMode) {
		TransportMode = transportMode;
	}

	public String getTreeType() {
		return TreeType;
	}

	public void setTreeType(String treeType) {
		TreeType = treeType;
	}

	public String getU_CODEMP() {
		return U_CODEMP;
	}

	public void setU_CODEMP(String u_CODEMP) {
		U_CODEMP = u_CODEMP;
	}

	public String getU_CODPRO() {
		return U_CODPRO;
	}

	public void setU_CODPRO(String u_CODPRO) {
		U_CODPRO = u_CODPRO;
	}

	public String getU_CODSECC() {
		return U_CODSECC;
	}

	public void setU_CODSECC(String u_CODSECC) {
		U_CODSECC = u_CODSECC;
	}

	public String getU_LineId() {
		return U_LineId;
	}

	public void setU_LineId(String u_LineId) {
		U_LineId = u_LineId;
	}

	public Double getU_SCGCOM_GANac() {
		return U_SCGCOM_GANac;
	}

	public void setU_SCGCOM_GANac(Double u_SCGCOM_GANac) {
		U_SCGCOM_GANac = u_SCGCOM_GANac;
	}

	public String getU_ZonaPre() {
		return U_ZonaPre;
	}

	public void setU_ZonaPre(String u_ZonaPre) {
		U_ZonaPre = u_ZonaPre;
	}

	public Double getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		UnitPrice = unitPrice;
	}

	public Double getUnitsOfMeasurment() {
		return UnitsOfMeasurment;
	}

	public void setUnitsOfMeasurment(Double unitsOfMeasurment) {
		UnitsOfMeasurment = unitsOfMeasurment;
	}

	public String getUoMCode() {
		return UoMCode;
	}

	public void setUoMCode(String uoMCode) {
		UoMCode = uoMCode;
	}

	public Integer getUoMEntry() {
		return UoMEntry;
	}

	public void setUoMEntry(Integer uoMEntry) {
		UoMEntry = uoMEntry;
	}

	public Integer getUsage() {
		return Usage;
	}

	public void setUsage(Integer usage) {
		Usage = usage;
	}

	public String getUseBaseUnits() {
		return UseBaseUnits;
	}

	public void setUseBaseUnits(String useBaseUnits) {
		UseBaseUnits = useBaseUnits;
	}

	public String getVatGroup() {
		return VatGroup;
	}

	public void setVatGroup(String vatGroup) {
		VatGroup = vatGroup;
	}

	public String getVendorNum() {
		return VendorNum;
	}

	public void setVendorNum(String vendorNum) {
		VendorNum = vendorNum;
	}

	public Integer getVisualOrder() {
		return VisualOrder;
	}

	public void setVisualOrder(Integer visualOrder) {
		VisualOrder = visualOrder;
	}

	public Double getVolume() {
		return Volume;
	}

	public void setVolume(Double volume) {
		Volume = volume;
	}

	public Integer getVolumeUnit() {
		return VolumeUnit;
	}

	public void setVolumeUnit(Integer volumeUnit) {
		VolumeUnit = volumeUnit;
	}

	public String getWarehouseCode() {
		return WarehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		WarehouseCode = warehouseCode;
	}

	public Double getWeight1() {
		return Weight1;
	}

	public void setWeight1(Double weight1) {
		Weight1 = weight1;
	}

	public Integer getWeight1Unit() {
		return Weight1Unit;
	}

	public void setWeight1Unit(Integer weight1Unit) {
		Weight1Unit = weight1Unit;
	}

	public Double getWeight2() {
		return Weight2;
	}

	public void setWeight2(Double weight2) {
		Weight2 = weight2;
	}

	public Integer getWeight2Unit() {
		return Weight2Unit;
	}

	public void setWeight2Unit(Integer weight2Unit) {
		Weight2Unit = weight2Unit;
	}

	public Double getWidth1() {
		return Width1;
	}

	public void setWidth1(Double width1) {
		Width1 = width1;
	}

	public Integer getWidth1Unit() {
		return Width1Unit;
	}

	public void setWidth1Unit(Integer width1Unit) {
		Width1Unit = width1Unit;
	}

	public Double getWidth2() {
		return Width2;
	}

	public void setWidth2(Double width2) {
		Width2 = width2;
	}

	public Integer getWidth2Unit() {
		return Width2Unit;
	}

	public void setWidth2Unit(Integer width2Unit) {
		Width2Unit = width2Unit;
	}

	public List<WithholdingTaxLine> getWithholdingTaxLines() {
		return WithholdingTaxLines;
	}

	public void setWithholdingTaxLines(List<WithholdingTaxLine> withholdingTaxLines) {
		WithholdingTaxLines = withholdingTaxLines;
	}

	public String getWithoutInventoryMovement() {
		return WithoutInventoryMovement;
	}

	public void setWithoutInventoryMovement(String withoutInventoryMovement) {
		WithoutInventoryMovement = withoutInventoryMovement;
	}

	public String getWTLiable() {
		return WTLiable;
	}

	public void setWTLiable(String wTLiable) {
		WTLiable = wTLiable;
	}
	
	// GSON library for JSON
	@Override
	public String toString(){
		Gson gson = new GsonBuilder().create();
		return gson.toJson(this);
	}

}
