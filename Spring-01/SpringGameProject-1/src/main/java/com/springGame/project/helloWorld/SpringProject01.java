package com.springGame.project.helloWorld;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringProject01 {
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(HelloWorld.class)) {
			System.out.println(context.getBean("name"));

			System.out.println(context.getBean("age"));

			System.out.println(context.getBean("person"));

			System.out.println(context.getBean("personMethodCall"));

			System.out.println(context.getBean("personParameterCall"));

			System.out.println(context.getBean("personParameterCallQualifier"));

			System.out.println(context.getBean(Person.class));

			System.out.println(context.getBean("address"));

			System.out.println(context.getBean(Address.class));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

	}
}
