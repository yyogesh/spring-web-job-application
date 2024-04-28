package com.example.JobSpringApplication.controller;

import com.example.JobSpringApplication.model.JobPost;
import com.example.JobSpringApplication.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

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
        jobService.addJobRequest(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewJobs(Model model) {
        List<JobPost> jobPosts = jobService.returnAllJobPosts();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }



    // DB ==> RDBM ==> OOPS ==> ORM ==> JPA

    // JSP Application
    // Rest application + React application
    // Database JPA
    // Security
}
