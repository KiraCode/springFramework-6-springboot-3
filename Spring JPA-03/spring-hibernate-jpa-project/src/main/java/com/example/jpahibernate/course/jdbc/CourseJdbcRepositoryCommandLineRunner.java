package com.example.jpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpahibernate.course.Course;

@Component
public class CourseJdbcRepositoryCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepositoy repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "Devops", "Scalar"));
		repository.insert(new Course(2, "AWS", "in28minutes"));

	}

}
