package com.ttn.Spring_Boot.Assingments.controllers;

import com.ttn.Spring_Boot.Assingments.hateoas.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TopicController {

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("1", "Spring Boot Basics"),
                new Topic("2", "Spring Security"),
                new Topic("3", "Spring Data JPA")
        );
    }
}

