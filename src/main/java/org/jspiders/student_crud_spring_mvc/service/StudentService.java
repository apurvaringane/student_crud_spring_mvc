package org.jspiders.student_crud_spring_mvc.service;

import org.jspiders.student_crud_spring_mvc.model.Student;
import org.jspiders.student_crud_spring_mvc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudent()
    {
        return repository.findAll();
    }

    public Student getStudentById(int id)
    {
        return repository.findById(id).orElse(null);
    }
    public void addNewStudent(Student s)
    {
        repository.save(s);
    }

    public void updateStudent(Student s)
    {
        repository.save(s);
    }

    public void deleteStudentById(int id)
    {
        repository.deleteById(id);
    }

}
