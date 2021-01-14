package com.app.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.configuration.Configuration;
import com.app.model.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	
	@Autowired
	  private Configuration cfg;
	  
	@GetMapping("/limits")
	public LimitConfiguration show() {
		return new LimitConfiguration(cfg.getMaximum(), cfg.getMinimum());
	}

}
