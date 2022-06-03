package com.example.student_teacher_portal.repositories;

import com.example.student_teacher_portal.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository <Quiz, Long> {

}
