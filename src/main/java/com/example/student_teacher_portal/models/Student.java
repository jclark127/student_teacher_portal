package com.example.student_teacher_portal.models;


import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "student")
    private User user;

    @OneToMany(mappedBy = "student")
    private List<Attendance> attendance;

    @OneToMany(mappedBy = "student")
    private List<Exercise> exercises;

    @OneToMany(mappedBy = "student")
    private List<Quiz> quizzes;

    @OneToMany(mappedBy = "student")
    private List<Assessment> assessments;


}
