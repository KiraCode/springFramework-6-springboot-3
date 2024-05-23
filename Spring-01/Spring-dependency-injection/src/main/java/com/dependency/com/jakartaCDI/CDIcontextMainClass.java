package com.dependency.com.jakartaCDI;

import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
@Named
class BusinessClass {
	private DataService dataService;

	public DataService getDataService() {
		return dataService;
	}

//	@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Inside Setter Method");
		this.dataService = dataService;
	}

}

//@Component
@Named
class DataService {

}

@Configuration
@ComponentScan
public class CDIcontextMainClass {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(CDIcontextMainClass.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			context.getBean(BusinessClass.class).getDataService();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
