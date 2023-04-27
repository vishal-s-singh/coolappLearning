package com.learningvishal.com.coolapp.rest.Services;

import com.learningvishal.com.coolapp.rest.dao.StudentDAO;
import com.learningvishal.com.coolapp.rest.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Type;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDAO {

    private EntityManager entityManager;

    @Autowired
    public StudentDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        this.entityManager.persist(student);
    }

    @Override
    public List<Student> findAllStudent() {
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student order by firstName asc, id desc",Student.class);

        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void updateStudent(Student student) {
        entityManager.merge(student);
    }

    @Override
    public Student findById(int id) {
        TypedQuery<Student> query = entityManager.createQuery("from Student where id=:id",Student.class);
        query.setParameter("id",id);
        Student student = query.getSingleResult();
        return student;
    }

    @Override
    @Transactional
    public void deleteStudentById(int id) {
        Query query = entityManager.createQuery("delete from Student where id=:id");
        query.setParameter("id",id);
        query.executeUpdate();
    }
}
