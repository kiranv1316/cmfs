package com.telkom.cmfs.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "Decision", "Description", "DepositAmount", "DepositRequired" })

public class IndividualIRCodeResponseIn implements Serializable {

	@JsonProperty("Decision")
	private String decision;
	@JsonProperty("Description")
	private String description;
	@JsonProperty("DepositAmount")
	private String depositAmount;
	@JsonProperty("DepositRequired")
	private String depositRequired;
	private final static long serialVersionUID = 5876320979269025720L;

	@JsonProperty("Decision")
	public String getDecision() {
		return decision;
	}

	@JsonProperty("Decision")
	public void setDecision(String decision) {
		this.decision = decision;
	}

	@JsonProperty("Description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("Description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("DepositAmount")
	public String getDepositAmount() {
		return depositAmount;
	}

	@JsonProperty("DepositAmount")
	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}

	@JsonProperty("DepositRequired")
	public String getDepositRequired() {
		return depositRequired;
	}

	@JsonProperty("DepositRequired")
	public void setDepositRequired(String depositRequired) {
		this.depositRequired = depositRequired;
	}

}