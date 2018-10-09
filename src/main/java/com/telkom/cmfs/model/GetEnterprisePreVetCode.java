package com.telkom.cmfs.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "orderNumber", "segment", "actionType", "companyName", "registrationNumber", "tradingName",
		"buildingName", "buildingNumber", "streetName", "streetNumber", "suburb", "town", "province", "areaCode",
		"companyFixedLineNumber", "companyContactNumber", "companyContactPersonName", "companyContactPersonSurname",
		"companyContactPersonTel", "bankAccountHolderID", "bankAccountHolderCompanyName", "bankAccountNumber",
		"bankAccountType", "bankName", "branchCode", "sourceIpAddress", "Products", "agentName", "orderChannel",
		"startServiceDate", "delinquentStatusDate", "arBalance", "dateStatusChanged" })
public class GetEnterprisePreVetCode implements Serializable {

	@JsonProperty("orderNumber")
	private String orderNumber;
	@JsonProperty("segment")
	private String segment;
	@JsonProperty("actionType")
	private String actionType;
	@JsonProperty("companyName")
	private String companyName;
	@JsonProperty("registrationNumber")
	private String registrationNumber;
	@JsonProperty("tradingName")
	private String tradingName;
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
	@JsonProperty("province")
	private String province;
	@JsonProperty("areaCode")
	private String areaCode;
	@JsonProperty("companyFixedLineNumber")
	private String companyFixedLineNumber;
	@JsonProperty("companyContactNumber")
	private String companyContactNumber;
	@JsonProperty("companyContactPersonName")
	private String companyContactPersonName;
	@JsonProperty("companyContactPersonSurname")
	private String companyContactPersonSurname;
	@JsonProperty("companyContactPersonTel")
	private String companyContactPersonTel;
	@JsonProperty("bankAccountHolderID")
	private String bankAccountHolderID;
	@JsonProperty("bankAccountHolderCompanyName")
	private String bankAccountHolderCompanyName;
	@JsonProperty("bankAccountNumber")
	private String bankAccountNumber;
	@JsonProperty("bankAccountType")
	private String bankAccountType;
	@JsonProperty("bankName")
	private String bankName;
	@JsonProperty("branchCode")
	private String branchCode;
	@JsonProperty("sourceIpAddress")
	private String sourceIpAddress;
	@JsonProperty("Products")
	private Products products = new Products();
	@JsonProperty("agentName")
	private String agentName;
	@JsonProperty("orderChannel")
	private String orderChannel;
	@JsonProperty("startServiceDate")
	private String startServiceDate;
	@JsonProperty("delinquentStatusDate")
	private String delinquentStatusDate;
	@JsonProperty("arBalance")
	private String arBalance;
	@JsonProperty("dateStatusChanged")
	private String dateStatusChanged;
	private final static long serialVersionUID = 235270668270057300L;

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

	@JsonProperty("companyName")
	public String getCompanyName() {
		return companyName;
	}

	@JsonProperty("companyName")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@JsonProperty("registrationNumber")
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	@JsonProperty("registrationNumber")
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@JsonProperty("tradingName")
	public String getTradingName() {
		return tradingName;
	}

	@JsonProperty("tradingName")
	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
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

	@JsonProperty("province")
	public String getProvince() {
		return province;
	}

	@JsonProperty("province")
	public void setProvince(String province) {
		this.province = province;
	}

	@JsonProperty("areaCode")
	public String getAreaCode() {
		return areaCode;
	}

	@JsonProperty("areaCode")
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	@JsonProperty("companyFixedLineNumber")
	public String getCompanyFixedLineNumber() {
		return companyFixedLineNumber;
	}

	@JsonProperty("companyFixedLineNumber")
	public void setCompanyFixedLineNumber(String companyFixedLineNumber) {
		this.companyFixedLineNumber = companyFixedLineNumber;
	}

	@JsonProperty("companyContactNumber")
	public String getCompanyContactNumber() {
		return companyContactNumber;
	}

	@JsonProperty("companyContactNumber")
	public void setCompanyContactNumber(String companyContactNumber) {
		this.companyContactNumber = companyContactNumber;
	}

	@JsonProperty("companyContactPersonName")
	public String getCompanyContactPersonName() {
		return companyContactPersonName;
	}

	@JsonProperty("companyContactPersonName")
	public void setCompanyContactPersonName(String companyContactPersonName) {
		this.companyContactPersonName = companyContactPersonName;
	}

	@JsonProperty("companyContactPersonSurname")
	public String getCompanyContactPersonSurname() {
		return companyContactPersonSurname;
	}

	@JsonProperty("companyContactPersonSurname")
	public void setCompanyContactPersonSurname(String companyContactPersonSurname) {
		this.companyContactPersonSurname = companyContactPersonSurname;
	}

	@JsonProperty("companyContactPersonTel")
	public String getCompanyContactPersonTel() {
		return companyContactPersonTel;
	}

	@JsonProperty("companyContactPersonTel")
	public void setCompanyContactPersonTel(String companyContactPersonTel) {
		this.companyContactPersonTel = companyContactPersonTel;
	}

	@JsonProperty("bankAccountHolderID")
	public String getBankAccountHolderID() {
		return bankAccountHolderID;
	}

	@JsonProperty("bankAccountHolderID")
	public void setBankAccountHolderID(String bankAccountHolderID) {
		this.bankAccountHolderID = bankAccountHolderID;
	}

	@JsonProperty("bankAccountHolderCompanyName")
	public String getBankAccountHolderCompanyName() {
		return bankAccountHolderCompanyName;
	}

	@JsonProperty("bankAccountHolderCompanyName")
	public void setBankAccountHolderCompanyName(String bankAccountHolderCompanyName) {
		this.bankAccountHolderCompanyName = bankAccountHolderCompanyName;
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

	@JsonProperty("startServiceDate")
	public String getStartServiceDate() {
		return startServiceDate;
	}

	@JsonProperty("startServiceDate")
	public void setStartServiceDate(String startServiceDate) {
		this.startServiceDate = startServiceDate;
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

	@JsonProperty("dateStatusChanged")
	public String getDateStatusChanged() {
		return dateStatusChanged;
	}

	@JsonProperty("dateStatusChanged")
	public void setDateStatusChanged(String dateStatusChanged) {
		this.dateStatusChanged = dateStatusChanged;
	}

}