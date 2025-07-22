package com.ttn.Spring_Boot.Assingments.services;

import com.ttn.Spring_Boot.Assingments.dtos.EmployeeDto;
import org.springframework.http.HttpStatus;

import java.util.List;


public interface EmployeeService {

    public List<EmployeeDto> findAllEmployees();

    public EmployeeDto findOneEmployee(int id );

    public HttpStatus addEmployee(EmployeeDto employee);

    public HttpStatus deleteEmployee(int id);

    public HttpStatus updateEmployee(EmployeeDto employee);
}
