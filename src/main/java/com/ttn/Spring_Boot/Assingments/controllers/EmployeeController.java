package com.ttn.Spring_Boot.Assingments.controllers;

import com.ttn.Spring_Boot.Assingments.dtos.EmployeeDto;
import com.ttn.Spring_Boot.Assingments.services.impl.EmployeeServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {

    private final EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService)
    {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public List<EmployeeDto> getAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeDto getOneEmployees(@PathVariable int id) {
        return employeeService.findOneEmployee(id);
    }

    @PostMapping("/add")
    public HttpStatus createEmployee(@Valid @RequestBody EmployeeDto employee)
    {
       return employeeService.addEmployee(employee);
    }

    @DeleteMapping("/delete")
    public HttpStatus deleteEmployee(@RequestParam int id)
    {
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/update")
    public HttpStatus updateEmployee(@RequestBody EmployeeDto employee)
    {

        return employeeService.updateEmployee(employee);
    }

}
