package com.example.jpahibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.jpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

	@Autowired
	private EntityManager manager;

	public void insert(Course course) {
		manager.merge(course);
	}

	public Course findById(long id) {
		return manager.find(Course.class, id);
	}

	public void delete(long id) {
		Course course = findById(id);
		manager.remove(course);
	}
}
