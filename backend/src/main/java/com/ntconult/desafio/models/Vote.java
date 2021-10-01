package com.ntconult.desafio.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(VotePK.class)
@Entity
@Table(name = "tb_votes")
public class Vote implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	@ManyToOne
	@Id
	@JsonIgnoreProperties(value = "agendas")
	private Associate associate;
	
	@ManyToOne
	@Id
	@JsonIgnoreProperties(value = "associates")
	private Agenda agenda;
	
	@Column
	private Boolean vote;
	
	@Column(name = "vote_date")
	@CreationTimestamp
	private LocalDateTime voteDate;
}
