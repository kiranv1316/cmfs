package com.telkom.cmfs.processor;

import static com.telkom.cmfs.util.Constants.SOAP_ERROR_RESPONSE;
import static com.telkom.cmfs.util.Constants.EMPTY_BRACES;
import java.io.IOException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.cmfs.mapper.Mapper;
import com.telkom.cmfs.mapper.ResponseMapper;
import com.telkom.cmfs.model.IndividualPreVetCodeResponseIn;
import com.telkom.cmfs.model.IndividualPreVetCodeResponseOp;

public class IndividualPreVetCodeResponseProcessor implements Processor {

	Logger logger = LoggerFactory.getLogger(IndividualPreVetCodeResponseProcessor.class);

	@Override
	public void process(Exchange exchange){

		String responseJsongStringOp = exchange.getIn().getBody(String.class);
		String responseJsonStringIn = null;
		if (!responseJsongStringOp.contains(SOAP_ERROR_RESPONSE)) {

			if (responseJsongStringOp.contains(EMPTY_BRACES)) {
				String replacement = "\"\"";
				responseJsongStringOp = responseJsongStringOp.replace(EMPTY_BRACES, replacement);
			}
			try {
				ObjectMapper mapper = new ObjectMapper();
				IndividualPreVetCodeResponseOp individualPrevetCodeResponseOp = mapper.readValue(responseJsongStringOp,
						IndividualPreVetCodeResponseOp.class);
				IndividualPreVetCodeResponseIn individualPreVetCodeResponseIn = new IndividualPreVetCodeResponseIn();
				Mapper respMapper = new ResponseMapper<>();
				individualPreVetCodeResponseIn = (IndividualPreVetCodeResponseIn) respMapper
						.map(individualPrevetCodeResponseOp.getGetIndividualPreVetCodeResponse(), individualPreVetCodeResponseIn);
				responseJsonStringIn = mapper.writeValueAsString(individualPreVetCodeResponseIn);
			} catch (IOException e) {
				logger.info("error while parsing the response of IndividualPreVetCode: ", e);
				responseJsonStringIn = responseJsongStringOp;
			}

		} else {
			logger.info("forwarding error response with 200 status :");
			responseJsonStringIn = responseJsongStringOp;
		}

		logger.info("response after IndividualPreVetCode response processor: " + responseJsonStringIn);
		exchange.getOut().setBody(responseJsonStringIn);

	}

}