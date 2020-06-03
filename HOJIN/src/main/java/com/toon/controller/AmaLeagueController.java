package com.toon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/AmaLeague/*")
public class AmaLeagueController {
	
	private static final Logger logger = LoggerFactory.getLogger(AmaLeagueController.class);

	@RequestMapping(value = "/amaleague", method = RequestMethod.GET)
	public void getAma() throws Exception {
		logger.info("get amaleague"); 
	}
}
