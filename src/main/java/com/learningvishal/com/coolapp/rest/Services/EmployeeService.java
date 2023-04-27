package com.learningvishal.com.coolapp.rest.Services;


import com.learningvishal.com.coolapp.rest.entity.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> findAllEmployee();

    public void saveEmployee(Employee employee);

    Employee findByEmployeeId(int id);

    void deleteById(int id);

    //List<String> findFirstNameAllEmployee();

}


