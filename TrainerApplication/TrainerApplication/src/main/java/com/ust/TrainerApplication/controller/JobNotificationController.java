package com.ust.TrainerApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.TrainerApplication.model.JobNotificationinfo;
import com.ust.TrainerApplication.service.JobNotificationService;

@RestController
@RequestMapping("/ust")
public class JobNotificationController {
	@Autowired
	private JobNotificationService Service;
	@PostMapping("/addjobnotification")
	public JobNotificationinfo addjobnotification(@RequestBody JobNotificationinfo jobnotificationinfo) {
		return Service.addjobnotification(jobnotificationinfo);
	}

}
