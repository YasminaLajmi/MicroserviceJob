package com.example.jobproject.services;
import com.example.jobproject.entities.Job;
import java.util.List;

public interface IJobService {
    List<Job> retrieveAllJobs();
    Job updateEtatJob(long id);
    Job retrieveJob(long id);
    Job findJobByNom(String service);
}
