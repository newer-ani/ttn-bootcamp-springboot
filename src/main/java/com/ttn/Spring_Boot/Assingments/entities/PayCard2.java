package com.ttn.Spring_Boot.Assingments.entities;

import jakarta.persistence.Entity;

@Entity
public class PayCard2 extends Payment2 {


    int paymentId;
    String name;
}
