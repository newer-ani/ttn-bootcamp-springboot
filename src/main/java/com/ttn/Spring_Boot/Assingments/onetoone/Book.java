package com.ttn.Spring_Boot.Assingments.onetoone;

import com.ttn.Spring_Boot.Assingments.onetomany.Author;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class Book {


    @Id
    private Long bookId;

    @OneToOne
    private Author Author;
}
