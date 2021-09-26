package com.ntconult.desafio.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private Boolean vote;
	
	@Column(nullable = false)
	private Boolean isClosed;
	
	@Column(nullable = false)
	private LocalDateTime startOfSession;
	
	@Column(nullable = false)
	private LocalDateTime endOfSesion;
	
	@ManyToOne
	private Associate associate;

}
