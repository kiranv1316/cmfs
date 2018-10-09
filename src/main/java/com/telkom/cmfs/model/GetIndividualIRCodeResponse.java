package com.telkom.cmfs.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "GetIndividualIRCodeResult" })
public class GetIndividualIRCodeResponse implements Serializable {

	@JsonProperty("GetIndividualIRCodeResult")
	private GetIndividualIRCodeResult getIndividualIRCodeResult;
	private final static long serialVersionUID = -1316294399596342574L;

	@JsonProperty("GetIndividualIRCodeResult")
	public GetIndividualIRCodeResult getGetIndividualIRCodeResult() {
		return getIndividualIRCodeResult;
	}

	@JsonProperty("GetIndividualIRCodeResult")
	public void setGetIndividualIRCodeResult(GetIndividualIRCodeResult getIndividualIRCodeResult) {
		this.getIndividualIRCodeResult = getIndividualIRCodeResult;
	}

}