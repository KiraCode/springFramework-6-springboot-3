package com.example.springboot.configproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Autowired
	private CurrentServiceClass serviceClass;

	@RequestMapping("/current-service")
	public CurrentServiceClass getCurrentService() {
		return serviceClass;
	}
}
