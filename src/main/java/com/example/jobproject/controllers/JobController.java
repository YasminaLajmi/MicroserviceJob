package com.example.jobproject.controllers;

import com.example.jobproject.entities.Job;
import com.example.jobproject.services.IJobService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
@AllArgsConstructor
public class JobController {
    private final IJobService iJobService;

    @PutMapping("/{id}")
    public Job updateEtatJob(@PathVariable long id) {
        return iJobService.updateEtatJob(id);
    }
    @GetMapping("/{id}")
    public Job getJob(@PathVariable long id) {
        return iJobService.retrieveJob(id);
    }
    @GetMapping("/parNom/{nom}")
    public Job getJobParNom(@PathVariable String nom) {
        return iJobService.findJobByNom(nom);
    }

    @GetMapping("")
    public List<Job> getJobs() {
        return iJobService.retrieveAllJobs();
    }

}
