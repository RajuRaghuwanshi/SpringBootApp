package io.raju.elasticsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.raju.elasticsearch.entity.Course;
import io.raju.elasticsearch.service.CourseService;

@RestController
public class CourseController {

	private CourseService courseService;

	@Autowired
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/courses")
	public void addCourse(@RequestBody Course course) {

		courseService.addCourse(course);
	}

	@RequestMapping("/courses")
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}

	@RequestMapping("/courses/{id}")
	public Course getCourse(@PathVariable String id) {

		return courseService.getCourseById(id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
	public void deleteCourse(@PathVariable String id) {

		courseService.deleteCourseById(id);
	}
}
