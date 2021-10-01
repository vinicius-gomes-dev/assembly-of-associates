package com.ntconult.desafio.dto.agenda;

import com.ntconult.desafio.models.Agenda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgendaRequestDTO {
	
	private String description;
	private long sessionTimeMinutes;
	
	
	public Agenda toAgenda() {
		Agenda agenda = new Agenda(null, description, null, sessionTimeMinutes, null, null, null);
						
		return agenda;
	}


}

//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//private Long id;
//
//@Column(nullable = false)
//private String description;
//
//@Column(name = "agenda_date")
//@CreationTimestamp
//private LocalDateTime agendaDate;
//
//// Duration in minutes
//@Column(name = "session_time_minutes", nullable = false)
//private long sessionTimeMinutes;
//
//@Column(name = "start_of_session")
//private LocalDateTime startOfSession;
//
//@Column(name = "end_of_session")
//private LocalDateTime endOfSesion;
