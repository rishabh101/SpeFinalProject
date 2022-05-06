package com.example.urban.FinalProject.bean;

<<<<<<< HEAD
=======
import javax.persistence.Column;
>>>>>>> Backend commit
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SubServices {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String category;
	private String service;
<<<<<<< HEAD
=======
	@Column(unique=true)
>>>>>>> Backend commit
	private String subservice;
	private int cost;

}
