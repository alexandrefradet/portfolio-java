package com.alexandrefradet.resume.model;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private LocalDate createdAt;
	
	private LocalDate modifiedAt;
}