package com.ttn.Spring_Boot.Assingments.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


//Q1 Create an Employee Entity which contains the following fields: Name, Id, Age, Location
@Entity
public class Employee {

    private String name;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private int age;
    private String location;

    public Employee()
    {

    }
    public Employee(String name, Long id, int age, String location) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}