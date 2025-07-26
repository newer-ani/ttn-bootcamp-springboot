package com.ttn.Spring_Boot.Assingments.services;

import com.ttn.Spring_Boot.Assingments.entities.Employee;
import com.ttn.Spring_Boot.Assingments.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService  {

    @Autowired
    private  EmployeeRepository employeeRepository;

//     public EmployeeService(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }

    // Q3. Perform Create Operation on Entity using Spring Data JPA
    public void createEmployee(Employee employee)
    {
       employeeRepository.save(employee);
    }

//    Q4)Perform Update Operation on Entity using Spring Data JPA
    public Employee updateEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

//    Q5)Perform Delete Operation on Entity using Spring Data JPA
    public void deleteEmployee(Long id)
    {
        employeeRepository.deleteById(id);
    }

//    Q6)Perform Read Operation on Entity using Spring Data JPA
    public List<Employee> readEmployee()
    {
        return employeeRepository.findAll();
    }

//    Q7)Get the total count of the number of Employees
    public long countNumberOfEmployees()
    {
        return employeeRepository.count();
    }
//    Q8)Implement Pagination and Sorting on the bases of Employee Age
    public Page<Employee> pagingAndSorting(int page , int size)
    {
        Sort sort = Sort.by("age");
        Pageable pageable = PageRequest.of(page,size,sort);
        return employeeRepository.findAll(pageable);
    }

//    Q9)Create and use finder to find Employee by Name
     public List<Employee> findByNameService(String name)
     {
         return employeeRepository.findByName(name);
     }
//    Q10)Create and use finder to find Employees starting with A character
     public List<Employee> findByCharacterAService()
     {
         return employeeRepository.findByNameLike("A%");
     }
//    Q11)Create and use finder to find Employees Between the age of 28 to 32
     public  List<Employee> findBYAgeBetween(int a ,int b)
     {
         return employeeRepository.findByAgeBetween(a,b);
     }
}
