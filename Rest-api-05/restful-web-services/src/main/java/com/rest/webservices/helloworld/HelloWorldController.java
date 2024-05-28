package com.rest.webservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloWorldController {

//	@RequestMapping(path = "/hello-world", method = RequestMethod.GET)
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!";
	}

	@GetMapping("/hello-world-bean")
	public HelloWorld helloWorldBean() {
		return new HelloWorld("Hello World!!");
	}

	@GetMapping("/hello-world/path/{name}")
	public HelloWorld helloWorldPath(@PathVariable String name) {
		return new HelloWorld("Hello World!!" + name);
	}

}
