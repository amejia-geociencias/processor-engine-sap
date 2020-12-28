package com.hipstertech.service.entities;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class Document extends BaseApiObject {

	  public  Document()
      {
		  super.setResourceName("Documents");
      }

      
      public String Address;

      
      public String Address2;

      
      public String AgentCode;

      
      public int AnnualInvoiceDeclarationReference;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String ApplyCurrentVATRatesForDownPaymentsToDraw;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String ApplyTaxOnFirstInstallment;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String ArchiveNonremovableSalesQuotation;

      
      public Date AssetValueDate;

      
      public String ATDocumentType;

      
      public int AttachmentEntry;

      
      public String AuthorizationCode;

      /// <summary>
      /// Enumeration: DocumentAuthorizationStatusEnum. 
      /// </summary>
      
      public String AuthorizationStatus;

      
      public double BaseAmount;

      
      public double BaseAmountFC;

      
      public double BaseAmountSC;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String BillOfExchangeReserved;

      
      public int BlanketAgreementNumber;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String BlockDunning;

      
      public String Box1099;

      
      public String BPChannelCode;

      
      public int BPChannelContact;

      
      public int BPL_IDAssignedToInvoice;

      
      public String BPLName;

      
      public Date CancelDate;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String Cancelled;

      /// <summary>
      /// Enumeration: CancelStatusEnum. 
      /// </summary>
      
      public String CancelStatus;

      
      public String CardCode;

      
      public String CardName;

      
      public int CashDiscountDateOffset;

      
      public String CentralBankIndicator;

      
      public String CertificationNumber;

      
      public Date ClosingDate;

      /// <summary>
      /// Enumeration: ClosingOptionEnum. 
      /// </summary>
      
      public String ClosingOption;

      
      public String ClosingRemarks;

      
      public String Comments;

      /// <summary>
      /// Enumeration: CommissionTradeTypeEnum. 
      /// </summary>
      
      public String CommissionTrade;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String CommissionTradeReturn;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String Confirmed;

      
      public int ContactPersonCode;

      
      public String ControlAccount;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String CreateOnlineQuotation;

      
      public Date CreationDate;

      
      public Date DateOfReportingControlStatementVAT;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String DeferredTax;

      
      public double DiscountPercent;

      
      public String DocCurrency;

      
      public Date DocDate;

      
      public Date DocDueDate;

      
      public int DocEntry;

      
      public int DocNum;

      
      public String DocObjectCode;

      
      public double DocRate;

      
      public Instant DocTime;

      
      public double DocTotal;

      
      public double DocTotalFc;

      
      public double DocTotalSys;

      /// <summary>
      /// Enumeration: BoDocumentTypes. 
      /// </summary>
      
      public String DocType;


      /// <summary>
      /// Enumeration: DocumentDeliveryTypeEnum. 
      /// </summary>
      
      public String DocumentDelivery;

      public List<DocumentLines> DocumentLines;
      
      public int DocumentsOwner;


      /// <summary>
      /// Enumeration: BoStatus. 
      /// </summary>
      
      public String DocumentStatus;

      /// <summary>
      /// Enumeration: BoDocumentSubType. 
      /// </summary>
      
      public String DocumentSubType;

      
      public String DocumentTaxID;

      
      public double DownPayment;

      
      public double DownPaymentAmount;

      
      public double DownPaymentAmountFC;

      
      public double DownPaymentAmountSC;

      
      public double DownPaymentPercentage;

      /// <summary>
      /// Enumeration: BoSoStatus. 
      /// </summary>
      
      public String DownPaymentStatus;


      public String DownPaymentTrasactionID;

      /// <summary>
      /// Enumeration: DownPaymentTypeEnum. 
      /// </summary>
      
      public String DownPaymentType;

      
      public String ECommerceGSTIN;

      
      public String ECommerceOperator;

      
      public String EDocErrorCode;

      
      public String EDocErrorMessage;

      
      public int EDocExportFormat;

      /// <summary>
      /// Enumeration: EDocGenerationTypeEnum. 
      /// </summary>
      
      public String EDocGenerationType;

      
      public String EDocNum;

      
      public int EDocSeries;

      /// <summary>
      /// Enumeration: EDocStatusEnum. 
      /// </summary>
      
      public String EDocStatus;

      
      public String ElecCommMessage;

      /// <summary>
      /// Enumeration: ElecCommStatusEnum. 
      /// </summary>
      
      public String ElecCommStatus;

      
      public Date EndDeliveryDate;

      
      public Instant EndDeliveryTime;

      
      public String ETaxNumber;

      
      public int ETaxWebSite;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String ExcludeFromTaxReportControlStatementVAT;

      
      public Date ExemptionValidityDateFrom;

      
      public Date ExemptionValidityDateTo;

      
      public String ExternalCorrectedDocNum;

      
      public int ExtraDays;

      
      public int ExtraMonth;

      
      public String FederalTaxID;

      
      public int FinancialPeriod;

      
      public String FiscalDocNum;

      
      public int FolioNumber;

      
      public int FolioNumberFrom;

      
      public int FolioNumberTo;

      
      public String FolioPrefixString;

      
      public int Form1099;

      
      public double GrosProfit;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String GroupHandWritten;

      
      public int GroupNumber;

      
      public int GroupSeries;

      /// <summary>
      /// Enumeration: GSTTransactionTypeEnum. 
      /// </summary>
      
      public String GSTTransactionType;

      
      public int GTSChecker;

      
      public int GTSPayee;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String HandWritten;

      
      public int ImportFileNum;

      
      public String Indicator;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String InsuranceOperation347;

      /// <summary>
      /// Enumeration: BoInterimDocTypes. 
      /// </summary>
      
      public String InterimType;

      
      public int InternalCorrectedDocNum;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String IsAlteration;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String IsPayToBank;

      
      public int IssuingReason;

      
      public String JournalMemo;

      
      public int LanguageCode;

      /// <summary>
      /// Enumeration: FolioLetterEnum. 
      /// </summary>
      
      public String Letter;

      
      public String ManualNumber;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String MaximumCashDiscount;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String NetProcedure;

      
      public int NextCorrectingDocument;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String NTSApproved;

      
      public String NTSApprovedNumber;

      
      public String NumAtCard;

      
      public int NumberOfInstallments;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String OpenForLandedCosts;

      
      public String OpeningRemarks;

      
      public Date OriginalCreditOrDebitDate;

      
      public String OriginalCreditOrDebitNo;

      
      public Date OriginalRefDate;

      
      public String OriginalRefNo;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String PartialSupply;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String PaymentBlock;

      
      public int PaymentBlockEntry;

      
      public int PaymentGroupCode;

      
      public String PaymentMethod;

      
      public String PaymentReference;

      
      public String PayToBankAccountNo;

      
      public String PayToBankBranch;

      
      public String PayToBankCode;

      
      public String PayToBankCountry;

      
      public String PayToCode;

      
      public String PeriodIndicator;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String Pick;

      
      public String PickRemark;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String PickStatus;

      
      public String PointOfIssueCode;

      
      public int POS_CashRegister;

      
      public int POSCashierNumber;

      
      public int POSDailySummaryNo;

      
      public String POSEquipmentNumber;

      
      public String POSManufacturerSerialNumber;

      
      public int POSReceiptNo;

      /// <summary>
      /// Enumeration: PrintStatusEnum. 
      /// </summary>
      
      public String Printed;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String PrintSEPADirect;

      
      public int PrivateKeyVersion;

      
      public String Project;

      
      public int Receiver;

      
      public String Reference1;

      
      public String Reference2;

      
      public int RelatedEntry;

      
      public int RelatedType;

      
      public int Releaser;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String RelevantToGTS;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String ReopenManuallyClosedOrCanceledDocument;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String ReopenOriginalDocument;

      
      public String ReportingSectionControlStatementVAT;

      
      public int ReqType;

      
      public String Requester;

      
      public int RequesterBranch;

      
      public int RequesterDepartment;

      
      public String RequesterEmail;

      
      public String RequesterName;

      
      public Date RequriedDate;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String Reserve;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String ReserveInvoice;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String ReuseDocumentNum;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String ReuseNotaFiscalNum;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String Revision;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String RevisionPo;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String Rounding;

      
      public double RoundingDiffAmount;

      
      public double RoundingDiffAmountFC;

      
      public double RoundingDiffAmountSC;

      
      public int SalesPersonCode;

      
      public int Segment;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String SendNotification;

      
      public int SequenceCode;

      
      public String SequenceModel;

      
      public int SequenceSerial;

      
      public int Series;

      
      public String SeriesString;

      
      public double ServiceGrossProfitPercent;

      
      public String ShipFrom;

      
      public String ShipToCode;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String ShowSCN;

      
      public String SignatureDigest;

      
      public String SignatureInputMessage;

      
      public String SlpCode;

      
      public Date SpecifiedClosingDate;

      
      public Date StartDeliveryDate;

      
      public Instant StartDeliveryTime;

      /// <summary>
      /// Enumeration: BoPayTermDueTypes. 
      /// </summary>
      
      public String StartFrom;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String Submitted;

      
      public String SubSeriesString;

      /// <summary>
      /// Enumeration: BoDocSummaryTypes. 
      /// </summary>
      
      public String SummeryType;

      
      public String Supplier;

      
      public Date TaxDate;

      
      public String TaxExemptionLetterNum;

      
      public Date TaxInvoiceDate;

      
      public String TaxInvoiceNo;

      
      public double TotalDiscount;

      
      public double TotalDiscountFC;

      
      public double TotalDiscountSC;

      
      public double TotalEqualizationTax;

      
      public double TotalEqualizationTaxFC;

      
      public double TotalEqualizationTaxSC;

      
      public String TrackingNumber;

      
      public int TransNum;

      
      public int TransportationCode;

      
      public String U_AgeCob;

      
      public String U_Agencia;

      
      public String U_AplInt;

      
      public String U_BDOC;

      
      public String U_caja;

      
      public String U_Canal;

      
      public String U_CanCobro;

      
      public String U_CardName;

      
      public String U_Cobrador;

      
      public String U_Condic;

      
      public String U_Consignacion;

      
      public int U_Contrato;

      
      public Date U_DocEntrega;

      
      public String U_DocHacienda;

      
      public String U_ClaveNumerica;

      
      public Date U_ETA;

      
      public Date U_ETS;

      
      public String U_FactInc;

      
      public Date U_FecExon;

      
      public String U_FormPag;

      
      public int U_GTI_ID;

      
      public int U_GTI_MOTIVOS;

      
      public String U_INCOTERM;

      
      public String U_IND151;

      
      public String U_IndTiquete;

      
      public String U_LugarEntrega;

      
      public String U_MedioPago;

      
      public String U_NAR;

      
      public String U_NatDesc;

      
      public String U_NCA;

      
      public String U_NNE;

      
      public String U_NPR;

      
      public String U_NSP;

      
      public String U_NumElec;

      
      public String U_NumPedido;

      
      public String U_OrdenCompra;

      
      public String U_ORIPRE;

      
      public String U_PO;

      
      public String U_REFDOC;

      
      public int U_RefInt;

      
      public int U_SCG_Com;

      
      public String U_SCGCOM_CalCom;

      
      public int U_SCGRMS_Caja;

      
      public Date U_SCGRMS_FechaUpdt;

      
      public String U_SCGRMS_Filler2;

      
      public int U_SCGRMS_IdDoc;

      
      public int U_SCGRMS_Jornada;

      
      public String U_SCGRMS_NmbCaja;

      
      public int U_SCGRMS_NumDoc;

      
      public String U_SCGRMS_NumDocLey;

      
      public String U_SCGRMS_Referencia0;

      
      public String U_SCGRMS_Referencia1;

      
      public String U_SCGRMS_Referencia2;

      
      public String U_SCGRMS_Referencia3;

      
      public String U_SCGRMS_Referencia4;

      
      public String U_SCGRMS_Referencia5;

      
      public String U_SCGRMS_Referencia6;

      
      public String U_SCGRMS_Referencia7;

      
      public String U_SCGRMS_Referencia8;

      
      public String U_SCGRMS_Referencia9;

      
      public String U_SCGRMS_Replica;

      
      public String U_SCGRMS_ResoAuto;

      
      public String U_SCGRMS_Tienda;

      
      public String U_SCGRMS_TiendaUdt;

      
      public String U_SCGRMS_UserInsrt;

      
      public String U_SCGRMS_UserUpdt;

      
      public String U_Sucursal;

      
      public int U_Suscriptor;

      
      public String U_TipoDoc;

      
      public int U_TipoExon;

      
      public String U_U_BREF;

      
      public String U_usrcaja;

      
      public String U_ZCobro;

      
      public String U_Zona;


      
      public String U_REFNUM;
      
      public String U_REFFECHA;
      
      public String U_REFTIPOR;
      
      public String U_REFTIPOD;
      
      public String U_REFRAZON;
      
      public String U_NUM_CONSE;


      
      public Date UpdateDate;

      
      public Instant UpDate;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String UseBillToAddrToDetermineTax;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String UseCorrectionVATGroup;

      /// <summary>
      /// Enumeration: BoYesNoEnum. 
      /// </summary>
      
      public String UseShpdGoodsAct;

      
      public Date VatDate;

      
      public double VatPercent;

      
      public String VATRegNum;

      
      public double VatSum;

      
      public double VatSumFc;

      
      public double VatSumSys;

      
      public String VehiclePlate;

      /// <summary>
      /// Enumeration: BoDocWhsUpdateTypes. 
      /// </summary>
      
      public String WareHouseUpdateType;

      
      public double WTAmount;

      
      public double WTAmountFC;

      
      public double WTAmountSC;

      
      public double WTApplied;

      
      public double WTAppliedFC;

      
      public double WTAppliedSC;

      
      public double WTExemptedAmount;

      
      public double WTExemptedAmountFC;

      
      public double WTExemptedAmountSC;

      
      public double WTNonSubjectAmount;

      
      public double WTNonSubjectAmountFC;

      
      public double WTNonSubjectAmountSC;
}
