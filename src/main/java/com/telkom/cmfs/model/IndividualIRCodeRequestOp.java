package com.telkom.cmfs.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "GetIndividualIRCode" })
public class IndividualIRCodeRequestOp implements Serializable {

	@JsonProperty("GetIndividualIRCode")
	private GetIndividualIRCode getIndividualIRCode;
	private final static long serialVersionUID = -713749040270780450L;

	@JsonProperty("GetIndividualIRCode")
	public GetIndividualIRCode getGetIndividualIRCode() {
		return getIndividualIRCode;
	}

	@JsonProperty("GetIndividualIRCode")
	public void setGetIndividualIRCode(GetIndividualIRCode getIndividualIRCode) {
		this.getIndividualIRCode = getIndividualIRCode;
	}

}