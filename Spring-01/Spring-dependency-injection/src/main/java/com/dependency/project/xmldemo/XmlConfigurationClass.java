package com.dependency.project.xmldemo;

import org.springframework.beans.BeansException;
import com.dependency.project.dependenccy1.BusinessCalculationService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigurationClass {
	public static void main(String[] args) {
		try (var context = new ClassPathXmlApplicationContext("demoConfig.xml")) {
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
