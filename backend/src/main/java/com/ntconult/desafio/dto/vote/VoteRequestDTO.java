package com.ntconult.desafio.dto.vote;

import com.ntconult.desafio.models.Agenda;
import com.ntconult.desafio.models.Associate;
import com.ntconult.desafio.models.Vote;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VoteRequestDTO {
	
	private Associate associate;
	private Agenda agenda;
	private Boolean vote;
	
	
	public Vote toVote() {
		
		Vote result = new Vote(associate, agenda, vote, null);
		
		return result;
	}
}
