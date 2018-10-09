package com.telkom.cmfs.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "orderNumber", "identityOrPassport", "surname", "fullNames", "initials", "idType" })
public class GetIndividualIRCode implements Serializable {

	@JsonProperty("orderNumber")
	private String orderNumber;
	@JsonProperty("identityOrPassport")
	private String identityOrPassport;
	@JsonProperty("surname")
	private String surname;
	@JsonProperty("fullNames")
	private String fullNames;
	@JsonProperty("initials")
	private String initials;
	@JsonProperty("idType")
	private String idType;
	private final static long serialVersionUID = 7696609916459491595L;

	@JsonProperty("orderNumber")
	public String getOrderNumber() {
		return orderNumber;
	}

	@JsonProperty("orderNumber")
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	@JsonProperty("identityOrPassport")
	public String getIdentityOrPassport() {
		return identityOrPassport;
	}

	@JsonProperty("identityOrPassport")
	public void setIdentityOrPassport(String identityOrPassport) {
		this.identityOrPassport = identityOrPassport;
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

}