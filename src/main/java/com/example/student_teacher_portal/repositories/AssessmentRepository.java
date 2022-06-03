package com.example.student_teacher_portal.repositories;

import com.example.student_teacher_portal.models.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssessmentRepository extends JpaRepository <Assessment, Long> {
}
