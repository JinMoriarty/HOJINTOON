package com.toon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/WebToon/*")
public class WebToonController {
	
	private static final Logger logger = LoggerFactory.getLogger(WebToonController.class);

	@RequestMapping(value = "/webtoonpage", method = RequestMethod.GET)
	public void getAma() throws Exception {
		logger.info("get webtoonpage"); 
	}
}
