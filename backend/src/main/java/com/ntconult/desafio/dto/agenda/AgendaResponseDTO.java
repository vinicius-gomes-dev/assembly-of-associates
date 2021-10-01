package com.ntconult.desafio.dto.agenda;

import java.time.LocalDateTime;

import com.ntconult.desafio.models.Agenda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgendaResponseDTO {
	
	private String description;
	private LocalDateTime agendaDate;
	private long sessionTimeMinutes;
	private LocalDateTime startOfSession;
	private LocalDateTime endOfSesion;
	
	
	public AgendaResponseDTO(Agenda entity) {
		description = entity.getDescription();
		agendaDate = entity.getAgendaDate();
		sessionTimeMinutes = entity.getSessionTimeMinutes();
		startOfSession = entity.getStartOfSession();
		endOfSesion = entity.getEndOfSesion();
	}
	
}
