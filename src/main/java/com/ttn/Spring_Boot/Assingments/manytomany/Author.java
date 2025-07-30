package com.ttn.Spring_Boot.Assingments.manytomany;

import jakarta.persistence.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String name;

    @ManyToMany
    private Book book;

}
