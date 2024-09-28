package com.ust.TrainerApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.TrainerApplication.model.JobNotificationinfo;
import com.ust.TrainerApplication.repo.JobRepo;

@Service
public class JobNotificationService {
	@Autowired
	private JobRepo repo;
	
	public JobNotificationinfo addjobnotification(JobNotificationinfo jobnotificationinfo) {
		// TODO Auto-generated method stub
		return repo.save(jobnotificationinfo);
	}
	

}
