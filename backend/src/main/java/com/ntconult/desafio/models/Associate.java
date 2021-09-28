package com.ntconult.desafio.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_associates")
public class Associate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String cpf;
	
	@Column(nullable = false)
	private String name;
	
	@ManyToMany
	@JoinTable(name = "tb_voting_sessions",
				joinColumns = @JoinColumn(name = "associate_id"),
				inverseJoinColumns = @JoinColumn(name = "agenda_id"))
	private List<Agenda> agendas = new ArrayList<>();
}
