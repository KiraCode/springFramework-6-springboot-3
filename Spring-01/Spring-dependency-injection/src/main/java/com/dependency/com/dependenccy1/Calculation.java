package com.dependency.com.dependenccy1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Calculation {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(Calculation.class)) {
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
}
