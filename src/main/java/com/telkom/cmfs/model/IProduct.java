package com.telkom.cmfs.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "DealCode", "DealName", "DealRecurringCharge", "DeviceName", "DeviceSapMaterialCode",
		"ProductCategory" })
public class IProduct implements Serializable {

	@JsonProperty("DealCode")
	private String dealCode;
	@JsonProperty("DealName")
	private String dealName;
	@JsonProperty("DealRecurringCharge")
	private String dealRecurringCharge;
	@JsonProperty("DeviceName")
	private String deviceName;
	@JsonProperty("DeviceSapMaterialCode")
	private String deviceSapMaterialCode;
	@JsonProperty("ProductCategory")
	private String productCategory;
	private final static long serialVersionUID = -2344535710695179294L;

	@JsonProperty("DealCode")
	public String getDealCode() {
		return dealCode;
	}

	@JsonProperty("DealCode")
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	@JsonProperty("DealName")
	public String getDealName() {
		return dealName;
	}

	@JsonProperty("DealName")
	public void setDealName(String dealName) {
		this.dealName = dealName;
	}

	@JsonProperty("DealRecurringCharge")
	public String getDealRecurringCharge() {
		return dealRecurringCharge;
	}

	@JsonProperty("DealRecurringCharge")
	public void setDealRecurringCharge(String dealRecurringCharge) {
		this.dealRecurringCharge = dealRecurringCharge;
	}

	@JsonProperty("DeviceName")
	public String getDeviceName() {
		return deviceName;
	}

	@JsonProperty("DeviceName")
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	@JsonProperty("DeviceSapMaterialCode")
	public String getDeviceSapMaterialCode() {
		return deviceSapMaterialCode;
	}

	@JsonProperty("DeviceSapMaterialCode")
	public void setDeviceSapMaterialCode(String deviceSapMaterialCode) {
		this.deviceSapMaterialCode = deviceSapMaterialCode;
	}

	@JsonProperty("ProductCategory")
	public String getProductCategory() {
		return productCategory;
	}

	@JsonProperty("ProductCategory")
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

}