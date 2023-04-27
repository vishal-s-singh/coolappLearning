package com.learningvishal.com.coolapp.rest.controller;

import com.learningvishal.com.coolapp.rest.Services.EmployeeService;
import com.learningvishal.com.coolapp.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee employee){
        this.employeeService.saveEmployee(employee);

    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return this.employeeService.findAllEmployee();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId){
        Employee employee = this.employeeService.findByEmployeeId(employeeId);
        return employee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteByEmployeeId(@PathVariable int employeeId){
        Employee employee = this.employeeService.findByEmployeeId(employeeId);
        this.employeeService.deleteById(employeeId);
        System.out.println("Employee Deleted successfully : " + employeeId);
    }

//    @GetMapping("/employees/firstName")
//    public List<String> findFirstNameAllEmployee(){
//        return this.employeeService.findFirstNameAllEmployee();
//    }
}
