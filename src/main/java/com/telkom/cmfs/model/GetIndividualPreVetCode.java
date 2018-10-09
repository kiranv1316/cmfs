package com.telkom.cmfs.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "orderNumber", "segment", "actionType", "surname", "fullNames", "initials", "idType",
		"identityOrPassport", "buildingName", "buildingNumber", "streetName", "streetNumber", "suburb", "town",
		"postalCode", "postalBuildingName", "postalBuildingNumber", "postalStreetName", "postalStreetNumber",
		"postSuburb", "postalTown", "postPostalCode", "cellNumber", "workNumber", "homeTelephoneNumber", "faxNumber",
		"emailAddress", "employerName", "employerBuildingName", "employerBuildingNumber", "employerStreetName",
		"employerStreetNumber", "employerSuburb", "employerTown", "employerPostalCode", "employmentType",
		"employmentDate", "employmentPeriod", "bankName", "branchCode", "bankAccountHolderName",
		"bankAccountHolderSurname", "bankAcccountHolderIdentityNumber", "bankAccountNumber", "bankAccountType",
		"debitOrderDate", "contactPersonName", "contactPersonsContactNumber", "grossIncome", "netIncome", "otherIncome",
		"monthlyExpenses", "sourceIpAddress", "Products", "agentName", "orderChannel", "banNumber", "banStatus",
		"startServiceDate", "creditClass", "delinquent", "delinquentStatusDate", "arBalance", "writeOffIndicator",
		"accountType", "colAgencyName", "dateStatusChanged" })
public class GetIndividualPreVetCode implements Serializable {

	@JsonProperty("orderNumber")
	private String orderNumber;
	@JsonProperty("segment")
	private String segment;
	@JsonProperty("actionType")
	private String actionType;
	@JsonProperty("surname")
	private String surname;
	@JsonProperty("fullNames")
	private String fullNames;
	@JsonProperty("initials")
	private String initials;
	@JsonProperty("idType")
	private String idType;
	@JsonProperty("identityOrPassport")
	private String identityOrPassport;
	@JsonProperty("buildingName")
	private String buildingName;
	@JsonProperty("buildingNumber")
	private String buildingNumber;
	@JsonProperty("streetName")
	private String streetName;
	@JsonProperty("streetNumber")
	private String streetNumber;
	@JsonProperty("suburb")
	private String suburb;
	@JsonProperty("town")
	private String town;
	@JsonProperty("postalCode")
	private String postalCode;
	@JsonProperty("postalBuildingName")
	private String postalBuildingName;
	@JsonProperty("postalBuildingNumber")
	private String postalBuildingNumber;
	@JsonProperty("postalStreetName")
	private String postalStreetName;
	@JsonProperty("postalStreetNumber")
	private String postalStreetNumber;
	@JsonProperty("postSuburb")
	private String postSuburb;
	@JsonProperty("postalTown")
	private String postalTown;
	@JsonProperty("postPostalCode")
	private String postPostalCode;
	@JsonProperty("cellNumber")
	private String cellNumber;
	@JsonProperty("workNumber")
	private String workNumber;
	@JsonProperty("homeTelephoneNumber")
	private String homeTelephoneNumber;
	@JsonProperty("faxNumber")
	private String faxNumber;
	@JsonProperty("emailAddress")
	private String emailAddress;
	@JsonProperty("employerName")
	private String employerName;
	@JsonProperty("employerBuildingName")
	private String employerBuildingName;
	@JsonProperty("employerBuildingNumber")
	private String employerBuildingNumber;
	@JsonProperty("employerStreetName")
	private String employerStreetName;
	@JsonProperty("employerStreetNumber")
	private String employerStreetNumber;
	@JsonProperty("employerSuburb")
	private String employerSuburb;
	@JsonProperty("employerTown")
	private String employerTown;
	@JsonProperty("employerPostalCode")
	private String employerPostalCode;
	@JsonProperty("employmentType")
	private String employmentType;
	@JsonProperty("employmentDate")
	private String employmentDate;
	@JsonProperty("employmentPeriod")
	private String employmentPeriod;
	@JsonProperty("bankName")
	private String bankName;
	@JsonProperty("branchCode")
	private String branchCode;
	@JsonProperty("bankAccountHolderName")
	private String bankAccountHolderName;
	@JsonProperty("bankAccountHolderSurname")
	private String bankAccountHolderSurname;
	@JsonProperty("bankAcccountHolderIdentityNumber")
	private String bankAcccountHolderIdentityNumber;
	@JsonProperty("bankAccountNumber")
	private String bankAccountNumber;
	@JsonProperty("bankAccountType")
	private String bankAccountType;
	@JsonProperty("debitOrderDate")
	private String debitOrderDate;
	@JsonProperty("contactPersonName")
	private String contactPersonName;
	@JsonProperty("contactPersonsContactNumber")
	private String contactPersonsContactNumber;
	@JsonProperty("grossIncome")
	private String grossIncome;
	@JsonProperty("netIncome")
	private String netIncome;
	@JsonProperty("otherIncome")
	private String otherIncome;
	@JsonProperty("monthlyExpenses")
	private String monthlyExpenses;
	@JsonProperty("sourceIpAddress")
	private String sourceIpAddress;
	@JsonProperty("Products")
	private Products products = new Products();
	@JsonProperty("agentName")
	private String agentName;
	@JsonProperty("orderChannel")
	private String orderChannel;
	@JsonProperty("banNumber")
	private String banNumber;
	@JsonProperty("banStatus")
	private String banStatus;
	@JsonProperty("startServiceDate")
	private String startServiceDate;
	@JsonProperty("creditClass")
	private String creditClass;
	@JsonProperty("delinquent")
	private String delinquent;
	@JsonProperty("delinquentStatusDate")
	private String delinquentStatusDate;
	@JsonProperty("arBalance")
	private String arBalance;
	@JsonProperty("writeOffIndicator")
	private String writeOffIndicator;
	@JsonProperty("accountType")
	private String accountType;
	@JsonProperty("colAgencyName")
	private String colAgencyName;
	@JsonProperty("dateStatusChanged")
	private String dateStatusChanged;
	private final static long serialVersionUID = -4489193834451969069L;

	@JsonProperty("orderNumber")
	public String getOrderNumber() {
		return orderNumber;
	}

	@JsonProperty("orderNumber")
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	@JsonProperty("segment")
	public String getSegment() {
		return segment;
	}

	@JsonProperty("segment")
	public void setSegment(String segment) {
		this.segment = segment;
	}

	@JsonProperty("actionType")
	public String getActionType() {
		return actionType;
	}

	@JsonProperty("actionType")
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	@JsonProperty("surname")
	public String getSurname() {
		return surname;
	}

	@JsonProperty("surname")
	public void setSurname(String surname) {
		this.surname = surname;
	}

	@JsonProperty("fullNames")
	public String getFullNames() {
		return fullNames;
	}

	@JsonProperty("fullNames")
	public void setFullNames(String fullNames) {
		this.fullNames = fullNames;
	}

	@JsonProperty("initials")
	public String getInitials() {
		return initials;
	}

	@JsonProperty("initials")
	public void setInitials(String initials) {
		this.initials = initials;
	}

	@JsonProperty("idType")
	public String getIdType() {
		return idType;
	}

	@JsonProperty("idType")
	public void setIdType(String idType) {
		this.idType = idType;
	}

	@JsonProperty("identityOrPassport")
	public String getIdentityOrPassport() {
		return identityOrPassport;
	}

	@JsonProperty("identityOrPassport")
	public void setIdentityOrPassport(String identityOrPassport) {
		this.identityOrPassport = identityOrPassport;
	}

	@JsonProperty("buildingName")
	public String getBuildingName() {
		return buildingName;
	}

	@JsonProperty("buildingName")
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	@JsonProperty("buildingNumber")
	public String getBuildingNumber() {
		return buildingNumber;
	}

	@JsonProperty("buildingNumber")
	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	@JsonProperty("streetName")
	public String getStreetName() {
		return streetName;
	}

	@JsonProperty("streetName")
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@JsonProperty("streetNumber")
	public String getStreetNumber() {
		return streetNumber;
	}

	@JsonProperty("streetNumber")
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	@JsonProperty("suburb")
	public String getSuburb() {
		return suburb;
	}

	@JsonProperty("suburb")
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	@JsonProperty("town")
	public String getTown() {
		return town;
	}

	@JsonProperty("town")
	public void setTown(String town) {
		this.town = town;
	}

	@JsonProperty("postalCode")
	public String getPostalCode() {
		return postalCode;
	}

	@JsonProperty("postalCode")
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@JsonProperty("postalBuildingName")
	public String getPostalBuildingName() {
		return postalBuildingName;
	}

	@JsonProperty("postalBuildingName")
	public void setPostalBuildingName(String postalBuildingName) {
		this.postalBuildingName = postalBuildingName;
	}

	@JsonProperty("postalBuildingNumber")
	public String getPostalBuildingNumber() {
		return postalBuildingNumber;
	}

	@JsonProperty("postalBuildingNumber")
	public void setPostalBuildingNumber(String postalBuildingNumber) {
		this.postalBuildingNumber = postalBuildingNumber;
	}

	@JsonProperty("postalStreetName")
	public String getPostalStreetName() {
		return postalStreetName;
	}

	@JsonProperty("postalStreetName")
	public void setPostalStreetName(String postalStreetName) {
		this.postalStreetName = postalStreetName;
	}

	@JsonProperty("postalStreetNumber")
	public String getPostalStreetNumber() {
		return postalStreetNumber;
	}

	@JsonProperty("postalStreetNumber")
	public void setPostalStreetNumber(String postalStreetNumber) {
		this.postalStreetNumber = postalStreetNumber;
	}

	@JsonProperty("postSuburb")
	public String getPostSuburb() {
		return postSuburb;
	}

	@JsonProperty("postSuburb")
	public void setPostSuburb(String postSuburb) {
		this.postSuburb = postSuburb;
	}

	@JsonProperty("postalTown")
	public String getPostalTown() {
		return postalTown;
	}

	@JsonProperty("postalTown")
	public void setPostalTown(String postalTown) {
		this.postalTown = postalTown;
	}

	@JsonProperty("postPostalCode")
	public String getPostPostalCode() {
		return postPostalCode;
	}

	@JsonProperty("postPostalCode")
	public void setPostPostalCode(String postPostalCode) {
		this.postPostalCode = postPostalCode;
	}

	@JsonProperty("cellNumber")
	public String getCellNumber() {
		return cellNumber;
	}

	@JsonProperty("cellNumber")
	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	@JsonProperty("workNumber")
	public String getWorkNumber() {
		return workNumber;
	}

	@JsonProperty("workNumber")
	public void setWorkNumber(String workNumber) {
		this.workNumber = workNumber;
	}

	@JsonProperty("homeTelephoneNumber")
	public String getHomeTelephoneNumber() {
		return homeTelephoneNumber;
	}

	@JsonProperty("homeTelephoneNumber")
	public void setHomeTelephoneNumber(String homeTelephoneNumber) {
		this.homeTelephoneNumber = homeTelephoneNumber;
	}

	@JsonProperty("faxNumber")
	public String getFaxNumber() {
		return faxNumber;
	}

	@JsonProperty("faxNumber")
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	@JsonProperty("emailAddress")
	public String getEmailAddress() {
		return emailAddress;
	}

	@JsonProperty("emailAddress")
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@JsonProperty("employerName")
	public String getEmployerName() {
		return employerName;
	}

	@JsonProperty("employerName")
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	@JsonProperty("employerBuildingName")
	public String getEmployerBuildingName() {
		return employerBuildingName;
	}

	@JsonProperty("employerBuildingName")
	public void setEmployerBuildingName(String employerBuildingName) {
		this.employerBuildingName = employerBuildingName;
	}

	@JsonProperty("employerBuildingNumber")
	public String getEmployerBuildingNumber() {
		return employerBuildingNumber;
	}

	@JsonProperty("employerBuildingNumber")
	public void setEmployerBuildingNumber(String employerBuildingNumber) {
		this.employerBuildingNumber = employerBuildingNumber;
	}

	@JsonProperty("employerStreetName")
	public String getEmployerStreetName() {
		return employerStreetName;
	}

	@JsonProperty("employerStreetName")
	public void setEmployerStreetName(String employerStreetName) {
		this.employerStreetName = employerStreetName;
	}

	@JsonProperty("employerStreetNumber")
	public String getEmployerStreetNumber() {
		return employerStreetNumber;
	}

	@JsonProperty("employerStreetNumber")
	public void setEmployerStreetNumber(String employerStreetNumber) {
		this.employerStreetNumber = employerStreetNumber;
	}

	@JsonProperty("employerSuburb")
	public String getEmployerSuburb() {
		return employerSuburb;
	}

	@JsonProperty("employerSuburb")
	public void setEmployerSuburb(String employerSuburb) {
		this.employerSuburb = employerSuburb;
	}

	@JsonProperty("employerTown")
	public String getEmployerTown() {
		return employerTown;
	}

	@JsonProperty("employerTown")
	public void setEmployerTown(String employerTown) {
		this.employerTown = employerTown;
	}

	@JsonProperty("employerPostalCode")
	public String getEmployerPostalCode() {
		return employerPostalCode;
	}

	@JsonProperty("employerPostalCode")
	public void setEmployerPostalCode(String employerPostalCode) {
		this.employerPostalCode = employerPostalCode;
	}

	@JsonProperty("employmentType")
	public String getEmploymentType() {
		return employmentType;
	}

	@JsonProperty("employmentType")
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	@JsonProperty("employmentDate")
	public String getEmploymentDate() {
		return employmentDate;
	}

	@JsonProperty("employmentDate")
	public void setEmploymentDate(String employmentDate) {
		this.employmentDate = employmentDate;
	}

	@JsonProperty("employmentPeriod")
	public String getEmploymentPeriod() {
		return employmentPeriod;
	}

	@JsonProperty("employmentPeriod")
	public void setEmploymentPeriod(String employmentPeriod) {
		this.employmentPeriod = employmentPeriod;
	}

	@JsonProperty("bankName")
	public String getBankName() {
		return bankName;
	}

	@JsonProperty("bankName")
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@JsonProperty("branchCode")
	public String getBranchCode() {
		return branchCode;
	}

	@JsonProperty("branchCode")
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	@JsonProperty("bankAccountHolderName")
	public String getBankAccountHolderName() {
		return bankAccountHolderName;
	}

	@JsonProperty("bankAccountHolderName")
	public void setBankAccountHolderName(String bankAccountHolderName) {
		this.bankAccountHolderName = bankAccountHolderName;
	}

	@JsonProperty("bankAccountHolderSurname")
	public String getBankAccountHolderSurname() {
		return bankAccountHolderSurname;
	}

	@JsonProperty("bankAccountHolderSurname")
	public void setBankAccountHolderSurname(String bankAccountHolderSurname) {
		this.bankAccountHolderSurname = bankAccountHolderSurname;
	}

	@JsonProperty("bankAcccountHolderIdentityNumber")
	public String getBankAcccountHolderIdentityNumber() {
		return bankAcccountHolderIdentityNumber;
	}

	@JsonProperty("bankAcccountHolderIdentityNumber")
	public void setBankAcccountHolderIdentityNumber(String bankAcccountHolderIdentityNumber) {
		this.bankAcccountHolderIdentityNumber = bankAcccountHolderIdentityNumber;
	}

	@JsonProperty("bankAccountNumber")
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	@JsonProperty("bankAccountNumber")
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@JsonProperty("bankAccountType")
	public String getBankAccountType() {
		return bankAccountType;
	}

	@JsonProperty("bankAccountType")
	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	@JsonProperty("debitOrderDate")
	public String getDebitOrderDate() {
		return debitOrderDate;
	}

	@JsonProperty("debitOrderDate")
	public void setDebitOrderDate(String debitOrderDate) {
		this.debitOrderDate = debitOrderDate;
	}

	@JsonProperty("contactPersonName")
	public String getContactPersonName() {
		return contactPersonName;
	}

	@JsonProperty("contactPersonName")
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	@JsonProperty("contactPersonsContactNumber")
	public String getContactPersonsContactNumber() {
		return contactPersonsContactNumber;
	}

	@JsonProperty("contactPersonsContactNumber")
	public void setContactPersonsContactNumber(String contactPersonsContactNumber) {
		this.contactPersonsContactNumber = contactPersonsContactNumber;
	}

	@JsonProperty("grossIncome")
	public String getGrossIncome() {
		return grossIncome;
	}

	@JsonProperty("grossIncome")
	public void setGrossIncome(String grossIncome) {
		this.grossIncome = grossIncome;
	}

	@JsonProperty("netIncome")
	public String getNetIncome() {
		return netIncome;
	}

	@JsonProperty("netIncome")
	public void setNetIncome(String netIncome) {
		this.netIncome = netIncome;
	}

	@JsonProperty("otherIncome")
	public String getOtherIncome() {
		return otherIncome;
	}

	@JsonProperty("otherIncome")
	public void setOtherIncome(String otherIncome) {
		this.otherIncome = otherIncome;
	}

	@JsonProperty("monthlyExpenses")
	public String getMonthlyExpenses() {
		return monthlyExpenses;
	}

	@JsonProperty("monthlyExpenses")
	public void setMonthlyExpenses(String monthlyExpenses) {
		this.monthlyExpenses = monthlyExpenses;
	}

	@JsonProperty("sourceIpAddress")
	public String getSourceIpAddress() {
		return sourceIpAddress;
	}

	@JsonProperty("sourceIpAddress")
	public void setSourceIpAddress(String sourceIpAddress) {
		this.sourceIpAddress = sourceIpAddress;
	}

	@JsonProperty("Products")
	public Products getProducts() {
		return products;
	}

	@JsonProperty("Products")
	public void setProducts(Products products) {
		this.products = products;
	}

	@JsonProperty("agentName")
	public String getAgentName() {
		return agentName;
	}

	@JsonProperty("agentName")
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@JsonProperty("orderChannel")
	public String getOrderChannel() {
		return orderChannel;
	}

	@JsonProperty("orderChannel")
	public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}

	@JsonProperty("banNumber")
	public String getBanNumber() {
		return banNumber;
	}

	@JsonProperty("banNumber")
	public void setBanNumber(String banNumber) {
		this.banNumber = banNumber;
	}

	@JsonProperty("banStatus")
	public String getBanStatus() {
		return banStatus;
	}

	@JsonProperty("banStatus")
	public void setBanStatus(String banStatus) {
		this.banStatus = banStatus;
	}

	@JsonProperty("startServiceDate")
	public String getStartServiceDate() {
		return startServiceDate;
	}

	@JsonProperty("startServiceDate")
	public void setStartServiceDate(String startServiceDate) {
		this.startServiceDate = startServiceDate;
	}

	@JsonProperty("creditClass")
	public String getCreditClass() {
		return creditClass;
	}

	@JsonProperty("creditClass")
	public void setCreditClass(String creditClass) {
		this.creditClass = creditClass;
	}

	@JsonProperty("delinquent")
	public String getDelinquent() {
		return delinquent;
	}

	@JsonProperty("delinquent")
	public void setDelinquent(String delinquent) {
		this.delinquent = delinquent;
	}

	@JsonProperty("delinquentStatusDate")
	public String getDelinquentStatusDate() {
		return delinquentStatusDate;
	}

	@JsonProperty("delinquentStatusDate")
	public void setDelinquentStatusDate(String delinquentStatusDate) {
		this.delinquentStatusDate = delinquentStatusDate;
	}

	@JsonProperty("arBalance")
	public String getArBalance() {
		return arBalance;
	}

	@JsonProperty("arBalance")
	public void setArBalance(String arBalance) {
		this.arBalance = arBalance;
	}

	@JsonProperty("writeOffIndicator")
	public String getWriteOffIndicator() {
		return writeOffIndicator;
	}

	@JsonProperty("writeOffIndicator")
	public void setWriteOffIndicator(String writeOffIndicator) {
		this.writeOffIndicator = writeOffIndicator;
	}

	@JsonProperty("accountType")
	public String getAccountType() {
		return accountType;
	}

	@JsonProperty("accountType")
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@JsonProperty("colAgencyName")
	public String getColAgencyName() {
		return colAgencyName;
	}

	@JsonProperty("colAgencyName")
	public void setColAgencyName(String colAgencyName) {
		this.colAgencyName = colAgencyName;
	}

	@JsonProperty("dateStatusChanged")
	public String getDateStatusChanged() {
		return dateStatusChanged;
	}

	@JsonProperty("dateStatusChanged")
	public void setDateStatusChanged(String dateStatusChanged) {
		this.dateStatusChanged = dateStatusChanged;
	}

}