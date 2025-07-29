package com.ttn.Spring_Boot.Assingments.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;

@Entity
public class PayCheck extends Payment {


    int checkId;
    String name;
}
