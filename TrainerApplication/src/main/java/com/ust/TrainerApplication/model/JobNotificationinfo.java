package com.ust.TrainerApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
@lombok.Data
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class JobNotificationinfo {
	@Id
	
	private int jobid;
	private String jobtitle;
	private String description;
	private String location;
	private int salary;

}
