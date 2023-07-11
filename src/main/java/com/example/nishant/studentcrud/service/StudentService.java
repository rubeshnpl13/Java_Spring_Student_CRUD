package com.example.nishant.studentcrud.service;

import com.example.nishant.studentcrud.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student findById(Integer id);

    Student save(Student students);

    void deleteById(Integer id);

}
