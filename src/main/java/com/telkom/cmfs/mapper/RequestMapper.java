package com.telkom.cmfs.mapper;

import java.time.Instant;
import java.time.format.DateTimeParseException;

public class RequestMapper<S,D> extends Mapper<S, D>{

	public String transformStartServiceDate(String inputDateString){
		logger.info("transformStartServiceDate ::");
		return convertToDateFormat(inputDateString);
	}
	public String transformDateStatusChanged(String inputDateString) {
		logger.info("transformDateStatusChanged ::");
		return convertToDateFormat(inputDateString);
	}
	public String transformDelinquentStatusDate(String inputDateString) {
		logger.info("transformDelinquentStatusDate ::");
		return convertToDateFormat(inputDateString);
	}
	
	public String transformDebitOrderDate(String inputDateString) {
		logger.info("transformDebitOrderDate ::");
		return convertToDateFormat(inputDateString);
	}
	
	private String convertToDateFormat(String inputDateString) throws DateTimeParseException {
	 // Instant instant = Instant.parse(inputDateString);
	 // return String.valueOf(instant.toString());
		return inputDateString;
	}
}
