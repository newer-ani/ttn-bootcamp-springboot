package com.ttn.Spring_Boot.Assingments.manytomany;

import jakarta.persistence.*;

public class Book {


    @Id
    private Long bookId;

    @ManyToMany
    private Author Author;

}
