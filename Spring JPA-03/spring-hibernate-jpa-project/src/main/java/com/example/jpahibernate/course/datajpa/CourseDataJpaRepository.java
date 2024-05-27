package com.example.jpahibernate.course.datajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpahibernate.course.Course;

@Repository
public interface CourseDataJpaRepository extends JpaRepository<Course, Long>{

	List<Course> findByAuthor(String author);
	
	List<Course> findByName(String name);

}
