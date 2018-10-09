package com.telkom.cmfs.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "GetIndividualPreVetCode" })
public class IndividualPreVetCodeRequestOp implements Serializable {

	@JsonProperty("GetIndividualPreVetCode")
	private GetIndividualPreVetCode getIndividualPreVetCode;
	private final static long serialVersionUID = 3199828642860968407L;

	@JsonProperty("GetIndividualPreVetCode")
	public GetIndividualPreVetCode getGetIndividualPreVetCode() {
		return getIndividualPreVetCode;
	}

	@JsonProperty("GetIndividualPreVetCode")
	public void setGetIndividualPreVetCode(GetIndividualPreVetCode getIndividualPreVetCode) {
		this.getIndividualPreVetCode = getIndividualPreVetCode;
	}

}