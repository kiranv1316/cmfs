package com.telkom.cmfs.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.cmfs.mapper.Mapper;
import com.telkom.cmfs.mapper.RequestMapper;
import com.telkom.cmfs.model.GetIndividualIRCodeResponse;
import com.telkom.cmfs.model.GetIndividualIRCodeResult;
import com.telkom.cmfs.model.IndividualIRCodeResponseIn;
import com.telkom.cmfs.model.IndividualIRCodeResponseOp;

public class IndividualIRcodeResponseProcessor implements Processor {
	Logger logger = LoggerFactory.getLogger(IndividualIRcodeResponseProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		String individualIRcodeRespOpJsonString = exchange.getIn().getBody(String.class);
		IndividualIRCodeResponseOp individualIRCodeResponseOp = mapper.readValue(individualIRcodeRespOpJsonString,
				IndividualIRCodeResponseOp.class);
		Mapper reqMapper = new RequestMapper<>();
		if (null != individualIRCodeResponseOp.getGetIndividualIRCodeResponse()) {
			IndividualIRCodeResponseIn individualIRCodeResponseIn = new IndividualIRCodeResponseIn();
			GetIndividualIRCodeResponse indIRcodeResp = individualIRCodeResponseOp.getGetIndividualIRCodeResponse();
			GetIndividualIRCodeResult getIndividualIRCodeResult = indIRcodeResp.getGetIndividualIRCodeResult();
			individualIRCodeResponseIn = (IndividualIRCodeResponseIn) reqMapper
					.map(getIndividualIRCodeResult, individualIRCodeResponseIn);
			String response = mapper.writeValueAsString(individualIRCodeResponseIn);
			logger.info("response after ircode processor: " + response);
			exchange.getOut().setBody(response);
		} 
	}
}
