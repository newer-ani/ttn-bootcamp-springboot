package com.ttn.Spring_Boot.Assingments.controller;

import com.mysql.cj.x.protobuf.Mysqlx;
import com.ttn.Spring_Boot.Assingments.entities.Employee;
import com.ttn.Spring_Boot.Assingments.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getall")
     public List<Employee> firstLastName()
     {
         return employeeService.getFirstNameAndLastName();
     }
    @PutMapping("/update-salary")
    public ResponseEntity<String> updateSalary(@RequestParam int newSalary) {
        employeeService.updateEmployee(newSalary);
        return ResponseEntity.ok("Salaries updated successfully.");
    }


    @DeleteMapping("/delete-min-salary")
    public ResponseEntity<String> deleteEmployeesWithMinSalary() {
        employeeService.deleteEmployeesWithMinSalary();
        return ResponseEntity.ok("Employees with minimum salary deleted.");
    }


    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.findAllEmployeeNative();
        return ResponseEntity.ok(employees);
    }

    @DeleteMapping("/delete-by-age")
    public ResponseEntity<String> deleteByAge(@RequestParam int age) {
        employeeService.deleteEmployeeByAge(age);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}

