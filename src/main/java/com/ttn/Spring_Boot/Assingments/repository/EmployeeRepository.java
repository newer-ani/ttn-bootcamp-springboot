package com.ttn.Spring_Boot.Assingments.repository;

import com.ttn.Spring_Boot.Assingments.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


// Q2 . Set up EmployeeRepository with Spring Data JPA
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

       List<Employee> findByName(String name);
       List<Employee> findByNameLike(String name);
       List<Employee> findByAgeBetween(int a , int b);
}
