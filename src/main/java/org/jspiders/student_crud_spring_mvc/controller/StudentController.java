package org.jspiders.student_crud_spring_mvc.controller;

import org.jspiders.student_crud_spring_mvc.model.Student;
import org.jspiders.student_crud_spring_mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> getAllStudent()
    {
        return service.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id)
    {
        return service.getStudentById(id);
    }

    @PostMapping("/addstudent")
    public void addNewStudent(@RequestBody Student s)
    {
        service.addNewStudent(s);
    }

    @PutMapping("/student/{id}")
    public void updateStudent(@RequestBody Student s)
    {
        service.updateStudent(s);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable(value = "id") int studentId)
    {
        service.deleteStudentById(studentId);
    }

}
