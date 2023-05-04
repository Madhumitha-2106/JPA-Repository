package com.example.demo.Model;

import java.lang.ModuleLayer.Controller;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Logge {
	
	Logger log=LoggerFactory.getLogger(Controller.class)
			@RequestMapping("/")
	public String Model()
	{
		log.info("information message");
		log.warn("warning message");
		log.error("Error message");
		log.debug("Debug message");
		log.trace("trace message");
		
		return "Completed";
	}

}
