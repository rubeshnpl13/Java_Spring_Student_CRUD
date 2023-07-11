package com.example.nishant.studentcrud.service;

import com.example.nishant.studentcrud.Repository.StudentRepository;
import com.example.nishant.studentcrud.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService{

    //define fields for student repository

    private StudentRepository studentRepository;

    //inject employee DAO using constructor injection

    public StudentServiceImp(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }


    @Override
    public Student findById(Integer id) {
        Optional<Student> result=studentRepository.findById(id);

        Student student = null;
        if(result.isPresent())
        {
            student=result.get();
        }else
        {
            throw new RuntimeException("Employee do not find: "+id);
        }
        return student;
    }

    @Override
    public Student save(Student students) {
        return studentRepository.save(students);
    }

    @Override
    public void deleteById(Integer id) {
        studentRepository.deleteById(id);
    }
}
