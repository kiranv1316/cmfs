package com.telkom.cmfs.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "GetIndividualPreVetCodeResponse" })
public class IndividualPreVetCodeResponseOp implements Serializable {

	@JsonProperty("GetIndividualPreVetCodeResponse")
	private GetIndividualPreVetCodeResponse getIndividualPreVetCodeResponse;
	private final static long serialVersionUID = 4970172025761945515L;

	@JsonProperty("GetIndividualPreVetCodeResponse")
	public GetIndividualPreVetCodeResponse getGetIndividualPreVetCodeResponse() {
		return getIndividualPreVetCodeResponse;
	}

	@JsonProperty("GetIndividualPreVetCodeResponse")
	public void setGetIndividualPreVetCodeResponse(GetIndividualPreVetCodeResponse getIndividualPreVetCodeResponse) {
		this.getIndividualPreVetCodeResponse = getIndividualPreVetCodeResponse;
	}

}