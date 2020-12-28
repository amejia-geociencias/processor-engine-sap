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

      
      public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getAddress2() {
		return Address2;
	}


	public void setAddress2(String address2) {
		Address2 = address2;
	}


	public String getAgentCode() {
		return AgentCode;
	}


	public void setAgentCode(String agentCode) {
		AgentCode = agentCode;
	}


	public int getAnnualInvoiceDeclarationReference() {
		return AnnualInvoiceDeclarationReference;
	}


	public void setAnnualInvoiceDeclarationReference(int annualInvoiceDeclarationReference) {
		AnnualInvoiceDeclarationReference = annualInvoiceDeclarationReference;
	}


	public String getApplyCurrentVATRatesForDownPaymentsToDraw() {
		return ApplyCurrentVATRatesForDownPaymentsToDraw;
	}


	public void setApplyCurrentVATRatesForDownPaymentsToDraw(String applyCurrentVATRatesForDownPaymentsToDraw) {
		ApplyCurrentVATRatesForDownPaymentsToDraw = applyCurrentVATRatesForDownPaymentsToDraw;
	}


	public String getApplyTaxOnFirstInstallment() {
		return ApplyTaxOnFirstInstallment;
	}


	public void setApplyTaxOnFirstInstallment(String applyTaxOnFirstInstallment) {
		ApplyTaxOnFirstInstallment = applyTaxOnFirstInstallment;
	}


	public String getArchiveNonremovableSalesQuotation() {
		return ArchiveNonremovableSalesQuotation;
	}


	public void setArchiveNonremovableSalesQuotation(String archiveNonremovableSalesQuotation) {
		ArchiveNonremovableSalesQuotation = archiveNonremovableSalesQuotation;
	}


	public Date getAssetValueDate() {
		return AssetValueDate;
	}


	public void setAssetValueDate(Date assetValueDate) {
		AssetValueDate = assetValueDate;
	}


	public String getATDocumentType() {
		return ATDocumentType;
	}


	public void setATDocumentType(String aTDocumentType) {
		ATDocumentType = aTDocumentType;
	}


	public int getAttachmentEntry() {
		return AttachmentEntry;
	}


	public void setAttachmentEntry(int attachmentEntry) {
		AttachmentEntry = attachmentEntry;
	}


	public String getAuthorizationCode() {
		return AuthorizationCode;
	}


	public void setAuthorizationCode(String authorizationCode) {
		AuthorizationCode = authorizationCode;
	}


	public String getAuthorizationStatus() {
		return AuthorizationStatus;
	}


	public void setAuthorizationStatus(String authorizationStatus) {
		AuthorizationStatus = authorizationStatus;
	}


	public double getBaseAmount() {
		return BaseAmount;
	}


	public void setBaseAmount(double baseAmount) {
		BaseAmount = baseAmount;
	}


	public double getBaseAmountFC() {
		return BaseAmountFC;
	}


	public void setBaseAmountFC(double baseAmountFC) {
		BaseAmountFC = baseAmountFC;
	}


	public double getBaseAmountSC() {
		return BaseAmountSC;
	}


	public void setBaseAmountSC(double baseAmountSC) {
		BaseAmountSC = baseAmountSC;
	}


	public String getBillOfExchangeReserved() {
		return BillOfExchangeReserved;
	}


	public void setBillOfExchangeReserved(String billOfExchangeReserved) {
		BillOfExchangeReserved = billOfExchangeReserved;
	}


	public int getBlanketAgreementNumber() {
		return BlanketAgreementNumber;
	}


	public void setBlanketAgreementNumber(int blanketAgreementNumber) {
		BlanketAgreementNumber = blanketAgreementNumber;
	}


	public String getBlockDunning() {
		return BlockDunning;
	}


	public void setBlockDunning(String blockDunning) {
		BlockDunning = blockDunning;
	}


	public String getBox1099() {
		return Box1099;
	}


	public void setBox1099(String box1099) {
		Box1099 = box1099;
	}


	public String getBPChannelCode() {
		return BPChannelCode;
	}


	public void setBPChannelCode(String bPChannelCode) {
		BPChannelCode = bPChannelCode;
	}


	public int getBPChannelContact() {
		return BPChannelContact;
	}


	public void setBPChannelContact(int bPChannelContact) {
		BPChannelContact = bPChannelContact;
	}


	public int getBPL_IDAssignedToInvoice() {
		return BPL_IDAssignedToInvoice;
	}


	public void setBPL_IDAssignedToInvoice(int bPL_IDAssignedToInvoice) {
		BPL_IDAssignedToInvoice = bPL_IDAssignedToInvoice;
	}


	public String getBPLName() {
		return BPLName;
	}


	public void setBPLName(String bPLName) {
		BPLName = bPLName;
	}


	public Date getCancelDate() {
		return CancelDate;
	}


	public void setCancelDate(Date cancelDate) {
		CancelDate = cancelDate;
	}


	public String getCancelled() {
		return Cancelled;
	}


	public void setCancelled(String cancelled) {
		Cancelled = cancelled;
	}


	public String getCancelStatus() {
		return CancelStatus;
	}


	public void setCancelStatus(String cancelStatus) {
		CancelStatus = cancelStatus;
	}


	public String getCardCode() {
		return CardCode;
	}


	public void setCardCode(String cardCode) {
		CardCode = cardCode;
	}


	public String getCardName() {
		return CardName;
	}


	public void setCardName(String cardName) {
		CardName = cardName;
	}


	public int getCashDiscountDateOffset() {
		return CashDiscountDateOffset;
	}


	public void setCashDiscountDateOffset(int cashDiscountDateOffset) {
		CashDiscountDateOffset = cashDiscountDateOffset;
	}


	public String getCentralBankIndicator() {
		return CentralBankIndicator;
	}


	public void setCentralBankIndicator(String centralBankIndicator) {
		CentralBankIndicator = centralBankIndicator;
	}


	public String getCertificationNumber() {
		return CertificationNumber;
	}


	public void setCertificationNumber(String certificationNumber) {
		CertificationNumber = certificationNumber;
	}


	public Date getClosingDate() {
		return ClosingDate;
	}


	public void setClosingDate(Date closingDate) {
		ClosingDate = closingDate;
	}


	public String getClosingOption() {
		return ClosingOption;
	}


	public void setClosingOption(String closingOption) {
		ClosingOption = closingOption;
	}


	public String getClosingRemarks() {
		return ClosingRemarks;
	}


	public void setClosingRemarks(String closingRemarks) {
		ClosingRemarks = closingRemarks;
	}


	public String getComments() {
		return Comments;
	}


	public void setComments(String comments) {
		Comments = comments;
	}


	public String getCommissionTrade() {
		return CommissionTrade;
	}


	public void setCommissionTrade(String commissionTrade) {
		CommissionTrade = commissionTrade;
	}


	public String getCommissionTradeReturn() {
		return CommissionTradeReturn;
	}


	public void setCommissionTradeReturn(String commissionTradeReturn) {
		CommissionTradeReturn = commissionTradeReturn;
	}


	public String getConfirmed() {
		return Confirmed;
	}


	public void setConfirmed(String confirmed) {
		Confirmed = confirmed;
	}


	public int getContactPersonCode() {
		return ContactPersonCode;
	}


	public void setContactPersonCode(int contactPersonCode) {
		ContactPersonCode = contactPersonCode;
	}


	public String getControlAccount() {
		return ControlAccount;
	}


	public void setControlAccount(String controlAccount) {
		ControlAccount = controlAccount;
	}


	public String getCreateOnlineQuotation() {
		return CreateOnlineQuotation;
	}


	public void setCreateOnlineQuotation(String createOnlineQuotation) {
		CreateOnlineQuotation = createOnlineQuotation;
	}


	public Date getCreationDate() {
		return CreationDate;
	}


	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}


	public Date getDateOfReportingControlStatementVAT() {
		return DateOfReportingControlStatementVAT;
	}


	public void setDateOfReportingControlStatementVAT(Date dateOfReportingControlStatementVAT) {
		DateOfReportingControlStatementVAT = dateOfReportingControlStatementVAT;
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


	public String getDocCurrency() {
		return DocCurrency;
	}


	public void setDocCurrency(String docCurrency) {
		DocCurrency = docCurrency;
	}


	public Date getDocDate() {
		return DocDate;
	}


	public void setDocDate(Date docDate) {
		DocDate = docDate;
	}


	public Date getDocDueDate() {
		return DocDueDate;
	}


	public void setDocDueDate(Date docDueDate) {
		DocDueDate = docDueDate;
	}


	public int getDocEntry() {
		return DocEntry;
	}


	public void setDocEntry(int docEntry) {
		DocEntry = docEntry;
	}


	public int getDocNum() {
		return DocNum;
	}


	public void setDocNum(int docNum) {
		DocNum = docNum;
	}


	public String getDocObjectCode() {
		return DocObjectCode;
	}


	public void setDocObjectCode(String docObjectCode) {
		DocObjectCode = docObjectCode;
	}


	public double getDocRate() {
		return DocRate;
	}


	public void setDocRate(double docRate) {
		DocRate = docRate;
	}


	public Instant getDocTime() {
		return DocTime;
	}


	public void setDocTime(Instant docTime) {
		DocTime = docTime;
	}


	public double getDocTotal() {
		return DocTotal;
	}


	public void setDocTotal(double docTotal) {
		DocTotal = docTotal;
	}


	public double getDocTotalFc() {
		return DocTotalFc;
	}


	public void setDocTotalFc(double docTotalFc) {
		DocTotalFc = docTotalFc;
	}


	public double getDocTotalSys() {
		return DocTotalSys;
	}


	public void setDocTotalSys(double docTotalSys) {
		DocTotalSys = docTotalSys;
	}


	public String getDocType() {
		return DocType;
	}


	public void setDocType(String docType) {
		DocType = docType;
	}


	public String getDocumentDelivery() {
		return DocumentDelivery;
	}


	public void setDocumentDelivery(String documentDelivery) {
		DocumentDelivery = documentDelivery;
	}


	public List<DocumentLines> getDocumentLines() {
		return DocumentLines;
	}


	public void setDocumentLines(List<DocumentLines> documentLines) {
		DocumentLines = documentLines;
	}


	public int getDocumentsOwner() {
		return DocumentsOwner;
	}


	public void setDocumentsOwner(int documentsOwner) {
		DocumentsOwner = documentsOwner;
	}


	public String getDocumentStatus() {
		return DocumentStatus;
	}


	public void setDocumentStatus(String documentStatus) {
		DocumentStatus = documentStatus;
	}


	public String getDocumentSubType() {
		return DocumentSubType;
	}


	public void setDocumentSubType(String documentSubType) {
		DocumentSubType = documentSubType;
	}


	public String getDocumentTaxID() {
		return DocumentTaxID;
	}


	public void setDocumentTaxID(String documentTaxID) {
		DocumentTaxID = documentTaxID;
	}


	public double getDownPayment() {
		return DownPayment;
	}


	public void setDownPayment(double downPayment) {
		DownPayment = downPayment;
	}


	public double getDownPaymentAmount() {
		return DownPaymentAmount;
	}


	public void setDownPaymentAmount(double downPaymentAmount) {
		DownPaymentAmount = downPaymentAmount;
	}


	public double getDownPaymentAmountFC() {
		return DownPaymentAmountFC;
	}


	public void setDownPaymentAmountFC(double downPaymentAmountFC) {
		DownPaymentAmountFC = downPaymentAmountFC;
	}


	public double getDownPaymentAmountSC() {
		return DownPaymentAmountSC;
	}


	public void setDownPaymentAmountSC(double downPaymentAmountSC) {
		DownPaymentAmountSC = downPaymentAmountSC;
	}


	public double getDownPaymentPercentage() {
		return DownPaymentPercentage;
	}


	public void setDownPaymentPercentage(double downPaymentPercentage) {
		DownPaymentPercentage = downPaymentPercentage;
	}


	public String getDownPaymentStatus() {
		return DownPaymentStatus;
	}


	public void setDownPaymentStatus(String downPaymentStatus) {
		DownPaymentStatus = downPaymentStatus;
	}


	public String getDownPaymentTrasactionID() {
		return DownPaymentTrasactionID;
	}


	public void setDownPaymentTrasactionID(String downPaymentTrasactionID) {
		DownPaymentTrasactionID = downPaymentTrasactionID;
	}


	public String getDownPaymentType() {
		return DownPaymentType;
	}


	public void setDownPaymentType(String downPaymentType) {
		DownPaymentType = downPaymentType;
	}


	public String getECommerceGSTIN() {
		return ECommerceGSTIN;
	}


	public void setECommerceGSTIN(String eCommerceGSTIN) {
		ECommerceGSTIN = eCommerceGSTIN;
	}


	public String getECommerceOperator() {
		return ECommerceOperator;
	}


	public void setECommerceOperator(String eCommerceOperator) {
		ECommerceOperator = eCommerceOperator;
	}


	public String getEDocErrorCode() {
		return EDocErrorCode;
	}


	public void setEDocErrorCode(String eDocErrorCode) {
		EDocErrorCode = eDocErrorCode;
	}


	public String getEDocErrorMessage() {
		return EDocErrorMessage;
	}


	public void setEDocErrorMessage(String eDocErrorMessage) {
		EDocErrorMessage = eDocErrorMessage;
	}


	public int getEDocExportFormat() {
		return EDocExportFormat;
	}


	public void setEDocExportFormat(int eDocExportFormat) {
		EDocExportFormat = eDocExportFormat;
	}


	public String getEDocGenerationType() {
		return EDocGenerationType;
	}


	public void setEDocGenerationType(String eDocGenerationType) {
		EDocGenerationType = eDocGenerationType;
	}


	public String getEDocNum() {
		return EDocNum;
	}


	public void setEDocNum(String eDocNum) {
		EDocNum = eDocNum;
	}


	public int getEDocSeries() {
		return EDocSeries;
	}


	public void setEDocSeries(int eDocSeries) {
		EDocSeries = eDocSeries;
	}


	public String getEDocStatus() {
		return EDocStatus;
	}


	public void setEDocStatus(String eDocStatus) {
		EDocStatus = eDocStatus;
	}


	public String getElecCommMessage() {
		return ElecCommMessage;
	}


	public void setElecCommMessage(String elecCommMessage) {
		ElecCommMessage = elecCommMessage;
	}


	public String getElecCommStatus() {
		return ElecCommStatus;
	}


	public void setElecCommStatus(String elecCommStatus) {
		ElecCommStatus = elecCommStatus;
	}


	public Date getEndDeliveryDate() {
		return EndDeliveryDate;
	}


	public void setEndDeliveryDate(Date endDeliveryDate) {
		EndDeliveryDate = endDeliveryDate;
	}


	public Instant getEndDeliveryTime() {
		return EndDeliveryTime;
	}


	public void setEndDeliveryTime(Instant endDeliveryTime) {
		EndDeliveryTime = endDeliveryTime;
	}


	public String getETaxNumber() {
		return ETaxNumber;
	}


	public void setETaxNumber(String eTaxNumber) {
		ETaxNumber = eTaxNumber;
	}


	public int getETaxWebSite() {
		return ETaxWebSite;
	}


	public void setETaxWebSite(int eTaxWebSite) {
		ETaxWebSite = eTaxWebSite;
	}


	public String getExcludeFromTaxReportControlStatementVAT() {
		return ExcludeFromTaxReportControlStatementVAT;
	}


	public void setExcludeFromTaxReportControlStatementVAT(String excludeFromTaxReportControlStatementVAT) {
		ExcludeFromTaxReportControlStatementVAT = excludeFromTaxReportControlStatementVAT;
	}


	public Date getExemptionValidityDateFrom() {
		return ExemptionValidityDateFrom;
	}


	public void setExemptionValidityDateFrom(Date exemptionValidityDateFrom) {
		ExemptionValidityDateFrom = exemptionValidityDateFrom;
	}


	public Date getExemptionValidityDateTo() {
		return ExemptionValidityDateTo;
	}


	public void setExemptionValidityDateTo(Date exemptionValidityDateTo) {
		ExemptionValidityDateTo = exemptionValidityDateTo;
	}


	public String getExternalCorrectedDocNum() {
		return ExternalCorrectedDocNum;
	}


	public void setExternalCorrectedDocNum(String externalCorrectedDocNum) {
		ExternalCorrectedDocNum = externalCorrectedDocNum;
	}


	public int getExtraDays() {
		return ExtraDays;
	}


	public void setExtraDays(int extraDays) {
		ExtraDays = extraDays;
	}


	public int getExtraMonth() {
		return ExtraMonth;
	}


	public void setExtraMonth(int extraMonth) {
		ExtraMonth = extraMonth;
	}


	public String getFederalTaxID() {
		return FederalTaxID;
	}


	public void setFederalTaxID(String federalTaxID) {
		FederalTaxID = federalTaxID;
	}


	public int getFinancialPeriod() {
		return FinancialPeriod;
	}


	public void setFinancialPeriod(int financialPeriod) {
		FinancialPeriod = financialPeriod;
	}


	public String getFiscalDocNum() {
		return FiscalDocNum;
	}


	public void setFiscalDocNum(String fiscalDocNum) {
		FiscalDocNum = fiscalDocNum;
	}


	public int getFolioNumber() {
		return FolioNumber;
	}


	public void setFolioNumber(int folioNumber) {
		FolioNumber = folioNumber;
	}


	public int getFolioNumberFrom() {
		return FolioNumberFrom;
	}


	public void setFolioNumberFrom(int folioNumberFrom) {
		FolioNumberFrom = folioNumberFrom;
	}


	public int getFolioNumberTo() {
		return FolioNumberTo;
	}


	public void setFolioNumberTo(int folioNumberTo) {
		FolioNumberTo = folioNumberTo;
	}


	public String getFolioPrefixString() {
		return FolioPrefixString;
	}


	public void setFolioPrefixString(String folioPrefixString) {
		FolioPrefixString = folioPrefixString;
	}


	public int getForm1099() {
		return Form1099;
	}


	public void setForm1099(int form1099) {
		Form1099 = form1099;
	}


	public double getGrosProfit() {
		return GrosProfit;
	}


	public void setGrosProfit(double grosProfit) {
		GrosProfit = grosProfit;
	}


	public String getGroupHandWritten() {
		return GroupHandWritten;
	}


	public void setGroupHandWritten(String groupHandWritten) {
		GroupHandWritten = groupHandWritten;
	}


	public int getGroupNumber() {
		return GroupNumber;
	}


	public void setGroupNumber(int groupNumber) {
		GroupNumber = groupNumber;
	}


	public int getGroupSeries() {
		return GroupSeries;
	}


	public void setGroupSeries(int groupSeries) {
		GroupSeries = groupSeries;
	}


	public String getGSTTransactionType() {
		return GSTTransactionType;
	}


	public void setGSTTransactionType(String gSTTransactionType) {
		GSTTransactionType = gSTTransactionType;
	}


	public int getGTSChecker() {
		return GTSChecker;
	}


	public void setGTSChecker(int gTSChecker) {
		GTSChecker = gTSChecker;
	}


	public int getGTSPayee() {
		return GTSPayee;
	}


	public void setGTSPayee(int gTSPayee) {
		GTSPayee = gTSPayee;
	}


	public String getHandWritten() {
		return HandWritten;
	}


	public void setHandWritten(String handWritten) {
		HandWritten = handWritten;
	}


	public int getImportFileNum() {
		return ImportFileNum;
	}


	public void setImportFileNum(int importFileNum) {
		ImportFileNum = importFileNum;
	}


	public String getIndicator() {
		return Indicator;
	}


	public void setIndicator(String indicator) {
		Indicator = indicator;
	}


	public String getInsuranceOperation347() {
		return InsuranceOperation347;
	}


	public void setInsuranceOperation347(String insuranceOperation347) {
		InsuranceOperation347 = insuranceOperation347;
	}


	public String getInterimType() {
		return InterimType;
	}


	public void setInterimType(String interimType) {
		InterimType = interimType;
	}


	public int getInternalCorrectedDocNum() {
		return InternalCorrectedDocNum;
	}


	public void setInternalCorrectedDocNum(int internalCorrectedDocNum) {
		InternalCorrectedDocNum = internalCorrectedDocNum;
	}


	public String getIsAlteration() {
		return IsAlteration;
	}


	public void setIsAlteration(String isAlteration) {
		IsAlteration = isAlteration;
	}


	public String getIsPayToBank() {
		return IsPayToBank;
	}


	public void setIsPayToBank(String isPayToBank) {
		IsPayToBank = isPayToBank;
	}


	public int getIssuingReason() {
		return IssuingReason;
	}


	public void setIssuingReason(int issuingReason) {
		IssuingReason = issuingReason;
	}


	public String getJournalMemo() {
		return JournalMemo;
	}


	public void setJournalMemo(String journalMemo) {
		JournalMemo = journalMemo;
	}


	public int getLanguageCode() {
		return LanguageCode;
	}


	public void setLanguageCode(int languageCode) {
		LanguageCode = languageCode;
	}


	public String getLetter() {
		return Letter;
	}


	public void setLetter(String letter) {
		Letter = letter;
	}


	public String getManualNumber() {
		return ManualNumber;
	}


	public void setManualNumber(String manualNumber) {
		ManualNumber = manualNumber;
	}


	public String getMaximumCashDiscount() {
		return MaximumCashDiscount;
	}


	public void setMaximumCashDiscount(String maximumCashDiscount) {
		MaximumCashDiscount = maximumCashDiscount;
	}


	public String getNetProcedure() {
		return NetProcedure;
	}


	public void setNetProcedure(String netProcedure) {
		NetProcedure = netProcedure;
	}


	public int getNextCorrectingDocument() {
		return NextCorrectingDocument;
	}


	public void setNextCorrectingDocument(int nextCorrectingDocument) {
		NextCorrectingDocument = nextCorrectingDocument;
	}


	public String getNTSApproved() {
		return NTSApproved;
	}


	public void setNTSApproved(String nTSApproved) {
		NTSApproved = nTSApproved;
	}


	public String getNTSApprovedNumber() {
		return NTSApprovedNumber;
	}


	public void setNTSApprovedNumber(String nTSApprovedNumber) {
		NTSApprovedNumber = nTSApprovedNumber;
	}


	public String getNumAtCard() {
		return NumAtCard;
	}


	public void setNumAtCard(String numAtCard) {
		NumAtCard = numAtCard;
	}


	public int getNumberOfInstallments() {
		return NumberOfInstallments;
	}


	public void setNumberOfInstallments(int numberOfInstallments) {
		NumberOfInstallments = numberOfInstallments;
	}


	public String getOpenForLandedCosts() {
		return OpenForLandedCosts;
	}


	public void setOpenForLandedCosts(String openForLandedCosts) {
		OpenForLandedCosts = openForLandedCosts;
	}


	public String getOpeningRemarks() {
		return OpeningRemarks;
	}


	public void setOpeningRemarks(String openingRemarks) {
		OpeningRemarks = openingRemarks;
	}


	public Date getOriginalCreditOrDebitDate() {
		return OriginalCreditOrDebitDate;
	}


	public void setOriginalCreditOrDebitDate(Date originalCreditOrDebitDate) {
		OriginalCreditOrDebitDate = originalCreditOrDebitDate;
	}


	public String getOriginalCreditOrDebitNo() {
		return OriginalCreditOrDebitNo;
	}


	public void setOriginalCreditOrDebitNo(String originalCreditOrDebitNo) {
		OriginalCreditOrDebitNo = originalCreditOrDebitNo;
	}


	public Date getOriginalRefDate() {
		return OriginalRefDate;
	}


	public void setOriginalRefDate(Date originalRefDate) {
		OriginalRefDate = originalRefDate;
	}


	public String getOriginalRefNo() {
		return OriginalRefNo;
	}


	public void setOriginalRefNo(String originalRefNo) {
		OriginalRefNo = originalRefNo;
	}


	public String getPartialSupply() {
		return PartialSupply;
	}


	public void setPartialSupply(String partialSupply) {
		PartialSupply = partialSupply;
	}


	public String getPaymentBlock() {
		return PaymentBlock;
	}


	public void setPaymentBlock(String paymentBlock) {
		PaymentBlock = paymentBlock;
	}


	public int getPaymentBlockEntry() {
		return PaymentBlockEntry;
	}


	public void setPaymentBlockEntry(int paymentBlockEntry) {
		PaymentBlockEntry = paymentBlockEntry;
	}


	public int getPaymentGroupCode() {
		return PaymentGroupCode;
	}


	public void setPaymentGroupCode(int paymentGroupCode) {
		PaymentGroupCode = paymentGroupCode;
	}


	public String getPaymentMethod() {
		return PaymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}


	public String getPaymentReference() {
		return PaymentReference;
	}


	public void setPaymentReference(String paymentReference) {
		PaymentReference = paymentReference;
	}


	public String getPayToBankAccountNo() {
		return PayToBankAccountNo;
	}


	public void setPayToBankAccountNo(String payToBankAccountNo) {
		PayToBankAccountNo = payToBankAccountNo;
	}


	public String getPayToBankBranch() {
		return PayToBankBranch;
	}


	public void setPayToBankBranch(String payToBankBranch) {
		PayToBankBranch = payToBankBranch;
	}


	public String getPayToBankCode() {
		return PayToBankCode;
	}


	public void setPayToBankCode(String payToBankCode) {
		PayToBankCode = payToBankCode;
	}


	public String getPayToBankCountry() {
		return PayToBankCountry;
	}


	public void setPayToBankCountry(String payToBankCountry) {
		PayToBankCountry = payToBankCountry;
	}


	public String getPayToCode() {
		return PayToCode;
	}


	public void setPayToCode(String payToCode) {
		PayToCode = payToCode;
	}


	public String getPeriodIndicator() {
		return PeriodIndicator;
	}


	public void setPeriodIndicator(String periodIndicator) {
		PeriodIndicator = periodIndicator;
	}


	public String getPick() {
		return Pick;
	}


	public void setPick(String pick) {
		Pick = pick;
	}


	public String getPickRemark() {
		return PickRemark;
	}


	public void setPickRemark(String pickRemark) {
		PickRemark = pickRemark;
	}


	public String getPickStatus() {
		return PickStatus;
	}


	public void setPickStatus(String pickStatus) {
		PickStatus = pickStatus;
	}


	public String getPointOfIssueCode() {
		return PointOfIssueCode;
	}


	public void setPointOfIssueCode(String pointOfIssueCode) {
		PointOfIssueCode = pointOfIssueCode;
	}


	public int getPOS_CashRegister() {
		return POS_CashRegister;
	}


	public void setPOS_CashRegister(int pOS_CashRegister) {
		POS_CashRegister = pOS_CashRegister;
	}


	public int getPOSCashierNumber() {
		return POSCashierNumber;
	}


	public void setPOSCashierNumber(int pOSCashierNumber) {
		POSCashierNumber = pOSCashierNumber;
	}


	public int getPOSDailySummaryNo() {
		return POSDailySummaryNo;
	}


	public void setPOSDailySummaryNo(int pOSDailySummaryNo) {
		POSDailySummaryNo = pOSDailySummaryNo;
	}


	public String getPOSEquipmentNumber() {
		return POSEquipmentNumber;
	}


	public void setPOSEquipmentNumber(String pOSEquipmentNumber) {
		POSEquipmentNumber = pOSEquipmentNumber;
	}


	public String getPOSManufacturerSerialNumber() {
		return POSManufacturerSerialNumber;
	}


	public void setPOSManufacturerSerialNumber(String pOSManufacturerSerialNumber) {
		POSManufacturerSerialNumber = pOSManufacturerSerialNumber;
	}


	public int getPOSReceiptNo() {
		return POSReceiptNo;
	}


	public void setPOSReceiptNo(int pOSReceiptNo) {
		POSReceiptNo = pOSReceiptNo;
	}


	public String getPrinted() {
		return Printed;
	}


	public void setPrinted(String printed) {
		Printed = printed;
	}


	public String getPrintSEPADirect() {
		return PrintSEPADirect;
	}


	public void setPrintSEPADirect(String printSEPADirect) {
		PrintSEPADirect = printSEPADirect;
	}


	public int getPrivateKeyVersion() {
		return PrivateKeyVersion;
	}


	public void setPrivateKeyVersion(int privateKeyVersion) {
		PrivateKeyVersion = privateKeyVersion;
	}


	public String getProject() {
		return Project;
	}


	public void setProject(String project) {
		Project = project;
	}


	public int getReceiver() {
		return Receiver;
	}


	public void setReceiver(int receiver) {
		Receiver = receiver;
	}


	public String getReference1() {
		return Reference1;
	}


	public void setReference1(String reference1) {
		Reference1 = reference1;
	}


	public String getReference2() {
		return Reference2;
	}


	public void setReference2(String reference2) {
		Reference2 = reference2;
	}


	public int getRelatedEntry() {
		return RelatedEntry;
	}


	public void setRelatedEntry(int relatedEntry) {
		RelatedEntry = relatedEntry;
	}


	public int getRelatedType() {
		return RelatedType;
	}


	public void setRelatedType(int relatedType) {
		RelatedType = relatedType;
	}


	public int getReleaser() {
		return Releaser;
	}


	public void setReleaser(int releaser) {
		Releaser = releaser;
	}


	public String getRelevantToGTS() {
		return RelevantToGTS;
	}


	public void setRelevantToGTS(String relevantToGTS) {
		RelevantToGTS = relevantToGTS;
	}


	public String getReopenManuallyClosedOrCanceledDocument() {
		return ReopenManuallyClosedOrCanceledDocument;
	}


	public void setReopenManuallyClosedOrCanceledDocument(String reopenManuallyClosedOrCanceledDocument) {
		ReopenManuallyClosedOrCanceledDocument = reopenManuallyClosedOrCanceledDocument;
	}


	public String getReopenOriginalDocument() {
		return ReopenOriginalDocument;
	}


	public void setReopenOriginalDocument(String reopenOriginalDocument) {
		ReopenOriginalDocument = reopenOriginalDocument;
	}


	public String getReportingSectionControlStatementVAT() {
		return ReportingSectionControlStatementVAT;
	}


	public void setReportingSectionControlStatementVAT(String reportingSectionControlStatementVAT) {
		ReportingSectionControlStatementVAT = reportingSectionControlStatementVAT;
	}


	public int getReqType() {
		return ReqType;
	}


	public void setReqType(int reqType) {
		ReqType = reqType;
	}


	public String getRequester() {
		return Requester;
	}


	public void setRequester(String requester) {
		Requester = requester;
	}


	public int getRequesterBranch() {
		return RequesterBranch;
	}


	public void setRequesterBranch(int requesterBranch) {
		RequesterBranch = requesterBranch;
	}


	public int getRequesterDepartment() {
		return RequesterDepartment;
	}


	public void setRequesterDepartment(int requesterDepartment) {
		RequesterDepartment = requesterDepartment;
	}


	public String getRequesterEmail() {
		return RequesterEmail;
	}


	public void setRequesterEmail(String requesterEmail) {
		RequesterEmail = requesterEmail;
	}


	public String getRequesterName() {
		return RequesterName;
	}


	public void setRequesterName(String requesterName) {
		RequesterName = requesterName;
	}


	public Date getRequriedDate() {
		return RequriedDate;
	}


	public void setRequriedDate(Date requriedDate) {
		RequriedDate = requriedDate;
	}


	public String getReserve() {
		return Reserve;
	}


	public void setReserve(String reserve) {
		Reserve = reserve;
	}


	public String getReserveInvoice() {
		return ReserveInvoice;
	}


	public void setReserveInvoice(String reserveInvoice) {
		ReserveInvoice = reserveInvoice;
	}


	public String getReuseDocumentNum() {
		return ReuseDocumentNum;
	}


	public void setReuseDocumentNum(String reuseDocumentNum) {
		ReuseDocumentNum = reuseDocumentNum;
	}


	public String getReuseNotaFiscalNum() {
		return ReuseNotaFiscalNum;
	}


	public void setReuseNotaFiscalNum(String reuseNotaFiscalNum) {
		ReuseNotaFiscalNum = reuseNotaFiscalNum;
	}


	public String getRevision() {
		return Revision;
	}


	public void setRevision(String revision) {
		Revision = revision;
	}


	public String getRevisionPo() {
		return RevisionPo;
	}


	public void setRevisionPo(String revisionPo) {
		RevisionPo = revisionPo;
	}


	public String getRounding() {
		return Rounding;
	}


	public void setRounding(String rounding) {
		Rounding = rounding;
	}


	public double getRoundingDiffAmount() {
		return RoundingDiffAmount;
	}


	public void setRoundingDiffAmount(double roundingDiffAmount) {
		RoundingDiffAmount = roundingDiffAmount;
	}


	public double getRoundingDiffAmountFC() {
		return RoundingDiffAmountFC;
	}


	public void setRoundingDiffAmountFC(double roundingDiffAmountFC) {
		RoundingDiffAmountFC = roundingDiffAmountFC;
	}


	public double getRoundingDiffAmountSC() {
		return RoundingDiffAmountSC;
	}


	public void setRoundingDiffAmountSC(double roundingDiffAmountSC) {
		RoundingDiffAmountSC = roundingDiffAmountSC;
	}


	public int getSalesPersonCode() {
		return SalesPersonCode;
	}


	public void setSalesPersonCode(int salesPersonCode) {
		SalesPersonCode = salesPersonCode;
	}


	public int getSegment() {
		return Segment;
	}


	public void setSegment(int segment) {
		Segment = segment;
	}


	public String getSendNotification() {
		return SendNotification;
	}


	public void setSendNotification(String sendNotification) {
		SendNotification = sendNotification;
	}


	public int getSequenceCode() {
		return SequenceCode;
	}


	public void setSequenceCode(int sequenceCode) {
		SequenceCode = sequenceCode;
	}


	public String getSequenceModel() {
		return SequenceModel;
	}


	public void setSequenceModel(String sequenceModel) {
		SequenceModel = sequenceModel;
	}


	public int getSequenceSerial() {
		return SequenceSerial;
	}


	public void setSequenceSerial(int sequenceSerial) {
		SequenceSerial = sequenceSerial;
	}


	public int getSeries() {
		return Series;
	}


	public void setSeries(int series) {
		Series = series;
	}


	public String getSeriesString() {
		return SeriesString;
	}


	public void setSeriesString(String seriesString) {
		SeriesString = seriesString;
	}


	public double getServiceGrossProfitPercent() {
		return ServiceGrossProfitPercent;
	}


	public void setServiceGrossProfitPercent(double serviceGrossProfitPercent) {
		ServiceGrossProfitPercent = serviceGrossProfitPercent;
	}


	public String getShipFrom() {
		return ShipFrom;
	}


	public void setShipFrom(String shipFrom) {
		ShipFrom = shipFrom;
	}


	public String getShipToCode() {
		return ShipToCode;
	}


	public void setShipToCode(String shipToCode) {
		ShipToCode = shipToCode;
	}


	public String getShowSCN() {
		return ShowSCN;
	}


	public void setShowSCN(String showSCN) {
		ShowSCN = showSCN;
	}


	public String getSignatureDigest() {
		return SignatureDigest;
	}


	public void setSignatureDigest(String signatureDigest) {
		SignatureDigest = signatureDigest;
	}


	public String getSignatureInputMessage() {
		return SignatureInputMessage;
	}


	public void setSignatureInputMessage(String signatureInputMessage) {
		SignatureInputMessage = signatureInputMessage;
	}


	public String getSlpCode() {
		return SlpCode;
	}


	public void setSlpCode(String slpCode) {
		SlpCode = slpCode;
	}


	public Date getSpecifiedClosingDate() {
		return SpecifiedClosingDate;
	}


	public void setSpecifiedClosingDate(Date specifiedClosingDate) {
		SpecifiedClosingDate = specifiedClosingDate;
	}


	public Date getStartDeliveryDate() {
		return StartDeliveryDate;
	}


	public void setStartDeliveryDate(Date startDeliveryDate) {
		StartDeliveryDate = startDeliveryDate;
	}


	public Instant getStartDeliveryTime() {
		return StartDeliveryTime;
	}


	public void setStartDeliveryTime(Instant startDeliveryTime) {
		StartDeliveryTime = startDeliveryTime;
	}


	public String getStartFrom() {
		return StartFrom;
	}


	public void setStartFrom(String startFrom) {
		StartFrom = startFrom;
	}


	public String getSubmitted() {
		return Submitted;
	}


	public void setSubmitted(String submitted) {
		Submitted = submitted;
	}


	public String getSubSeriesString() {
		return SubSeriesString;
	}


	public void setSubSeriesString(String subSeriesString) {
		SubSeriesString = subSeriesString;
	}


	public String getSummeryType() {
		return SummeryType;
	}


	public void setSummeryType(String summeryType) {
		SummeryType = summeryType;
	}


	public String getSupplier() {
		return Supplier;
	}


	public void setSupplier(String supplier) {
		Supplier = supplier;
	}


	public Date getTaxDate() {
		return TaxDate;
	}


	public void setTaxDate(Date taxDate) {
		TaxDate = taxDate;
	}


	public String getTaxExemptionLetterNum() {
		return TaxExemptionLetterNum;
	}


	public void setTaxExemptionLetterNum(String taxExemptionLetterNum) {
		TaxExemptionLetterNum = taxExemptionLetterNum;
	}


	public Date getTaxInvoiceDate() {
		return TaxInvoiceDate;
	}


	public void setTaxInvoiceDate(Date taxInvoiceDate) {
		TaxInvoiceDate = taxInvoiceDate;
	}


	public String getTaxInvoiceNo() {
		return TaxInvoiceNo;
	}


	public void setTaxInvoiceNo(String taxInvoiceNo) {
		TaxInvoiceNo = taxInvoiceNo;
	}


	public double getTotalDiscount() {
		return TotalDiscount;
	}


	public void setTotalDiscount(double totalDiscount) {
		TotalDiscount = totalDiscount;
	}


	public double getTotalDiscountFC() {
		return TotalDiscountFC;
	}


	public void setTotalDiscountFC(double totalDiscountFC) {
		TotalDiscountFC = totalDiscountFC;
	}


	public double getTotalDiscountSC() {
		return TotalDiscountSC;
	}


	public void setTotalDiscountSC(double totalDiscountSC) {
		TotalDiscountSC = totalDiscountSC;
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


	public String getTrackingNumber() {
		return TrackingNumber;
	}


	public void setTrackingNumber(String trackingNumber) {
		TrackingNumber = trackingNumber;
	}


	public int getTransNum() {
		return TransNum;
	}


	public void setTransNum(int transNum) {
		TransNum = transNum;
	}


	public int getTransportationCode() {
		return TransportationCode;
	}


	public void setTransportationCode(int transportationCode) {
		TransportationCode = transportationCode;
	}


	public String getU_AgeCob() {
		return U_AgeCob;
	}


	public void setU_AgeCob(String u_AgeCob) {
		U_AgeCob = u_AgeCob;
	}


	public String getU_Agencia() {
		return U_Agencia;
	}


	public void setU_Agencia(String u_Agencia) {
		U_Agencia = u_Agencia;
	}


	public String getU_AplInt() {
		return U_AplInt;
	}


	public void setU_AplInt(String u_AplInt) {
		U_AplInt = u_AplInt;
	}


	public String getU_BDOC() {
		return U_BDOC;
	}


	public void setU_BDOC(String u_BDOC) {
		U_BDOC = u_BDOC;
	}


	public String getU_caja() {
		return U_caja;
	}


	public void setU_caja(String u_caja) {
		U_caja = u_caja;
	}


	public String getU_Canal() {
		return U_Canal;
	}


	public void setU_Canal(String u_Canal) {
		U_Canal = u_Canal;
	}


	public String getU_CanCobro() {
		return U_CanCobro;
	}


	public void setU_CanCobro(String u_CanCobro) {
		U_CanCobro = u_CanCobro;
	}


	public String getU_CardName() {
		return U_CardName;
	}


	public void setU_CardName(String u_CardName) {
		U_CardName = u_CardName;
	}


	public String getU_Cobrador() {
		return U_Cobrador;
	}


	public void setU_Cobrador(String u_Cobrador) {
		U_Cobrador = u_Cobrador;
	}


	public String getU_Condic() {
		return U_Condic;
	}


	public void setU_Condic(String u_Condic) {
		U_Condic = u_Condic;
	}


	public String getU_Consignacion() {
		return U_Consignacion;
	}


	public void setU_Consignacion(String u_Consignacion) {
		U_Consignacion = u_Consignacion;
	}


	public int getU_Contrato() {
		return U_Contrato;
	}


	public void setU_Contrato(int u_Contrato) {
		U_Contrato = u_Contrato;
	}


	public Date getU_DocEntrega() {
		return U_DocEntrega;
	}


	public void setU_DocEntrega(Date u_DocEntrega) {
		U_DocEntrega = u_DocEntrega;
	}


	public String getU_DocHacienda() {
		return U_DocHacienda;
	}


	public void setU_DocHacienda(String u_DocHacienda) {
		U_DocHacienda = u_DocHacienda;
	}


	public String getU_ClaveNumerica() {
		return U_ClaveNumerica;
	}


	public void setU_ClaveNumerica(String u_ClaveNumerica) {
		U_ClaveNumerica = u_ClaveNumerica;
	}


	public Date getU_ETA() {
		return U_ETA;
	}


	public void setU_ETA(Date u_ETA) {
		U_ETA = u_ETA;
	}


	public Date getU_ETS() {
		return U_ETS;
	}


	public void setU_ETS(Date u_ETS) {
		U_ETS = u_ETS;
	}


	public String getU_FactInc() {
		return U_FactInc;
	}


	public void setU_FactInc(String u_FactInc) {
		U_FactInc = u_FactInc;
	}


	public Date getU_FecExon() {
		return U_FecExon;
	}


	public void setU_FecExon(Date u_FecExon) {
		U_FecExon = u_FecExon;
	}


	public String getU_FormPag() {
		return U_FormPag;
	}


	public void setU_FormPag(String u_FormPag) {
		U_FormPag = u_FormPag;
	}


	public int getU_GTI_ID() {
		return U_GTI_ID;
	}


	public void setU_GTI_ID(int u_GTI_ID) {
		U_GTI_ID = u_GTI_ID;
	}


	public int getU_GTI_MOTIVOS() {
		return U_GTI_MOTIVOS;
	}


	public void setU_GTI_MOTIVOS(int u_GTI_MOTIVOS) {
		U_GTI_MOTIVOS = u_GTI_MOTIVOS;
	}


	public String getU_INCOTERM() {
		return U_INCOTERM;
	}


	public void setU_INCOTERM(String u_INCOTERM) {
		U_INCOTERM = u_INCOTERM;
	}


	public String getU_IND151() {
		return U_IND151;
	}


	public void setU_IND151(String u_IND151) {
		U_IND151 = u_IND151;
	}


	public String getU_IndTiquete() {
		return U_IndTiquete;
	}


	public void setU_IndTiquete(String u_IndTiquete) {
		U_IndTiquete = u_IndTiquete;
	}


	public String getU_LugarEntrega() {
		return U_LugarEntrega;
	}


	public void setU_LugarEntrega(String u_LugarEntrega) {
		U_LugarEntrega = u_LugarEntrega;
	}


	public String getU_MedioPago() {
		return U_MedioPago;
	}


	public void setU_MedioPago(String u_MedioPago) {
		U_MedioPago = u_MedioPago;
	}


	public String getU_NAR() {
		return U_NAR;
	}


	public void setU_NAR(String u_NAR) {
		U_NAR = u_NAR;
	}


	public String getU_NatDesc() {
		return U_NatDesc;
	}


	public void setU_NatDesc(String u_NatDesc) {
		U_NatDesc = u_NatDesc;
	}


	public String getU_NCA() {
		return U_NCA;
	}


	public void setU_NCA(String u_NCA) {
		U_NCA = u_NCA;
	}


	public String getU_NNE() {
		return U_NNE;
	}


	public void setU_NNE(String u_NNE) {
		U_NNE = u_NNE;
	}


	public String getU_NPR() {
		return U_NPR;
	}


	public void setU_NPR(String u_NPR) {
		U_NPR = u_NPR;
	}


	public String getU_NSP() {
		return U_NSP;
	}


	public void setU_NSP(String u_NSP) {
		U_NSP = u_NSP;
	}


	public String getU_NumElec() {
		return U_NumElec;
	}


	public void setU_NumElec(String u_NumElec) {
		U_NumElec = u_NumElec;
	}


	public String getU_NumPedido() {
		return U_NumPedido;
	}


	public void setU_NumPedido(String u_NumPedido) {
		U_NumPedido = u_NumPedido;
	}


	public String getU_OrdenCompra() {
		return U_OrdenCompra;
	}


	public void setU_OrdenCompra(String u_OrdenCompra) {
		U_OrdenCompra = u_OrdenCompra;
	}


	public String getU_ORIPRE() {
		return U_ORIPRE;
	}


	public void setU_ORIPRE(String u_ORIPRE) {
		U_ORIPRE = u_ORIPRE;
	}


	public String getU_PO() {
		return U_PO;
	}


	public void setU_PO(String u_PO) {
		U_PO = u_PO;
	}


	public String getU_REFDOC() {
		return U_REFDOC;
	}


	public void setU_REFDOC(String u_REFDOC) {
		U_REFDOC = u_REFDOC;
	}


	public int getU_RefInt() {
		return U_RefInt;
	}


	public void setU_RefInt(int u_RefInt) {
		U_RefInt = u_RefInt;
	}


	public int getU_SCG_Com() {
		return U_SCG_Com;
	}


	public void setU_SCG_Com(int u_SCG_Com) {
		U_SCG_Com = u_SCG_Com;
	}


	public String getU_SCGCOM_CalCom() {
		return U_SCGCOM_CalCom;
	}


	public void setU_SCGCOM_CalCom(String u_SCGCOM_CalCom) {
		U_SCGCOM_CalCom = u_SCGCOM_CalCom;
	}


	public int getU_SCGRMS_Caja() {
		return U_SCGRMS_Caja;
	}


	public void setU_SCGRMS_Caja(int u_SCGRMS_Caja) {
		U_SCGRMS_Caja = u_SCGRMS_Caja;
	}


	public Date getU_SCGRMS_FechaUpdt() {
		return U_SCGRMS_FechaUpdt;
	}


	public void setU_SCGRMS_FechaUpdt(Date u_SCGRMS_FechaUpdt) {
		U_SCGRMS_FechaUpdt = u_SCGRMS_FechaUpdt;
	}


	public String getU_SCGRMS_Filler2() {
		return U_SCGRMS_Filler2;
	}


	public void setU_SCGRMS_Filler2(String u_SCGRMS_Filler2) {
		U_SCGRMS_Filler2 = u_SCGRMS_Filler2;
	}


	public int getU_SCGRMS_IdDoc() {
		return U_SCGRMS_IdDoc;
	}


	public void setU_SCGRMS_IdDoc(int u_SCGRMS_IdDoc) {
		U_SCGRMS_IdDoc = u_SCGRMS_IdDoc;
	}


	public int getU_SCGRMS_Jornada() {
		return U_SCGRMS_Jornada;
	}


	public void setU_SCGRMS_Jornada(int u_SCGRMS_Jornada) {
		U_SCGRMS_Jornada = u_SCGRMS_Jornada;
	}


	public String getU_SCGRMS_NmbCaja() {
		return U_SCGRMS_NmbCaja;
	}


	public void setU_SCGRMS_NmbCaja(String u_SCGRMS_NmbCaja) {
		U_SCGRMS_NmbCaja = u_SCGRMS_NmbCaja;
	}


	public int getU_SCGRMS_NumDoc() {
		return U_SCGRMS_NumDoc;
	}


	public void setU_SCGRMS_NumDoc(int u_SCGRMS_NumDoc) {
		U_SCGRMS_NumDoc = u_SCGRMS_NumDoc;
	}


	public String getU_SCGRMS_NumDocLey() {
		return U_SCGRMS_NumDocLey;
	}


	public void setU_SCGRMS_NumDocLey(String u_SCGRMS_NumDocLey) {
		U_SCGRMS_NumDocLey = u_SCGRMS_NumDocLey;
	}


	public String getU_SCGRMS_Referencia0() {
		return U_SCGRMS_Referencia0;
	}


	public void setU_SCGRMS_Referencia0(String u_SCGRMS_Referencia0) {
		U_SCGRMS_Referencia0 = u_SCGRMS_Referencia0;
	}


	public String getU_SCGRMS_Referencia1() {
		return U_SCGRMS_Referencia1;
	}


	public void setU_SCGRMS_Referencia1(String u_SCGRMS_Referencia1) {
		U_SCGRMS_Referencia1 = u_SCGRMS_Referencia1;
	}


	public String getU_SCGRMS_Referencia2() {
		return U_SCGRMS_Referencia2;
	}


	public void setU_SCGRMS_Referencia2(String u_SCGRMS_Referencia2) {
		U_SCGRMS_Referencia2 = u_SCGRMS_Referencia2;
	}


	public String getU_SCGRMS_Referencia3() {
		return U_SCGRMS_Referencia3;
	}


	public void setU_SCGRMS_Referencia3(String u_SCGRMS_Referencia3) {
		U_SCGRMS_Referencia3 = u_SCGRMS_Referencia3;
	}


	public String getU_SCGRMS_Referencia4() {
		return U_SCGRMS_Referencia4;
	}


	public void setU_SCGRMS_Referencia4(String u_SCGRMS_Referencia4) {
		U_SCGRMS_Referencia4 = u_SCGRMS_Referencia4;
	}


	public String getU_SCGRMS_Referencia5() {
		return U_SCGRMS_Referencia5;
	}


	public void setU_SCGRMS_Referencia5(String u_SCGRMS_Referencia5) {
		U_SCGRMS_Referencia5 = u_SCGRMS_Referencia5;
	}


	public String getU_SCGRMS_Referencia6() {
		return U_SCGRMS_Referencia6;
	}


	public void setU_SCGRMS_Referencia6(String u_SCGRMS_Referencia6) {
		U_SCGRMS_Referencia6 = u_SCGRMS_Referencia6;
	}


	public String getU_SCGRMS_Referencia7() {
		return U_SCGRMS_Referencia7;
	}


	public void setU_SCGRMS_Referencia7(String u_SCGRMS_Referencia7) {
		U_SCGRMS_Referencia7 = u_SCGRMS_Referencia7;
	}


	public String getU_SCGRMS_Referencia8() {
		return U_SCGRMS_Referencia8;
	}


	public void setU_SCGRMS_Referencia8(String u_SCGRMS_Referencia8) {
		U_SCGRMS_Referencia8 = u_SCGRMS_Referencia8;
	}


	public String getU_SCGRMS_Referencia9() {
		return U_SCGRMS_Referencia9;
	}


	public void setU_SCGRMS_Referencia9(String u_SCGRMS_Referencia9) {
		U_SCGRMS_Referencia9 = u_SCGRMS_Referencia9;
	}


	public String getU_SCGRMS_Replica() {
		return U_SCGRMS_Replica;
	}


	public void setU_SCGRMS_Replica(String u_SCGRMS_Replica) {
		U_SCGRMS_Replica = u_SCGRMS_Replica;
	}


	public String getU_SCGRMS_ResoAuto() {
		return U_SCGRMS_ResoAuto;
	}


	public void setU_SCGRMS_ResoAuto(String u_SCGRMS_ResoAuto) {
		U_SCGRMS_ResoAuto = u_SCGRMS_ResoAuto;
	}


	public String getU_SCGRMS_Tienda() {
		return U_SCGRMS_Tienda;
	}


	public void setU_SCGRMS_Tienda(String u_SCGRMS_Tienda) {
		U_SCGRMS_Tienda = u_SCGRMS_Tienda;
	}


	public String getU_SCGRMS_TiendaUdt() {
		return U_SCGRMS_TiendaUdt;
	}


	public void setU_SCGRMS_TiendaUdt(String u_SCGRMS_TiendaUdt) {
		U_SCGRMS_TiendaUdt = u_SCGRMS_TiendaUdt;
	}


	public String getU_SCGRMS_UserInsrt() {
		return U_SCGRMS_UserInsrt;
	}


	public void setU_SCGRMS_UserInsrt(String u_SCGRMS_UserInsrt) {
		U_SCGRMS_UserInsrt = u_SCGRMS_UserInsrt;
	}


	public String getU_SCGRMS_UserUpdt() {
		return U_SCGRMS_UserUpdt;
	}


	public void setU_SCGRMS_UserUpdt(String u_SCGRMS_UserUpdt) {
		U_SCGRMS_UserUpdt = u_SCGRMS_UserUpdt;
	}


	public String getU_Sucursal() {
		return U_Sucursal;
	}


	public void setU_Sucursal(String u_Sucursal) {
		U_Sucursal = u_Sucursal;
	}


	public int getU_Suscriptor() {
		return U_Suscriptor;
	}


	public void setU_Suscriptor(int u_Suscriptor) {
		U_Suscriptor = u_Suscriptor;
	}


	public String getU_TipoDoc() {
		return U_TipoDoc;
	}


	public void setU_TipoDoc(String u_TipoDoc) {
		U_TipoDoc = u_TipoDoc;
	}


	public int getU_TipoExon() {
		return U_TipoExon;
	}


	public void setU_TipoExon(int u_TipoExon) {
		U_TipoExon = u_TipoExon;
	}


	public String getU_U_BREF() {
		return U_U_BREF;
	}


	public void setU_U_BREF(String u_U_BREF) {
		U_U_BREF = u_U_BREF;
	}


	public String getU_usrcaja() {
		return U_usrcaja;
	}


	public void setU_usrcaja(String u_usrcaja) {
		U_usrcaja = u_usrcaja;
	}


	public String getU_ZCobro() {
		return U_ZCobro;
	}


	public void setU_ZCobro(String u_ZCobro) {
		U_ZCobro = u_ZCobro;
	}


	public String getU_Zona() {
		return U_Zona;
	}


	public void setU_Zona(String u_Zona) {
		U_Zona = u_Zona;
	}


	public String getU_REFNUM() {
		return U_REFNUM;
	}


	public void setU_REFNUM(String u_REFNUM) {
		U_REFNUM = u_REFNUM;
	}


	public String getU_REFFECHA() {
		return U_REFFECHA;
	}


	public void setU_REFFECHA(String u_REFFECHA) {
		U_REFFECHA = u_REFFECHA;
	}


	public String getU_REFTIPOR() {
		return U_REFTIPOR;
	}


	public void setU_REFTIPOR(String u_REFTIPOR) {
		U_REFTIPOR = u_REFTIPOR;
	}


	public String getU_REFTIPOD() {
		return U_REFTIPOD;
	}


	public void setU_REFTIPOD(String u_REFTIPOD) {
		U_REFTIPOD = u_REFTIPOD;
	}


	public String getU_REFRAZON() {
		return U_REFRAZON;
	}


	public void setU_REFRAZON(String u_REFRAZON) {
		U_REFRAZON = u_REFRAZON;
	}


	public String getU_NUM_CONSE() {
		return U_NUM_CONSE;
	}


	public void setU_NUM_CONSE(String u_NUM_CONSE) {
		U_NUM_CONSE = u_NUM_CONSE;
	}


	public Date getUpdateDate() {
		return UpdateDate;
	}


	public void setUpdateDate(Date updateDate) {
		UpdateDate = updateDate;
	}


	public Instant getUpDate() {
		return UpDate;
	}


	public void setUpDate(Instant upDate) {
		UpDate = upDate;
	}


	public String getUseBillToAddrToDetermineTax() {
		return UseBillToAddrToDetermineTax;
	}


	public void setUseBillToAddrToDetermineTax(String useBillToAddrToDetermineTax) {
		UseBillToAddrToDetermineTax = useBillToAddrToDetermineTax;
	}


	public String getUseCorrectionVATGroup() {
		return UseCorrectionVATGroup;
	}


	public void setUseCorrectionVATGroup(String useCorrectionVATGroup) {
		UseCorrectionVATGroup = useCorrectionVATGroup;
	}


	public String getUseShpdGoodsAct() {
		return UseShpdGoodsAct;
	}


	public void setUseShpdGoodsAct(String useShpdGoodsAct) {
		UseShpdGoodsAct = useShpdGoodsAct;
	}


	public Date getVatDate() {
		return VatDate;
	}


	public void setVatDate(Date vatDate) {
		VatDate = vatDate;
	}


	public double getVatPercent() {
		return VatPercent;
	}


	public void setVatPercent(double vatPercent) {
		VatPercent = vatPercent;
	}


	public String getVATRegNum() {
		return VATRegNum;
	}


	public void setVATRegNum(String vATRegNum) {
		VATRegNum = vATRegNum;
	}


	public double getVatSum() {
		return VatSum;
	}


	public void setVatSum(double vatSum) {
		VatSum = vatSum;
	}


	public double getVatSumFc() {
		return VatSumFc;
	}


	public void setVatSumFc(double vatSumFc) {
		VatSumFc = vatSumFc;
	}


	public double getVatSumSys() {
		return VatSumSys;
	}


	public void setVatSumSys(double vatSumSys) {
		VatSumSys = vatSumSys;
	}


	public String getVehiclePlate() {
		return VehiclePlate;
	}


	public void setVehiclePlate(String vehiclePlate) {
		VehiclePlate = vehiclePlate;
	}


	public String getWareHouseUpdateType() {
		return WareHouseUpdateType;
	}


	public void setWareHouseUpdateType(String wareHouseUpdateType) {
		WareHouseUpdateType = wareHouseUpdateType;
	}


	public double getWTAmount() {
		return WTAmount;
	}


	public void setWTAmount(double wTAmount) {
		WTAmount = wTAmount;
	}


	public double getWTAmountFC() {
		return WTAmountFC;
	}


	public void setWTAmountFC(double wTAmountFC) {
		WTAmountFC = wTAmountFC;
	}


	public double getWTAmountSC() {
		return WTAmountSC;
	}


	public void setWTAmountSC(double wTAmountSC) {
		WTAmountSC = wTAmountSC;
	}


	public double getWTApplied() {
		return WTApplied;
	}


	public void setWTApplied(double wTApplied) {
		WTApplied = wTApplied;
	}


	public double getWTAppliedFC() {
		return WTAppliedFC;
	}


	public void setWTAppliedFC(double wTAppliedFC) {
		WTAppliedFC = wTAppliedFC;
	}


	public double getWTAppliedSC() {
		return WTAppliedSC;
	}


	public void setWTAppliedSC(double wTAppliedSC) {
		WTAppliedSC = wTAppliedSC;
	}


	public double getWTExemptedAmount() {
		return WTExemptedAmount;
	}


	public void setWTExemptedAmount(double wTExemptedAmount) {
		WTExemptedAmount = wTExemptedAmount;
	}


	public double getWTExemptedAmountFC() {
		return WTExemptedAmountFC;
	}


	public void setWTExemptedAmountFC(double wTExemptedAmountFC) {
		WTExemptedAmountFC = wTExemptedAmountFC;
	}


	public double getWTExemptedAmountSC() {
		return WTExemptedAmountSC;
	}


	public void setWTExemptedAmountSC(double wTExemptedAmountSC) {
		WTExemptedAmountSC = wTExemptedAmountSC;
	}


	public double getWTNonSubjectAmount() {
		return WTNonSubjectAmount;
	}


	public void setWTNonSubjectAmount(double wTNonSubjectAmount) {
		WTNonSubjectAmount = wTNonSubjectAmount;
	}


	public double getWTNonSubjectAmountFC() {
		return WTNonSubjectAmountFC;
	}


	public void setWTNonSubjectAmountFC(double wTNonSubjectAmountFC) {
		WTNonSubjectAmountFC = wTNonSubjectAmountFC;
	}


	public double getWTNonSubjectAmountSC() {
		return WTNonSubjectAmountSC;
	}


	public void setWTNonSubjectAmountSC(double wTNonSubjectAmountSC) {
		WTNonSubjectAmountSC = wTNonSubjectAmountSC;
	}


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
