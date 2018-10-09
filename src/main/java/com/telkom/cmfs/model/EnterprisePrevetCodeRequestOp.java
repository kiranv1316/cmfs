package com.telkom.cmfs.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "GetEnterprisePreVetCode" })
public class EnterprisePrevetCodeRequestOp implements Serializable {

	@JsonProperty("GetEnterprisePreVetCode")
	private GetEnterprisePreVetCode getEnterprisePreVetCode;
	private final static long serialVersionUID = 7233626054033492745L;

	@JsonProperty("GetEnterprisePreVetCode")
	public GetEnterprisePreVetCode getGetEnterprisePreVetCode() {
		return getEnterprisePreVetCode;
	}

	@JsonProperty("GetEnterprisePreVetCode")
	public void setGetEnterprisePreVetCode(GetEnterprisePreVetCode getEnterprisePreVetCode) {
		this.getEnterprisePreVetCode = getEnterprisePreVetCode;
	}

}