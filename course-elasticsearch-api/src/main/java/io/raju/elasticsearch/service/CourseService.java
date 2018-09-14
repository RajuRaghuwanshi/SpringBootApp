package io.raju.elasticsearch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.raju.elasticsearch.entity.Course;
import io.raju.elasticsearch.repository.CourseRepository;

@Service
public class CourseService {

	private CourseRepository courseRepository;
	
	@Autowired
	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
	
	public void addCourse(Course course) {
		
		courseRepository.save(course);
		
	}


	public List<Course> getAllCourses() {
		
		List<Course>courses = new ArrayList<>();
		
		courseRepository.findAll().forEach(courses::add);
		
		return courses;
	}


	public Course getCourseById(String id) {
		
		return courseRepository.findOne(id);
	}


	public void deleteCourseById(String id) {
		
		courseRepository.delete(id);
		
	}

}
