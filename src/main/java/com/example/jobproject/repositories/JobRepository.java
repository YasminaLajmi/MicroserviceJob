package com.example.jobproject.repositories;

import com.example.jobproject.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
    Job findJobByService(String service);
}
