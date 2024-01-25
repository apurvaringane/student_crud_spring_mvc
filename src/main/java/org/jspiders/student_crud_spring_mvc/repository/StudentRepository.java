package org.jspiders.student_crud_spring_mvc.repository;

import org.jspiders.student_crud_spring_mvc.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
