package com.hipstertech.service.entities;

import java.util.Date;
import java.util.List;

public class DocumentLines {


	public String AccountCode ;


	public int ActualBaseEntry ;


	public String ActualBaseLine;


	public Date ActualDeliveryDate ;


	public String Address ;


	public int AgreementNo ;


	public int AgreementRowNumber ;


	public double AppliedTax ;


	public double AppliedTaxFC ;


	public double AppliedTaxSC ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String BackOrder ;


	public String BarCode ;


	public int BaseEntry ;


	public String BaseLine;


	public double BaseOpenQuantity ;


	public int BaseType ;


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


	public double CommisionPercent ;

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


	public double CorrInvAmountToDiffAcct ;


	public double CorrInvAmountToStock ;


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


	public double DefectAndBreakup ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String DeferredTax ;


	public double DiscountPercent ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String DistributeExpense ;


	public int DocEntry ;


	public List<DocumentLineAdditionalExpense> DocumentLineAdditionalExpenses ;


	public List<DocumentLinesBinAllocation> DocumentLinesBinAllocations ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String EnableReturnCost ;


	public double EqualizationTaxPercent ;


	public double ExciseAmount ;


	public String ExLineNo ;


	public double Factor1 ;


	public double Factor2 ;


	public double Factor3 ;


	public double Factor4 ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String FreeOfChargeBP ;


	public String FreeText ;


	public int GrossBase ;


	public double GrossBuyPrice ;


	public double GrossProfitTotalBasePrice ;


	public double Height1 ;


	public double Height2 ;


	public int Height2Unit ;


	public int Hight1Unit ;


	public int Incoterms ;


	public double InventoryQuantity ;


	public String ItemCode ;


	public String ItemDescription ;


	public String ItemDetails ;

	/// <summary>
	/// Enumeration: BoDocItemType. 
	/// </summary>

	public String ItemType ;


	public double LastBuyDistributeSum ;


	public double LastBuyDistributeSumFc ;


	public double LastBuyDistributeSumSc ;


	public double LastBuyInmPrice ;


	public double Lengh1 ;


	public int Lengh1Unit ;


	public double Lengh2 ;


	public int Lengh2Unit ;


	public int LineNum ;

	/// <summary>
	/// Enumeration: BoStatus. 
	/// </summary>

	public String LineStatus ;


	public List<LineTaxJurisdiction> LineTaxJurisdictions ;


	public double LineTotal ;

	/// <summary>
	/// Enumeration: BoDocLineType. 
	/// </summary>

	public String LineType ;


	public String LineVendor ;


	public int LocationCode ;


	public String MeasureUnit ;


	public double NetTaxAmount ;


	public double NetTaxAmountFC ;


	public double NetTaxAmountSC ;


	public double OpenAmount ;


	public double OpenAmountFC ;


	public double OpenAmountSC ;


	public String OriginalItem ;


	public double PackageQuantity ;


	public int ParentLineNum ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String PartialRetirement ;


	public int PickListIdNumber ;


	public double PickQuantity ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String PickStatus ;

	/// <summary>
	/// Enumeration: BoDocumentLinePickStatus. 
	/// </summary>

	public String PickStatusEx ;


	public String POTargetEntry ;


	public int POTargetNum ;


	public int POTargetRowNum ;


	public double Price ;


	public double PriceAfterVAT ;


	public String ProjectCode ;


	public double Quantity ;


	public double Rate ;


	public double RemainingOpenInventoryQuantity ;


	public double RemainingOpenQuantity ;


	public Date RequiredDate ;


	public double RequiredQuantity ;


	public double RetirementAPC ;


	public double RetirementQuantity ;


	public double ReturnCost ;


	public double RowTotalFC ;


	public double RowTotalSC ;


	public int SalesPersonCode ;


	public String SerialNum ;


	public List<SerialNumber> SerialNumbers ;


	public Date ShipDate ;


	public int ShippingMethod ;


	public String ShipToCode ;


	public String ShipToDescription ;


	public double Shortages ;


	public double StockDistributesum ;


	public double StockDistributesumForeign ;


	public double StockDistributesumSystem ;


	public double StockInmPrice ;


	public String SupplierCatNum ;


	public double Surpluses ;


	public String SWW ;


	public double TaxBeforeDPM ;


	public double TaxBeforeDPMFC ;


	public double TaxBeforeDPMSC ;


	public String TaxCode ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String TaxLiable ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String TaxOnly ;


	public double TaxPercentagePerRow ;


	public double TaxPerUnit ;


	public double TaxTotal ;

	/// <summary>
	/// Enumeration: BoTaxTypes. 
	/// </summary>

	public String TaxType ;


	public String Text ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String ThirdParty ;


	public double TotalEqualizationTax ;


	public double TotalEqualizationTaxFC ;


	public double TotalEqualizationTaxSC ;


	public double TotalInclTax ;

	/// <summary>
	/// Enumeration: BoTransactionTypeEnum. 
	/// </summary>

	public String TransactionType ;


	public int TransportMode ;

	/// <summary>
	/// Enumeration: BoItemTreeTypes. 
	/// </summary>

	public String TreeType ;


	public String U_CODEMP ;


	public String U_CODPRO ;


	public String U_CODSECC ;


	public String U_LineId ;


	public double U_SCGCOM_GANac ;


	public String U_ZonaPre ;


	public double UnitPrice ;


	public double UnitsOfMeasurment ;


	public String UoMCode ;


	public int UoMEntry ;


	public int Usage ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String UseBaseUnits ;


	public String VatGroup ;


	public String VendorNum ;


	public int VisualOrder ;


	public double Volume ;


	public int VolumeUnit ;


	public String WarehouseCode ;


	public double Weight1 ;


	public int Weight1Unit ;


	public double Weight2 ;


	public int Weight2Unit ;


	public double Width1 ;


	public int Width1Unit ;


	public double Width2 ;


	public int Width2Unit ;


	public List<WithholdingTaxLine> WithholdingTaxLines ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String WithoutInventoryMovement ;

	/// <summary>
	/// Enumeration: BoYesNoEnum. 
	/// </summary>

	public String WTLiable ;

	public String getAccountCode() {
		return AccountCode;
	}

	public void setAccountCode(String accountCode) {
		AccountCode = accountCode;
	}

	public int getActualBaseEntry() {
		return ActualBaseEntry;
	}

	public void setActualBaseEntry(int actualBaseEntry) {
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

	public int getAgreementNo() {
		return AgreementNo;
	}

	public void setAgreementNo(int agreementNo) {
		AgreementNo = agreementNo;
	}

	public int getAgreementRowNumber() {
		return AgreementRowNumber;
	}

	public void setAgreementRowNumber(int agreementRowNumber) {
		AgreementRowNumber = agreementRowNumber;
	}

	public double getAppliedTax() {
		return AppliedTax;
	}

	public void setAppliedTax(double appliedTax) {
		AppliedTax = appliedTax;
	}

	public double getAppliedTaxFC() {
		return AppliedTaxFC;
	}

	public void setAppliedTaxFC(double appliedTaxFC) {
		AppliedTaxFC = appliedTaxFC;
	}

	public double getAppliedTaxSC() {
		return AppliedTaxSC;
	}

	public void setAppliedTaxSC(double appliedTaxSC) {
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

	public int getBaseEntry() {
		return BaseEntry;
	}

	public void setBaseEntry(int baseEntry) {
		BaseEntry = baseEntry;
	}

	public String getBaseLine() {
		return BaseLine;
	}

	public void setBaseLine(String baseLine) {
		BaseLine = baseLine;
	}

	public double getBaseOpenQuantity() {
		return BaseOpenQuantity;
	}

	public void setBaseOpenQuantity(double baseOpenQuantity) {
		BaseOpenQuantity = baseOpenQuantity;
	}

	public int getBaseType() {
		return BaseType;
	}

	public void setBaseType(int baseType) {
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

	public double getCommisionPercent() {
		return CommisionPercent;
	}

	public void setCommisionPercent(double commisionPercent) {
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

	public double getCorrInvAmountToDiffAcct() {
		return CorrInvAmountToDiffAcct;
	}

	public void setCorrInvAmountToDiffAcct(double corrInvAmountToDiffAcct) {
		CorrInvAmountToDiffAcct = corrInvAmountToDiffAcct;
	}

	public double getCorrInvAmountToStock() {
		return CorrInvAmountToStock;
	}

	public void setCorrInvAmountToStock(double corrInvAmountToStock) {
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

	public double getDefectAndBreakup() {
		return DefectAndBreakup;
	}

	public void setDefectAndBreakup(double defectAndBreakup) {
		DefectAndBreakup = defectAndBreakup;
	}

	public String getDeferredTax() {
		return DeferredTax;
	}

	public void setDeferredTax(String deferredTax) {
		DeferredTax = deferredTax;
	}

	public double getDiscountPercent() {
		return DiscountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		DiscountPercent = discountPercent;
	}

	public String getDistributeExpense() {
		return DistributeExpense;
	}

	public void setDistributeExpense(String distributeExpense) {
		DistributeExpense = distributeExpense;
	}

	public int getDocEntry() {
		return DocEntry;
	}

	public void setDocEntry(int docEntry) {
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

	public double getEqualizationTaxPercent() {
		return EqualizationTaxPercent;
	}

	public void setEqualizationTaxPercent(double equalizationTaxPercent) {
		EqualizationTaxPercent = equalizationTaxPercent;
	}

	public double getExciseAmount() {
		return ExciseAmount;
	}

	public void setExciseAmount(double exciseAmount) {
		ExciseAmount = exciseAmount;
	}

	public String getExLineNo() {
		return ExLineNo;
	}

	public void setExLineNo(String exLineNo) {
		ExLineNo = exLineNo;
	}

	public double getFactor1() {
		return Factor1;
	}

	public void setFactor1(double factor1) {
		Factor1 = factor1;
	}

	public double getFactor2() {
		return Factor2;
	}

	public void setFactor2(double factor2) {
		Factor2 = factor2;
	}

	public double getFactor3() {
		return Factor3;
	}

	public void setFactor3(double factor3) {
		Factor3 = factor3;
	}

	public double getFactor4() {
		return Factor4;
	}

	public void setFactor4(double factor4) {
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

	public int getGrossBase() {
		return GrossBase;
	}

	public void setGrossBase(int grossBase) {
		GrossBase = grossBase;
	}

	public double getGrossBuyPrice() {
		return GrossBuyPrice;
	}

	public void setGrossBuyPrice(double grossBuyPrice) {
		GrossBuyPrice = grossBuyPrice;
	}

	public double getGrossProfitTotalBasePrice() {
		return GrossProfitTotalBasePrice;
	}

	public void setGrossProfitTotalBasePrice(double grossProfitTotalBasePrice) {
		GrossProfitTotalBasePrice = grossProfitTotalBasePrice;
	}

	public double getHeight1() {
		return Height1;
	}

	public void setHeight1(double height1) {
		Height1 = height1;
	}

	public double getHeight2() {
		return Height2;
	}

	public void setHeight2(double height2) {
		Height2 = height2;
	}

	public int getHeight2Unit() {
		return Height2Unit;
	}

	public void setHeight2Unit(int height2Unit) {
		Height2Unit = height2Unit;
	}

	public int getHight1Unit() {
		return Hight1Unit;
	}

	public void setHight1Unit(int hight1Unit) {
		Hight1Unit = hight1Unit;
	}

	public int getIncoterms() {
		return Incoterms;
	}

	public void setIncoterms(int incoterms) {
		Incoterms = incoterms;
	}

	public double getInventoryQuantity() {
		return InventoryQuantity;
	}

	public void setInventoryQuantity(double inventoryQuantity) {
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

	public double getLastBuyDistributeSum() {
		return LastBuyDistributeSum;
	}

	public void setLastBuyDistributeSum(double lastBuyDistributeSum) {
		LastBuyDistributeSum = lastBuyDistributeSum;
	}

	public double getLastBuyDistributeSumFc() {
		return LastBuyDistributeSumFc;
	}

	public void setLastBuyDistributeSumFc(double lastBuyDistributeSumFc) {
		LastBuyDistributeSumFc = lastBuyDistributeSumFc;
	}

	public double getLastBuyDistributeSumSc() {
		return LastBuyDistributeSumSc;
	}

	public void setLastBuyDistributeSumSc(double lastBuyDistributeSumSc) {
		LastBuyDistributeSumSc = lastBuyDistributeSumSc;
	}

	public double getLastBuyInmPrice() {
		return LastBuyInmPrice;
	}

	public void setLastBuyInmPrice(double lastBuyInmPrice) {
		LastBuyInmPrice = lastBuyInmPrice;
	}

	public double getLengh1() {
		return Lengh1;
	}

	public void setLengh1(double lengh1) {
		Lengh1 = lengh1;
	}

	public int getLengh1Unit() {
		return Lengh1Unit;
	}

	public void setLengh1Unit(int lengh1Unit) {
		Lengh1Unit = lengh1Unit;
	}

	public double getLengh2() {
		return Lengh2;
	}

	public void setLengh2(double lengh2) {
		Lengh2 = lengh2;
	}

	public int getLengh2Unit() {
		return Lengh2Unit;
	}

	public void setLengh2Unit(int lengh2Unit) {
		Lengh2Unit = lengh2Unit;
	}

	public int getLineNum() {
		return LineNum;
	}

	public void setLineNum(int lineNum) {
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

	public double getLineTotal() {
		return LineTotal;
	}

	public void setLineTotal(double lineTotal) {
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

	public int getLocationCode() {
		return LocationCode;
	}

	public void setLocationCode(int locationCode) {
		LocationCode = locationCode;
	}

	public String getMeasureUnit() {
		return MeasureUnit;
	}

	public void setMeasureUnit(String measureUnit) {
		MeasureUnit = measureUnit;
	}

	public double getNetTaxAmount() {
		return NetTaxAmount;
	}

	public void setNetTaxAmount(double netTaxAmount) {
		NetTaxAmount = netTaxAmount;
	}

	public double getNetTaxAmountFC() {
		return NetTaxAmountFC;
	}

	public void setNetTaxAmountFC(double netTaxAmountFC) {
		NetTaxAmountFC = netTaxAmountFC;
	}

	public double getNetTaxAmountSC() {
		return NetTaxAmountSC;
	}

	public void setNetTaxAmountSC(double netTaxAmountSC) {
		NetTaxAmountSC = netTaxAmountSC;
	}

	public double getOpenAmount() {
		return OpenAmount;
	}

	public void setOpenAmount(double openAmount) {
		OpenAmount = openAmount;
	}

	public double getOpenAmountFC() {
		return OpenAmountFC;
	}

	public void setOpenAmountFC(double openAmountFC) {
		OpenAmountFC = openAmountFC;
	}

	public double getOpenAmountSC() {
		return OpenAmountSC;
	}

	public void setOpenAmountSC(double openAmountSC) {
		OpenAmountSC = openAmountSC;
	}

	public String getOriginalItem() {
		return OriginalItem;
	}

	public void setOriginalItem(String originalItem) {
		OriginalItem = originalItem;
	}

	public double getPackageQuantity() {
		return PackageQuantity;
	}

	public void setPackageQuantity(double packageQuantity) {
		PackageQuantity = packageQuantity;
	}

	public int getParentLineNum() {
		return ParentLineNum;
	}

	public void setParentLineNum(int parentLineNum) {
		ParentLineNum = parentLineNum;
	}

	public String getPartialRetirement() {
		return PartialRetirement;
	}

	public void setPartialRetirement(String partialRetirement) {
		PartialRetirement = partialRetirement;
	}

	public int getPickListIdNumber() {
		return PickListIdNumber;
	}

	public void setPickListIdNumber(int pickListIdNumber) {
		PickListIdNumber = pickListIdNumber;
	}

	public double getPickQuantity() {
		return PickQuantity;
	}

	public void setPickQuantity(double pickQuantity) {
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

	public int getPOTargetNum() {
		return POTargetNum;
	}

	public void setPOTargetNum(int pOTargetNum) {
		POTargetNum = pOTargetNum;
	}

	public int getPOTargetRowNum() {
		return POTargetRowNum;
	}

	public void setPOTargetRowNum(int pOTargetRowNum) {
		POTargetRowNum = pOTargetRowNum;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public double getPriceAfterVAT() {
		return PriceAfterVAT;
	}

	public void setPriceAfterVAT(double priceAfterVAT) {
		PriceAfterVAT = priceAfterVAT;
	}

	public String getProjectCode() {
		return ProjectCode;
	}

	public void setProjectCode(String projectCode) {
		ProjectCode = projectCode;
	}

	public double getQuantity() {
		return Quantity;
	}

	public void setQuantity(double quantity) {
		Quantity = quantity;
	}

	public double getRate() {
		return Rate;
	}

	public void setRate(double rate) {
		Rate = rate;
	}

	public double getRemainingOpenInventoryQuantity() {
		return RemainingOpenInventoryQuantity;
	}

	public void setRemainingOpenInventoryQuantity(double remainingOpenInventoryQuantity) {
		RemainingOpenInventoryQuantity = remainingOpenInventoryQuantity;
	}

	public double getRemainingOpenQuantity() {
		return RemainingOpenQuantity;
	}

	public void setRemainingOpenQuantity(double remainingOpenQuantity) {
		RemainingOpenQuantity = remainingOpenQuantity;
	}

	public Date getRequiredDate() {
		return RequiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		RequiredDate = requiredDate;
	}

	public double getRequiredQuantity() {
		return RequiredQuantity;
	}

	public void setRequiredQuantity(double requiredQuantity) {
		RequiredQuantity = requiredQuantity;
	}

	public double getRetirementAPC() {
		return RetirementAPC;
	}

	public void setRetirementAPC(double retirementAPC) {
		RetirementAPC = retirementAPC;
	}

	public double getRetirementQuantity() {
		return RetirementQuantity;
	}

	public void setRetirementQuantity(double retirementQuantity) {
		RetirementQuantity = retirementQuantity;
	}

	public double getReturnCost() {
		return ReturnCost;
	}

	public void setReturnCost(double returnCost) {
		ReturnCost = returnCost;
	}

	public double getRowTotalFC() {
		return RowTotalFC;
	}

	public void setRowTotalFC(double rowTotalFC) {
		RowTotalFC = rowTotalFC;
	}

	public double getRowTotalSC() {
		return RowTotalSC;
	}

	public void setRowTotalSC(double rowTotalSC) {
		RowTotalSC = rowTotalSC;
	}

	public int getSalesPersonCode() {
		return SalesPersonCode;
	}

	public void setSalesPersonCode(int salesPersonCode) {
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

	public int getShippingMethod() {
		return ShippingMethod;
	}

	public void setShippingMethod(int shippingMethod) {
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

	public double getShortages() {
		return Shortages;
	}

	public void setShortages(double shortages) {
		Shortages = shortages;
	}

	public double getStockDistributesum() {
		return StockDistributesum;
	}

	public void setStockDistributesum(double stockDistributesum) {
		StockDistributesum = stockDistributesum;
	}

	public double getStockDistributesumForeign() {
		return StockDistributesumForeign;
	}

	public void setStockDistributesumForeign(double stockDistributesumForeign) {
		StockDistributesumForeign = stockDistributesumForeign;
	}

	public double getStockDistributesumSystem() {
		return StockDistributesumSystem;
	}

	public void setStockDistributesumSystem(double stockDistributesumSystem) {
		StockDistributesumSystem = stockDistributesumSystem;
	}

	public double getStockInmPrice() {
		return StockInmPrice;
	}

	public void setStockInmPrice(double stockInmPrice) {
		StockInmPrice = stockInmPrice;
	}

	public String getSupplierCatNum() {
		return SupplierCatNum;
	}

	public void setSupplierCatNum(String supplierCatNum) {
		SupplierCatNum = supplierCatNum;
	}

	public double getSurpluses() {
		return Surpluses;
	}

	public void setSurpluses(double surpluses) {
		Surpluses = surpluses;
	}

	public String getSWW() {
		return SWW;
	}

	public void setSWW(String sWW) {
		SWW = sWW;
	}

	public double getTaxBeforeDPM() {
		return TaxBeforeDPM;
	}

	public void setTaxBeforeDPM(double taxBeforeDPM) {
		TaxBeforeDPM = taxBeforeDPM;
	}

	public double getTaxBeforeDPMFC() {
		return TaxBeforeDPMFC;
	}

	public void setTaxBeforeDPMFC(double taxBeforeDPMFC) {
		TaxBeforeDPMFC = taxBeforeDPMFC;
	}

	public double getTaxBeforeDPMSC() {
		return TaxBeforeDPMSC;
	}

	public void setTaxBeforeDPMSC(double taxBeforeDPMSC) {
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

	public double getTaxPercentagePerRow() {
		return TaxPercentagePerRow;
	}

	public void setTaxPercentagePerRow(double taxPercentagePerRow) {
		TaxPercentagePerRow = taxPercentagePerRow;
	}

	public double getTaxPerUnit() {
		return TaxPerUnit;
	}

	public void setTaxPerUnit(double taxPerUnit) {
		TaxPerUnit = taxPerUnit;
	}

	public double getTaxTotal() {
		return TaxTotal;
	}

	public void setTaxTotal(double taxTotal) {
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

	public double getTotalEqualizationTax() {
		return TotalEqualizationTax;
	}

	public void setTotalEqualizationTax(double totalEqualizationTax) {
		TotalEqualizationTax = totalEqualizationTax;
	}

	public double getTotalEqualizationTaxFC() {
		return TotalEqualizationTaxFC;
	}

	public void setTotalEqualizationTaxFC(double totalEqualizationTaxFC) {
		TotalEqualizationTaxFC = totalEqualizationTaxFC;
	}

	public double getTotalEqualizationTaxSC() {
		return TotalEqualizationTaxSC;
	}

	public void setTotalEqualizationTaxSC(double totalEqualizationTaxSC) {
		TotalEqualizationTaxSC = totalEqualizationTaxSC;
	}

	public double getTotalInclTax() {
		return TotalInclTax;
	}

	public void setTotalInclTax(double totalInclTax) {
		TotalInclTax = totalInclTax;
	}

	public String getTransactionType() {
		return TransactionType;
	}

	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}

	public int getTransportMode() {
		return TransportMode;
	}

	public void setTransportMode(int transportMode) {
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

	public double getU_SCGCOM_GANac() {
		return U_SCGCOM_GANac;
	}

	public void setU_SCGCOM_GANac(double u_SCGCOM_GANac) {
		U_SCGCOM_GANac = u_SCGCOM_GANac;
	}

	public String getU_ZonaPre() {
		return U_ZonaPre;
	}

	public void setU_ZonaPre(String u_ZonaPre) {
		U_ZonaPre = u_ZonaPre;
	}

	public double getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}

	public double getUnitsOfMeasurment() {
		return UnitsOfMeasurment;
	}

	public void setUnitsOfMeasurment(double unitsOfMeasurment) {
		UnitsOfMeasurment = unitsOfMeasurment;
	}

	public String getUoMCode() {
		return UoMCode;
	}

	public void setUoMCode(String uoMCode) {
		UoMCode = uoMCode;
	}

	public int getUoMEntry() {
		return UoMEntry;
	}

	public void setUoMEntry(int uoMEntry) {
		UoMEntry = uoMEntry;
	}

	public int getUsage() {
		return Usage;
	}

	public void setUsage(int usage) {
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

	public int getVisualOrder() {
		return VisualOrder;
	}

	public void setVisualOrder(int visualOrder) {
		VisualOrder = visualOrder;
	}

	public double getVolume() {
		return Volume;
	}

	public void setVolume(double volume) {
		Volume = volume;
	}

	public int getVolumeUnit() {
		return VolumeUnit;
	}

	public void setVolumeUnit(int volumeUnit) {
		VolumeUnit = volumeUnit;
	}

	public String getWarehouseCode() {
		return WarehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		WarehouseCode = warehouseCode;
	}

	public double getWeight1() {
		return Weight1;
	}

	public void setWeight1(double weight1) {
		Weight1 = weight1;
	}

	public int getWeight1Unit() {
		return Weight1Unit;
	}

	public void setWeight1Unit(int weight1Unit) {
		Weight1Unit = weight1Unit;
	}

	public double getWeight2() {
		return Weight2;
	}

	public void setWeight2(double weight2) {
		Weight2 = weight2;
	}

	public int getWeight2Unit() {
		return Weight2Unit;
	}

	public void setWeight2Unit(int weight2Unit) {
		Weight2Unit = weight2Unit;
	}

	public double getWidth1() {
		return Width1;
	}

	public void setWidth1(double width1) {
		Width1 = width1;
	}

	public int getWidth1Unit() {
		return Width1Unit;
	}

	public void setWidth1Unit(int width1Unit) {
		Width1Unit = width1Unit;
	}

	public double getWidth2() {
		return Width2;
	}

	public void setWidth2(double width2) {
		Width2 = width2;
	}

	public int getWidth2Unit() {
		return Width2Unit;
	}

	public void setWidth2Unit(int width2Unit) {
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
	
	

}
