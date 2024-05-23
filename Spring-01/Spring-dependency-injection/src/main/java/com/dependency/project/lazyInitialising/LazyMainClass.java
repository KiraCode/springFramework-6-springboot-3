package com.dependency.project.lazyInitialising;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
	@SuppressWarnings("unused")
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("ClassA has been initialized in ClassB Constructor");
		this.classA = classA;
	}

	public void callClassBmethod() {
		System.out.println("Calling the method inside the ClassB");
	}
}

@Configuration
@ComponentScan
public class LazyMainClass {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(LazyMainClass.class)) {
			System.out.println("Inside the Main Class");
			context.getBean(ClassB.class).callClassBmethod();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
