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

}
