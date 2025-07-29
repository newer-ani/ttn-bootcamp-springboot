package com.ttn.Spring_Boot.Assingments.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "vehicle_type")
public class Vehicle1 {

    @Id
    int id;
    String name;

}
