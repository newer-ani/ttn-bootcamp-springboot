package com.ttn.Spring_Boot.Assingments.controller;

import com.ttn.Spring_Boot.Assingments.entities.Employee;
import com.ttn.Spring_Boot.Assingments.services.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee)
    {
        employeeService.createEmployee(employee);
    }

    @PutMapping("/update")
    public void UpdateEmployee(@RequestBody Employee employee)
    {
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(@RequestParam long id )
    {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/getall")
    public List<Employee> getAllEmployee()
    {
        return employeeService.readEmployee();
    }

    @GetMapping("/count")
    public long getCountOfEmployee()
    {
        return employeeService.countNumberOfEmployees();
    }

    @GetMapping("/getByName")
    public List<Employee> findByEmployeeName(@RequestParam String name)
    {
        return employeeService.findByNameService(name);
    }

    @GetMapping("/findbysinglecharacter")
    public List<Employee> findByCharacter()
    {
        return employeeService.findByCharacterAService();
    }

    @GetMapping("/findbyage")
    public List<Employee> findByAge(@RequestParam int a , @RequestParam int b)
    {
        return employeeService.findBYAgeBetween(a,b);
    }

    @GetMapping("/pageandsort")
    public List<Employee> pageAndSortByAge(@RequestParam int page,@RequestParam int size)
    {
        return employeeService.pagingAndSorting(page,size).getContent();
     }
}
