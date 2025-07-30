package com.ttn.Spring_Boot.Assingments.controllers;

import com.ttn.Spring_Boot.Assingments.dtos.AuthorDto;
import com.ttn.Spring_Boot.Assingments.entities.Author;
import com.ttn.Spring_Boot.Assingments.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/passauthor")
    public void addListOfSubjects(@RequestBody AuthorDto dto) {
        authorService.addAuthor(dto);
    }
}