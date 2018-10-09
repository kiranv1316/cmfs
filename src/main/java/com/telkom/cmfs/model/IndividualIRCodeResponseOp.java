package com.telkom.cmfs.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "GetIndividualIRCodeResponse" })
public class IndividualIRCodeResponseOp implements Serializable {

	@JsonProperty("GetIndividualIRCodeResponse")
	private GetIndividualIRCodeResponse getIndividualIRCodeResponse;
	private final static long serialVersionUID = 1156720415875835290L;

	@JsonProperty("GetIndividualIRCodeResponse")
	public GetIndividualIRCodeResponse getGetIndividualIRCodeResponse() {
		return getIndividualIRCodeResponse;
	}

	@JsonProperty("GetIndividualIRCodeResponse")
	public void setGetIndividualIRCodeResponse(GetIndividualIRCodeResponse getIndividualIRCodeResponse) {
		this.getIndividualIRCodeResponse = getIndividualIRCodeResponse;
	}

}