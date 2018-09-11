package io.raju.springbootstarter.topicservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.raju.springbootstarter.topic.Topic;

@Service
public class TopicService {

	List<Topic> topics = new ArrayList<>(Arrays.asList(

			new Topic("Spring", "Spring Framework", "Spring Framework  description"),
			new Topic("Java", "Core java", "java description"),
			new Topic("JavaScript", "JavaScript Framework", "JavaScript description")));

	public List<Topic> getAllTopics() {

		return topics;

	}

	public Topic getTopic(String id) {

		return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

	public void addtopic(Topic topic) {

		topics.add(topic);
	}

	public Topic updateTopic(Topic topic, String id) {

		for (int i = 0; i < topics.size(); i++) {

			if (topics.get(i).getId().equalsIgnoreCase(id)) {

				topics.set(i, topic);

				return topics.get(i);
			}
		}

		return null;
	}

	public void deleteTopic(String id) {
		topics.removeIf(topic->topic.getId().equalsIgnoreCase(id));

	}

}
