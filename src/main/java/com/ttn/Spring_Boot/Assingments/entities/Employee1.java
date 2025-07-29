package com.ttn.Spring_Boot.Assingments.entities;

import jakarta.persistence.*;

@Entity
public class Employee1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private double taxAmount;
    private int specialAllowanceSalary;


    @AttributeOverrides({
            @AttributeOverride(name = "column", column = @Column(name = "amount")),
            @AttributeOverride(name ="acknowledge",column =  @Column(name  = "ack"))
    })
    private  Salary baseSalary;

    @AttributeOverrides({
            @AttributeOverride(name = "column", column = @Column(name = "bonusAmt")),
            @AttributeOverride(name ="acknowledge",column =  @Column(name  = "ack1"))})
    private Salary bonusSalary;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public int getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(int specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }



}
