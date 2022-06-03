package com.example.student_teacher_portal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }

//    @PostMapping("/home")
//    public String joinCohort() {
//        return "home";
//    }
}
