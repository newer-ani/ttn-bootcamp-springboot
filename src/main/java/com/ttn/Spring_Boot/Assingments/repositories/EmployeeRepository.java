package com.ttn.Spring_Boot.Assingments.repositories;

import com.ttn.Spring_Boot.Assingments.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

  // Using JPQL for all the parts of Q1

  @Query("select e.firstName,e.lastName from Employee e where salary > (select avg(e2.salary) from Employee e2 )order by e.age asc , e.salary desc")
  List<Employee> findByFirstLastAgeAndSalary();

  @Modifying
  @Query("update Employee e set e.salary= :newSalary where salary < (select avg(e2.salary) from Employee e2 ) ")
  void updateSalaryByGivenSalary(@Param("newSalary")int newSalary);

  @Modifying
  @Query("delete from Employee e where e.salary = (select min(e2.salary) from Employee e2)")
  void deleteMinSalaryEmployee();


  //Using native queries for all the parts of Q2

  @NativeQuery(" select id,first_name,last_name from employee where last_name = singh ")
  List<Employee> findAllEmployee();

  @NativeQuery("delete from employee where age>:a")
  void deleteEmployeeByParameter(@Param("a") int a);

}
