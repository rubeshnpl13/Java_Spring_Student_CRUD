package com.example.nishant.studentcrud.Repository;

import com.example.nishant.studentcrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    
}

