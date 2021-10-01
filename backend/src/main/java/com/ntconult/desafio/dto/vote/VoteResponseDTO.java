package com.ntconult.desafio.dto.vote;

import com.ntconult.desafio.dto.agenda.AgendaResponseDTO;
import com.ntconult.desafio.dto.associate.AssociateResponseDTO;
import com.ntconult.desafio.models.Vote;
import com.ntconult.desafio.models.VotePK;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VoteResponseDTO {
	
	private AssociateResponseDTO associate;
	private AgendaResponseDTO agenda;

	private Boolean vote;
	
	public VoteResponseDTO(AssociateResponseDTO associate,AgendaResponseDTO agenda) {
		this.associate = associate;
		this.agenda = agenda;
	}

	
	public VoteResponseDTO(Vote entity) {
		associate = new AssociateResponseDTO(entity.getAssociate());
		agenda = new AgendaResponseDTO(entity.getAgenda());
		vote = entity.getVote();
	}


}
