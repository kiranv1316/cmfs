package com.telkom.cmfs.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.cmfs.mapper.SaveVettingRequestMapper;
import com.telkom.cmfs.model.SaveVettingRequestIn;
import com.telkom.cmfs.model.SaveVettingRequestOp;

public class SaveVettingRequestProcessor implements Processor {
	Logger logger = LoggerFactory.getLogger(SaveVettingRequestProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {

		logger.info("===== Inside Save vetting request Processor =====");
		ObjectMapper mapper = new ObjectMapper();
		SaveVettingRequestIn creditVettingRequestIn = mapper.readValue(exchange.getIn().getBody(String.class),SaveVettingRequestIn.class);
		SaveVettingRequestOp creditVettingRequestOp = new SaveVettingRequestMapper().mapCreditVettingRequest(creditVettingRequestIn);
		String jsonString = mapper.writeValueAsString(creditVettingRequestOp);
		logger.info("request after processor===>" + jsonString);
		exchange.getOut().setBody(jsonString);

	}
}
