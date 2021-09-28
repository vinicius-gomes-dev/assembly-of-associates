package com.ntconult.desafio.models;

import java.io.Serializable;

import lombok.Data;

@Data
public class cPK implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	protected Associate associate;
	protected Agenda agenda;
	
	public cPK() {
	}

	public cPK(Associate associate, Agenda agenda) {
		this.associate = associate;
		this.agenda = agenda;
	}
	
	
	
	

}
