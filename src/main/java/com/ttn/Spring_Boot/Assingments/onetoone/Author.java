package com.ttn.Spring_Boot.Assingments.onetoone;

import com.ttn.Spring_Boot.Assingments.onetomany.Book;
import jakarta.persistence.*;

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String name;

    @OneToOne
    private Book book;
}
