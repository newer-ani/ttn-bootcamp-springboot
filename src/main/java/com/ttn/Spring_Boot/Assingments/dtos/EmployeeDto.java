package com.ttn.Spring_Boot.Assingments.dtos;

import jakarta.validation.constraints.Size;

public class EmployeeDto {


    int id;
    @Size(min=5,message = "should have atleast 5 characters")
    String name;
    int  age;

    public EmployeeDto(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

}
