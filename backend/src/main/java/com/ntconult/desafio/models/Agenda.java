package com.ntconult.desafio.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_agendas")
public class Agenda implements Serializable {
	
	// Needed Serializable implementation to use the Composite Primary Key
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private Boolean vote;
	
	@Column(name = "is_closed", nullable = false)
	private Boolean isClosed;
	
	// Duration in minutes
	@Column(nullable = false)
	private Integer duration;
	
	@Column(name = "start_of_session", nullable = false)
	private LocalDateTime startOfSession;
	
	@Column(name = "end_of_session", nullable = false)
	private LocalDateTime endOfSesion;
	
	@ManyToOne
	@JoinColumn(name = "associate_id")
	@Id
	private Associate associate;

}
