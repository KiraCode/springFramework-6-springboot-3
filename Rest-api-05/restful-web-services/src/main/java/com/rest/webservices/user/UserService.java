package com.rest.webservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserService {

	private static List<User> user = new ArrayList<>();
	
	private static int count = 0;

	static {
		user.add(new User(++count, "Adam", LocalDate.now().minusYears(30)));
		user.add(new User(++count, "Eve", LocalDate.now().minusYears(25)));
		user.add(new User(++count, "Jimmy", LocalDate.now().minusYears(22)));
	}

	public List<User> findAll() {
		return user;
	}

	public User save(User users) {
//		new User(users.getId(), users.getName(), users.getBirthDate())
		users.setId(++count);
		user.add(users);
		return users;
	}
}
