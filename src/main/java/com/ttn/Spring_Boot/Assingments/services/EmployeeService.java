package com.ttn.Spring_Boot.Assingments.services;

import com.ttn.Spring_Boot.Assingments.entities.Employee;
import com.ttn.Spring_Boot.Assingments.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
   private  EmployeeRepository employeeRepository;

    public List<Employee> getFirstNameAndLastName()
    {
        return employeeRepository.findByFirstLastAgeAndSalary();
    }

    public void updateEmployee(int newSalary)
    {
       employeeRepository.updateSalaryByGivenSalary(newSalary);
    }

    public void deleteEmployeesWithMinSalary()
    {
       employeeRepository.deleteMinSalaryEmployee();
    }

    public List<Employee> findAllEmployeeNative(){
        return employeeRepository.findAllEmployee();
    }

    public void deleteEmployeeByAge(int age)
    {
        employeeRepository.deleteEmployeeByParameter(age);
    }

}
