package com.telkom.cmfs.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "SaveVettingOutcome" })
public class SaveVettingRequestOp implements Serializable {

	@JsonProperty("SaveVettingOutcome")
	private SaveVettingOutcome saveVettingOutcome;
	private final static long serialVersionUID = 2090664681790979592L;

	@JsonProperty("SaveVettingOutcome")
	public SaveVettingOutcome getSaveVettingOutcome() {
		return saveVettingOutcome;
	}

	@JsonProperty("SaveVettingOutcome")
	public void setSaveVettingOutcome(SaveVettingOutcome saveVettingOutcome) {
		this.saveVettingOutcome = saveVettingOutcome;
	}

}