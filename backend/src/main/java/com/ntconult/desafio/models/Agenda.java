package com.ntconult.desafio.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
	
	@Column(name = "agenda_date")
	@CreationTimestamp
	private LocalDateTime agendaDate;
	
	// Duration in minutes
	@Column(name = "session_time_minutes", nullable = false)
	private long sessionTimeMinutes;
	
	@Column(name = "start_of_session")
	@CreationTimestamp
	private LocalDateTime startOfSession;
	
	@Column(name = "end_of_session")
	private LocalDateTime endOfSesion;
	
	@ManyToMany(mappedBy = "agendas", fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
	@JsonIgnore
	private List<Associate> associates = new ArrayList<>();
}
