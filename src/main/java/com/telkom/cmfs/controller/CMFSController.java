package com.telkom.cmfs.controller;

import java.io.IOException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Path("/")
public class CMFSController {

	private static Logger logger = LoggerFactory.getLogger(CMFSController.class);

	@POST
	@Path("/GetIndividualPreVetCodeIn")
	public String getIndividualPreVetCodeIn(String body) {
		logger.info("========== Inside Individual prevet code inbound=========");
		return body;
	}

	@POST
	@Path("/GetEnterprisePreVetCodeIn")
	public String getEnterprisePreVetCodeIn(String body) {
		logger.info("========== Inside Enterprise prevet inbound =========");
		return body;
	}

	@POST
	@Path("/savevettingoutcome")
	public String savevettingoutcome(String body) {
		logger.info("========== Inside savevettingoutcome inbound =========");
		return body;
	}
	
	@POST
	@Path("/individualircode")
	public String individualircode(String body) {
		logger.info("========== Inside individualircode inbound =========");
		return body;
	}

}
