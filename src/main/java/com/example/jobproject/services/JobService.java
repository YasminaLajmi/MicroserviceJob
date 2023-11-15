package com.example.jobproject.services;

import com.example.jobproject.entities.Job;
import com.example.jobproject.repositories.JobRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JobService implements IJobService {
    private final JobRepository jobRepo;

    @Override
    public List<Job> retrieveAllJobs() {
        return jobRepo.findAll();
    }


    @Override
    public Job updateEtatJob(long id) {
         Job job=jobRepo.findById(id).orElse(null);
         job.setEtat(!job.getEtat());
         return jobRepo.save(job);

    }

    @Override
    public Job retrieveJob(long id) {
        return jobRepo.findById(id).orElse(null);
    }


    @Override
    public Job findJobByNom(String service) {
       return jobRepo.findJobByService(service);

    }
}
