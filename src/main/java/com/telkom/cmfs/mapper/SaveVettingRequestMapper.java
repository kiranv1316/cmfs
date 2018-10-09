package com.telkom.cmfs.mapper;

import java.time.Instant;
import java.time.format.DateTimeParseException;

import com.telkom.cmfs.model.SaveVettingOutcome;
import com.telkom.cmfs.model.SaveVettingRequestIn;
import com.telkom.cmfs.model.SaveVettingRequestOp;

public class SaveVettingRequestMapper{
	
	public SaveVettingRequestOp mapCreditVettingRequest(SaveVettingRequestIn creditVettingRequestIn){
		SaveVettingRequestOp creditVettingRequestOp =new SaveVettingRequestOp();
		SaveVettingOutcome saveVettingOutcome =null;
		if(null != creditVettingRequestIn) {
			String decisionDate = convertToDateFormat(creditVettingRequestIn.getDateApproved());
			saveVettingOutcome = new SaveVettingOutcome.Builder()
				.orderNumber(creditVettingRequestIn.getApplicationNumber())
				.recommendedDecison(creditVettingRequestIn.getRecommendedDecision())
				.recommendedProduct(creditVettingRequestIn.getRecommendedProduct())
				.creditLimit(creditVettingRequestIn.getRecommendedCreditLimit())
				.minRange((int)creditVettingRequestIn.getMinRange())
				.maxRange((int)creditVettingRequestIn.getMaxRange())
				.decisionDate(decisionDate)
				.applicationStatus(creditVettingRequestIn.getApplicationStatus())
				.fraudSuspected(creditVettingRequestIn.getFraudSuspected())
				.fullProcessComplete(creditVettingRequestIn.getFullProcessComplete())
				.build();
		}	
		creditVettingRequestOp.setSaveVettingOutcome(saveVettingOutcome);
		return creditVettingRequestOp;
	}
	
	private String convertToDateFormat(String inputDateString) throws DateTimeParseException {
	  //Instant instant = Instant.parse(inputDateString);
	  //return String.valueOf(instant.toString());
		return inputDateString;
	}

}
