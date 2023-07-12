package com.example.nishant.studentcrud.restController;


import com.example.nishant.studentcrud.entity.Student;
import com.example.nishant.studentcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    //define fields for student service

    private StudentService studentService;

    //inject student service using constructor injection

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    //expose endpoint /student and list all students

    @GetMapping("/students")
    public List<Student>findAll(){
        return studentService.findAll();
    }

    //added mapping for GET /student/stundetID

    @GetMapping("/students/{studentID}")
    public Student findById(@PathVariable int studentID){

        Student student= studentService.findById(studentID);

        if(student==null)
        {
            throw  new RuntimeException("Student not found :" +studentID);
        }
        return student;
    }

    //add mapping for POST -add student
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        Student student1 = studentService.save(student);
        return student1;

    }

    //added mapping for PUT /student - update student

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        Student student1 = studentService.save(student);
        return student1;
    }

    //added mapping for delete /student/studentID - delete student

    @DeleteMapping("/students/{studentID}")
    public String deleteStudent(@PathVariable int studentID){
        Student tempStudent = studentService.findById(studentID);

        if(tempStudent == null)
        {
            throw new RuntimeException("Employee not found:"+studentID);
        }

        studentService.deleteById(studentID);
        return "Deleted student id is: "+studentID;
    }




}
