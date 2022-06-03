package com.example.student_teacher_portal.repositories;

import com.example.student_teacher_portal.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long> {
}
