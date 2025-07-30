package com.ttn.Spring_Boot.Assingments.onetomany;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Book {


    @Id
    private Long bookId;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Author Author;

}
