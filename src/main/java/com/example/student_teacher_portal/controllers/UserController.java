package com.example.student_teacher_portal.controllers;

import com.example.student_teacher_portal.models.User;
import com.example.student_teacher_portal.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    private final UserRepository userDao;

    public UserController(UserRepository userDao){
        this.userDao = userDao;
    }

    @GetMapping("/register")
    public String getRegister(Model model){
        model.addAttribute("user", new User());
        return "";
    }
}
