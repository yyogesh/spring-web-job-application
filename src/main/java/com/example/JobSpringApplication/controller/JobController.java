package com.example.JobSpringApplication.controller;

import com.example.JobSpringApplication.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        System.out.println("jobPost" + jobPost);
        return "success";
    }



    // DB ==> RDBM ==> OOPS ==> ORM ==> JPA

    // JSP Application
    // Rest application + React application
    // Database JPA
    // Security
}
