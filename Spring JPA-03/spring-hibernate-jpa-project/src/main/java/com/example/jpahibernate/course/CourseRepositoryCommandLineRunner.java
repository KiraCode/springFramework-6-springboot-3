package com.example.jpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpahibernate.course.datajpa.CourseDataJpaRepository;
import com.example.jpahibernate.course.jdbc.CourseJdbcRepositoy;
import com.example.jpahibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseRepositoryCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepositoy repository;

//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1, "Devops JPA", "Scalar"));
		repository.save(new Course(2, "AWS JPA", "in28minutes"));
		repository.save(new Course(3, "Java JPA", "in28minutes"));

		repository.deleteById(1l);

		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		System.out.println(repository.findByName("Java JPA"));

	}

}
