package com.springGame.project.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {}

record Address(String firstLine, String city) {}

@Configuration
public class HelloWorld {

	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean
	@Primary
	public Person person() {
		return new Person("King", 90, new Address("Poor Street", "LosAngeles"));
	}
	
	@Bean
	public Person personMethodCall() {
		return new Person(name(), age(), new Address("melbourne", "Australia"));
	}

	@Bean
	public Person personParameterCall(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean
	public Person personParameterCallQualifier(String name, int age, @Qualifier("addressQualifier") Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	@Primary
	public Address address() {
		return new Address("Rich Street", "New Land");
	}
	
	@Bean
	public Address address2() {
		return new Address("Forest Street", "Mumbai");
	}
	
	@Bean
	@Qualifier("addressQualifier")
	public Address address3() {
		return new Address("Chruch Street", "Bangalore");
	}
}
