package com.toon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ToonList/*")
public class ToonListController {
	
	private static final Logger logger = LoggerFactory.getLogger(ToonListController.class);

	@RequestMapping(value = "/toonlist", method = RequestMethod.GET)
	public void toonlist() throws Exception {
		logger.info("get toonlist"); 
	}
}
