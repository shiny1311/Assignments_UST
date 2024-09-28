package com.ust.TrainerApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.TrainerApplication.model.JobNotificationinfo;

@Repository
public interface JobRepo extends JpaRepository<JobNotificationinfo, Integer>{

}
