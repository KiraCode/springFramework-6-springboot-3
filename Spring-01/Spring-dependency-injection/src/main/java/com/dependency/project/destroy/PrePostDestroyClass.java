package com.dependency.project.destroy;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {

	public void getReady() {
		System.out.println("Initialize Beans");
	}

}

@Component
class PrePostDestroy {
	private SomeClass someClass;

	public PrePostDestroy(SomeClass someClass) {
		super();
		this.someClass = someClass;
		System.out.println("Inside the Constructor");
	}

	@PostConstruct
	void doSomething() {
		someClass.getReady();
	}

	@PreDestroy
	void cleanUp() {
		System.out.println("Clean-UP");
	}
}

@Configuration
@ComponentScan
public class PrePostDestroyClass {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(PrePostDestroyClass.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
