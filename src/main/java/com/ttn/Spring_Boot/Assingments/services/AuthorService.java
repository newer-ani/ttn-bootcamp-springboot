package com.ttn.Spring_Boot.Assingments.services;

import com.ttn.Spring_Boot.Assingments.dtos.AuthorDto;
import com.ttn.Spring_Boot.Assingments.entities.Address;
import com.ttn.Spring_Boot.Assingments.entities.Author;
import com.ttn.Spring_Boot.Assingments.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public void addAuthor(AuthorDto dto) {
        Author author = new Author();
        author.setName(dto.getName());
        author.setSubject(dto.getSubjects());

        Address address = new Address();
        address.setStreetNumber(dto.getAddress().getStreetNumber());
        address.setLocation(dto.getAddress().getLocation());
        address.setState(dto.getAddress().getState());

        author.setAddress(address);
        authorRepository.save(author);
    }
}
