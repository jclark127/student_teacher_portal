package com.example.student_teacher_portal.repositories;

import com.example.student_teacher_portal.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {


}
