package com.ntconult.desafio.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
//@IdClass(cPK.class)
@Entity
@Table(name = "tb_voting_sessions")
public class VotingSession {
	
	
//	@Id
//	@ManyToOne
//	@JoinColumn(name = "associate_id")
//	private Associate associate;
//	
//	@Id
//	@ManyToOne
//	@JoinColumn(name = "agenda_id")
//	private Agenda agenda;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Boolean vote;
	
	@Column(name = "vote_date")
	@CreationTimestamp
	private LocalDateTime voteDate;

}
