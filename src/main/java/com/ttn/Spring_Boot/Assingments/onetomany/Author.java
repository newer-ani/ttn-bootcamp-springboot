package com.ttn.Spring_Boot.Assingments.onetomany;

import jakarta.persistence.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String name;

    @OneToMany(mappedBy = "author",cascade = CascadeType.PERSIST)
    private Book book;

}
