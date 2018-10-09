package com.telkom.cmfs.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.cmfs.mapper.Mapper;
import com.telkom.cmfs.mapper.RequestMapper;
import com.telkom.cmfs.model.EnterprisePreVetCodeRequestIn;
import com.telkom.cmfs.model.EnterprisePrevetCodeRequestOp;
import com.telkom.cmfs.model.GetEnterprisePreVetCode;
public class EnterprisePreVetCodeRequestProcessor implements Processor {

	Logger logger = LoggerFactory.getLogger(EnterprisePreVetCodeRequestProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		EnterprisePreVetCodeRequestIn enterprisePreVetCodeRequestIn = mapper.readValue(exchange.getIn().getBody(String.class), EnterprisePreVetCodeRequestIn.class);
		
		GetEnterprisePreVetCode  getEnterprisePreVetCode = new GetEnterprisePreVetCode();
		Mapper reqMapper = new RequestMapper<>();
		getEnterprisePreVetCode = (GetEnterprisePreVetCode) reqMapper.map(enterprisePreVetCodeRequestIn, getEnterprisePreVetCode);
		EnterprisePrevetCodeRequestOp enterprisePrevetCodeRequestOp = new EnterprisePrevetCodeRequestOp();
		enterprisePrevetCodeRequestOp.setGetEnterprisePreVetCode(getEnterprisePreVetCode);
		String jsonString =  mapper.writeValueAsString(enterprisePrevetCodeRequestOp);
		logger.info("request after enterprise prevet request processor: " + jsonString);
		exchange.getOut().setBody(jsonString);
		
	}

}