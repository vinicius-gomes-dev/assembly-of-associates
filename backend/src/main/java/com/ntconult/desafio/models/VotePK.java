package com.ntconult.desafio.models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VotePK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	protected Associate associate;
	protected Agenda agenda;
}
