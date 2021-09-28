package com.ntconult.desafio.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_agendas")
public class Agenda implements Serializable {
	
	// Needed Serializable implementation to use the Composite Primary Key
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String description;
	
	// Duration in minutes
	@Column(name = "session_time_minutes", nullable = false)
	private long sessionTimeMinutes;
	
	@Column(name = "start_of_session")
	private LocalDateTime startOfSession;
	
	@Column(name = "end_of_session")
	private LocalDateTime endOfSesion;
	
	
}
