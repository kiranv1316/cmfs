package com.telkom.cmfs.route;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

import com.telkom.cmfs.processor.EnterprisePreVetCodeRequestProcessor;
import com.telkom.cmfs.processor.EnterprisePreVetCodeResponseProcessor;
import com.telkom.cmfs.processor.IndividualIRcodeRequestProcessor;
import com.telkom.cmfs.processor.IndividualIRcodeResponseProcessor;
import com.telkom.cmfs.processor.IndividualPreVetCodeRequestProcessor;
import com.telkom.cmfs.processor.IndividualPreVetCodeResponseProcessor;
import com.telkom.cmfs.processor.SaveVettingRequestProcessor;

public class CamelRoute  extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		from("cxfrs://bean://restService")
		    .choice()
			    .when()
			            .simple("${headers.operationName} == 'getEnterprisePreVetCodeIn'")
			            .process(new EnterprisePreVetCodeRequestProcessor())
			            .log("======== inside getEnterprisePreVetCodeIn ========")
			            .to("direct:getEnterprisePreVetCode")  
			    .when()
			            .simple("${headers.operationName} == 'getIndividualPreVetCodeIn'")
			            .process(new IndividualPreVetCodeRequestProcessor())
			            .log("======= inside getIndividualPreVetCodeIn ========")   
			            .to("direct:getIndividualPreVetCode")
			    .when()
			            .simple("${headers.operationName} == 'savevettingoutcome'")
			            .process(new SaveVettingRequestProcessor())
			            .log("======== inside save credit vetting ========")
			            .to("direct:savevettingoutcome")  
			    .when()
			            .simple("${headers.operationName} == 'individualircode'")
			            .process(new IndividualIRcodeRequestProcessor())
			            .log("======== inside save credit vetting ========")
			            .to("direct:individualircode")  
		    .end(); 
		
		from("direct:getEnterprisePreVetCode").removeProperties("*").removeHeaders("*")
			.setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
			.setHeader(Exchange.HTTP_METHOD, constant("POST"))
			.setHeader("x-api-key", constant("M2gjUnenQWDu6bVz2GwCtmAuyEFuVpXJ"))
			.to("http://10.227.169.70:9002/bss/cv/api/cmfs/enterpriseprevetcode")
			.log("======= inside getEnterprisePreVetCode ========")
			.process(new EnterprisePreVetCodeResponseProcessor())
			//.to("http://localhost:9999/updateCmfs")
			.log("======= update crm ========")
			.end();
		
		from("direct:getIndividualPreVetCode").removeProperties("*").removeHeaders("*")
			.setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
			.setHeader(Exchange.HTTP_METHOD, constant("POST"))
			.setHeader("x-api-key", constant("M2gjUnenQWDu6bVz2GwCtmAuyEFuVpXJ"))
			.to("http://10.227.169.70:9002/bss/cv/api/cmfs/individualprevetcode")
			.log("======== inside getIndividualPreVetCode ========")  
		 	.process(new IndividualPreVetCodeResponseProcessor())
			//.to("http://localhost:9999/updateCmfs")
			.log("======= update crm ========")
			.end();
		
		from("direct:savevettingoutcome").removeProperties("*").removeHeaders("*")
			.setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
			.setHeader(Exchange.HTTP_METHOD, constant("POST"))
			.setHeader("x-api-key", constant("M2gjUnenQWDu6bVz2GwCtmAuyEFuVpXJ"))
			.to("http://10.227.169.70:9002/bss/cv/api/cmfs/vettingoutcome")
			.log("======== inside savevettingoutcome ========")  
		 	.end();
		
		from("direct:individualircode").removeProperties("*").removeHeaders("*")
			.setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
			.setHeader(Exchange.HTTP_METHOD, constant("POST"))
			.setHeader("x-api-key", constant("M2gjUnenQWDu6bVz2GwCtmAuyEFuVpXJ"))
			.to("http://10.227.169.70:9002/bss/cv/api/cmfs/individualircode")
			.log("======== inside individualircode ========")  
			.process(new IndividualIRcodeResponseProcessor())
		 	.end();
		
	}
}