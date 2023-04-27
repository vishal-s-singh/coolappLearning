package com.learningvishal.com.coolapp.rest.controller;

import java.util.List;

import com.learningvishal.com.coolapp.rest.Services.StudentDaoImpl;
import com.learningvishal.com.coolapp.rest.Services.StudentNotFoundException;
import com.learningvishal.com.coolapp.rest.dao.StudentDAO;
import com.learningvishal.com.coolapp.rest.entity.Student;
import com.learningvishal.com.coolapp.rest.entity.StudentErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    private StudentDAO studentDAO;

    public StudentController(StudentDAO studentDAO){
        this.studentDAO = studentDAO;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return this.studentDAO.findAllStudent();
    }

    @PostMapping("/students")
    public void creatStudent(@RequestBody Student student){
        this.studentDAO.save(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable int id){
        this.studentDAO.deleteStudentById(id);
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        Student student;
        try {
            student = this.studentDAO.findById(studentId);
        }
        catch (Exception ex){
            throw  new StudentNotFoundException("Student Id not found : "+studentId);
        }
        return student;
    }


}
