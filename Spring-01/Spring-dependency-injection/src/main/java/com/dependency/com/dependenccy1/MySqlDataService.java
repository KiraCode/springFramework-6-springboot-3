package com.dependency.com.dependenccy1;

import org.springframework.stereotype.Component;

@Component
class MySqlDataService implements DataService {

	@Override
	public int[] retrieveData() {
		System.out.println("Inside MySqlDataService ");
		return new int[] { 1, 2, 3, 4, 5 };
	}

}