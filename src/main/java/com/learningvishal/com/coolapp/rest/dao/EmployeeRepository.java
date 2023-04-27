package com.learningvishal.com.coolapp.rest.dao;

import com.learningvishal.com.coolapp.rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
//    public List<String> findFirstNameOfAllEmployee();
}
