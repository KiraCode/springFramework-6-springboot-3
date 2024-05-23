package com.dependency.project.dependenccy;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
class BusinessClass{
	
//	@Autowired
	private Dependency1 dependency1;
	
//	@Autowired
	private Dependency2 dependency2;
	
//	Constructor based inject here @Autowired is not required to added
//	@Autowired
//	public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
//		super();
//		this.dependency1 = dependency1;
//		this.dependency2 = dependency2;
//	}
	
//	Setter based injection
	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("Setter Injection - setDependency1 ");
		this.dependency1 = dependency1;
	}
	
	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("Setter Injection - setDependency2 ");
		this.dependency2 = dependency2;
	}
	
	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}
}

//@Component
class Dependency1{
	
}

//@Component
class Dependency2{
	
}

@Configuration
@ComponentScan
public class DependencyClass {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(DependencyClass.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
