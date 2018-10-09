package com.telkom.cmfs.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.cmfs.mapper.Mapper;
import com.telkom.cmfs.mapper.RequestMapper;
import com.telkom.cmfs.model.GetIndividualPreVetCode;
import com.telkom.cmfs.model.IndividualPreVetCodeRequestIn;
import com.telkom.cmfs.model.IndividualPreVetCodeRequestOp;


public class IndividualPreVetCodeRequestProcessor implements Processor {

	Logger logger = LoggerFactory.getLogger(IndividualPreVetCodeRequestProcessor.class);

	
	@Override
	public void process(Exchange exchange) throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		IndividualPreVetCodeRequestIn individualPreVetCodeIn = mapper.readValue(exchange.getIn().getBody(String.class), IndividualPreVetCodeRequestIn.class);
		GetIndividualPreVetCode  getIndividualPreVetCode= new GetIndividualPreVetCode();
		Mapper reqMapper = new RequestMapper<>();
		getIndividualPreVetCode = (GetIndividualPreVetCode) reqMapper.map(individualPreVetCodeIn, getIndividualPreVetCode);
		IndividualPreVetCodeRequestOp individualPrevetCodeRequestOp = new IndividualPreVetCodeRequestOp();
		individualPrevetCodeRequestOp.setGetIndividualPreVetCode(getIndividualPreVetCode);
		String jsonString = mapper.writeValueAsString(individualPrevetCodeRequestOp);
		logger.info("request after individualPrevet request processor: " + jsonString);
		exchange.getOut().setBody(mapper.writeValueAsString(individualPrevetCodeRequestOp));

	}

	
}