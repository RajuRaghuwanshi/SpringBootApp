package io.raju.elasticsearch.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Data
@Document(indexName="course", type="course")
public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;
	
}
