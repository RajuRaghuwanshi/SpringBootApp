package io.raju.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import io.raju.elasticsearch.entity.Course;

public interface CourseRepository  extends ElasticsearchCrudRepository<Course, String>{

}
