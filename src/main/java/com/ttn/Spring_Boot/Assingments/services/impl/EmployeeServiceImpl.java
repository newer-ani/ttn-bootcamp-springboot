package com.ttn.Spring_Boot.Assingments.services.impl;

import com.ttn.Spring_Boot.Assingments.dtos.EmployeeDto;
import com.ttn.Spring_Boot.Assingments.exceptionhandling.ResourceNotFoundException;
import com.ttn.Spring_Boot.Assingments.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    List<EmployeeDto> employees = new ArrayList<>();

    EmployeeServiceImpl()
    {
        employees.add(new EmployeeDto(101, "Animesh", 23));
        employees.add(new EmployeeDto(102, "Ritesh", 24));
        employees.add(new EmployeeDto(1103, "Sudhesh", 22));
    }

    @Override
    public List<EmployeeDto> findAllEmployees()
    {
        return employees;
    }

    @Override
    public EmployeeDto findOneEmployee(int id) {
       return  employees.stream().filter(e->e.getId()==id).findFirst().orElseThrow(()-> new ResourceNotFoundException("Employee does not exist"));
    }

    @Override
    public HttpStatus addEmployee(EmployeeDto employee) {
        employees.add(employee);
        return HttpStatus.CREATED;
    }

    @Override
    public HttpStatus deleteEmployee(int id) {
        Iterator<EmployeeDto> it = employees.iterator();
        int flag =0;
        while(it.hasNext())
        {
            if(it.next().getId()==id) {
                it.remove();
                flag =1;
            }
            else
                flag=0;
        }
        if(flag == 0)
            return HttpStatus.BAD_REQUEST;
        else
             return HttpStatus.OK;
    }

    @Override
    public HttpStatus updateEmployee(EmployeeDto e)
    {
        EmployeeDto emp =findOneEmployee(e.getId());
        emp.setId(e.getId());
        emp.setName(e.getName());
        emp.setAge(e.getAge());
        return HttpStatus.OK;
    }
}

