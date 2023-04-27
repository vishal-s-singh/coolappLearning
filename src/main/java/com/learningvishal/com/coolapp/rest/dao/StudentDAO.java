package com.learningvishal.com.coolapp.rest.dao;
import java.util.List;
import com.learningvishal.com.coolapp.rest.entity.Student;

public interface StudentDAO {
    public void save(Student student);

    public List<Student> findAllStudent();

    public void updateStudent(Student student);

    public Student findById(int id);

    public void deleteStudentById(int id);
}
