package com.telkom.cmfs.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.cmfs.mapper.Mapper;
import com.telkom.cmfs.mapper.RequestMapper;
import com.telkom.cmfs.model.GetIndividualIRCode;
import com.telkom.cmfs.model.IndividualIRCodeRequestIn;
import com.telkom.cmfs.model.IndividualIRCodeRequestOp;

public class IndividualIRcodeRequestProcessor implements Processor {
	Logger logger = LoggerFactory.getLogger(IndividualIRcodeRequestProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		IndividualIRCodeRequestIn individualIRCodeRequestIn = mapper.readValue(exchange.getIn().getBody(String.class),IndividualIRCodeRequestIn.class);
		GetIndividualIRCode getIndividualIRCode = new GetIndividualIRCode();
		Mapper reqMapper = new RequestMapper<>();
		getIndividualIRCode = (GetIndividualIRCode) reqMapper.map(individualIRCodeRequestIn, getIndividualIRCode);
		IndividualIRCodeRequestOp individualIRCodeRequestOp = new IndividualIRCodeRequestOp();
		individualIRCodeRequestOp.setGetIndividualIRCode(getIndividualIRCode);
		String jsonString = mapper.writeValueAsString(individualIRCodeRequestOp);
		logger.info("request after ircode processor: " + jsonString);
		exchange.getOut().setBody(jsonString);
	}
}
