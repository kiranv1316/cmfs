package com.telkom.cmfs.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "GetEnterprisePreVetCodeResponse" })
public class EnterprisePrevetCodeResponseOp implements Serializable {

	@JsonProperty("GetEnterprisePreVetCodeResponse")
	private GetEnterprisePreVetCodeResponse getEnterprisePreVetCodeResponse;
	private final static long serialVersionUID = -9128510671883114673L;

	@JsonProperty("GetEnterprisePreVetCodeResponse")
	public GetEnterprisePreVetCodeResponse getGetEnterprisePreVetCodeResponse() {
		return getEnterprisePreVetCodeResponse;
	}

	@JsonProperty("GetEnterprisePreVetCodeResponse")
	public void setGetEnterprisePreVetCodeResponse(GetEnterprisePreVetCodeResponse getEnterprisePreVetCodeResponse) {
		this.getEnterprisePreVetCodeResponse = getEnterprisePreVetCodeResponse;
	}

}