package com.dependency.com.dependenccy1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataservice implements DataService {

	@Override
	public int[] retrieveData() {
		System.out.println("Inside MongoDbDataservice ");
		return new int[] { 11, 22, 33, 44, 55 };
	}

}