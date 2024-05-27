package com.example.jpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpahibernate.course.jdbc.CourseJdbcRepositoy;
import com.example.jpahibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseRepositoryCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepositoy repository;

	@Autowired
	private CourseJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "Devops JPA", "Scalar"));
		repository.insert(new Course(2, "AWS JPA", "in28minutes"));
		repository.insert(new Course(3, "Java JPA", "in28minutes"));

		repository.delete(1);

		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));

	}

}
