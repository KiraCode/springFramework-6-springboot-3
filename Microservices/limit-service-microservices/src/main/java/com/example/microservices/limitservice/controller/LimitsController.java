package com.example.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.limitservice.bean.Limits;
import com.example.microservices.limitservice.configuration.ConfigurationService;

@RestController
public class LimitsController {

	@Autowired
	private ConfigurationService service;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(service.getMinimum(), service.getMaximum());
	}
}
