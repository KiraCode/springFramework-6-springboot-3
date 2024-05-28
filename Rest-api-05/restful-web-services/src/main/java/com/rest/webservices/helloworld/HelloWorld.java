package com.rest.webservices.helloworld;

public class HelloWorld {

	private String message;

	public HelloWorld(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
