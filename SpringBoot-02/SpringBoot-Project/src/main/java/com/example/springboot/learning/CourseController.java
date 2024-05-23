package com.example.springboot.learning;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> getCourseList() {
		return Arrays.asList(new Course(1, "AWS", "Ranga"), new Course(2, "SpringBoot", "Ranga"));
	}
}
