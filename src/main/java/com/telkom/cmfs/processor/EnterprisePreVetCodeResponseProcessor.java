package com.telkom.cmfs.processor;

import static com.telkom.cmfs.util.Constants.EMPTY_BRACES;
import static com.telkom.cmfs.util.Constants.SOAP_ERROR_RESPONSE;

import java.io.IOException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.cmfs.mapper.Mapper;
import com.telkom.cmfs.mapper.ResponseMapper;
import com.telkom.cmfs.model.EnterprisePreVetCodeResponseIn;
import com.telkom.cmfs.model.EnterprisePrevetCodeResponseOp;

public class EnterprisePreVetCodeResponseProcessor implements Processor {

	Logger logger = LoggerFactory.getLogger(EnterprisePreVetCodeResponseProcessor.class);

	@Override
	public void process(Exchange exchange) {

		String responseJsongStringOp = exchange.getIn().getBody(String.class);
		String responseJsonStringIn = null;
		if (!responseJsongStringOp.contains(SOAP_ERROR_RESPONSE)) {

			if (responseJsongStringOp.contains(EMPTY_BRACES)) {
				String replacement = "\"\"";
				responseJsongStringOp = responseJsongStringOp.replace(EMPTY_BRACES, replacement);
			}
			try {
				ObjectMapper mapper = new ObjectMapper();
				EnterprisePrevetCodeResponseOp enterprisePrevetCodeResponseOp = mapper.readValue(responseJsongStringOp,
						EnterprisePrevetCodeResponseOp.class);
				EnterprisePreVetCodeResponseIn enterprisePreVetCodeResponseIn = new EnterprisePreVetCodeResponseIn();
				Mapper respMapper = new ResponseMapper<>();
				enterprisePreVetCodeResponseIn = (EnterprisePreVetCodeResponseIn) respMapper.map(
						enterprisePrevetCodeResponseOp.getGetEnterprisePreVetCodeResponse(),
						enterprisePreVetCodeResponseIn);
				responseJsonStringIn = mapper.writeValueAsString(enterprisePreVetCodeResponseIn);

			} catch (IOException e) {
				logger.info("error while parsing the response of IndividualPreVetCode: ", e);
				responseJsonStringIn = responseJsongStringOp;
			}
		} else {
			logger.info("forwarding error response with 200 status: ");
			responseJsonStringIn = responseJsongStringOp;
		}
		logger.info("response after enterprisePreVetCode response processor: " + responseJsonStringIn);
		exchange.getOut().setBody(responseJsonStringIn);
	}
}