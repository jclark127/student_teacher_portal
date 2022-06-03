package com.example.student_teacher_portal.repositories;

import com.example.student_teacher_portal.models.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository <Exercise, Long> {
}
