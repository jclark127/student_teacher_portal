package com.example.student_teacher_portal.repositories;

import com.example.student_teacher_portal.models.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository <Attendance, Long> {
}
