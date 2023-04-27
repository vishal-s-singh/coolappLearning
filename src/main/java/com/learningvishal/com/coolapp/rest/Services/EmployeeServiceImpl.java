package com.learningvishal.com.coolapp.rest.Services;

import com.learningvishal.com.coolapp.rest.dao.EmployeeRepository;
import com.learningvishal.com.coolapp.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public  EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> findAllEmployee() {
        return this.employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee findByEmployeeId(int id) {

        Optional<Employee> result = this.employeeRepository.findById(id);
        Employee employee = null;
        if(result.isPresent()){
            employee = result.get();
        }
        return employee;
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        this.employeeRepository.deleteById(id);
    }

//    @Override
//    public List<String> findFirstNameAllEmployee() {
//        return this.employeeRepository.findFirstNameOfAllEmployee();
//    }
}
