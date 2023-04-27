package com.learningvishal.com.coolapp;

import com.learningvishal.com.coolapp.rest.dao.StudentDAO;
import com.learningvishal.com.coolapp.rest.entity.Student;
import jakarta.persistence.TypedQuery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import java.util.List;

@SpringBootApplication
public class CoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{
//			createStudent(studentDAO);
			getAllStudents(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO){
		Student student = new Student("Harshada","Singh","harshada@gmail.com");
		studentDAO.save(student);
		System.out.println("Student generated with Id : " + student.getId());
	}

	public void getAllStudents(StudentDAO studentDAO){
		List<Student> studentList = studentDAO.findAllStudent();
		for(int i=0;i<studentList.size();i++){
			Student student = studentList.get(i);
			System.out.print(student.getId() + " " + student.getFirstName()+" " + student.getLastName()+" "+
					student.getEmail());
			System.out.println("");
		}
	}

	private void updateStudent(StudentDAO studentDAO){
		Student student = getStudentById(1,studentDAO);
		student.setFirstName("Vishal Singh");
		studentDAO.updateStudent(student);
	}

	private Student getStudentById(int id, StudentDAO studentDAO){
		return studentDAO.findById(id);
	}

	private void deleteStudent(StudentDAO studentDAO){
		studentDAO.deleteStudentById(2);
		System.out.println("Deleted successfully");
	}
}
