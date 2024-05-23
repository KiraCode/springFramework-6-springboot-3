package com.dependency.project.scope;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class SingletonClass {

}

@org.springframework.context.annotation.Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

@Configuration
@ComponentScan
public class Scope {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(Scope.class)) {
			System.out.println(context.getBean(SingletonClass.class));
			System.out.println(context.getBean(SingletonClass.class));
			System.out.println(context.getBean(SingletonClass.class));

			System.out.println();
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			
			System.out.println();

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
