package com.ntconult.desafio.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntconult.desafio.dto.agenda.AgendaRequestDTO;
import com.ntconult.desafio.dto.agenda.AgendaResponseDTO;
import com.ntconult.desafio.models.Agenda;
import com.ntconult.desafio.repositories.AgendaRepository;

@Service
public class AgendaService {
	
	@Autowired
	private AgendaRepository repository;
	
	public List<AgendaResponseDTO> findAll() {
		List<Agenda> result;
		result = repository.findAll();

		List<AgendaResponseDTO> resultDTO;
		resultDTO = result.stream().map(x -> new AgendaResponseDTO(x)).collect(Collectors.toList());

		return resultDTO;
	}
	
	public AgendaResponseDTO findById(Long id) {
		Optional<Agenda> result;
		result = repository.findById(id);
		
		AgendaResponseDTO resultDTO;
		resultDTO = new AgendaResponseDTO(result.get());
		
		return resultDTO;
	}
	
	public AgendaResponseDTO register(AgendaRequestDTO agendaReqDTO) {
		
		long time = (agendaReqDTO.getSessionTimeMinutes() > 0L) ? agendaReqDTO.getSessionTimeMinutes() : 1L;
		agendaReqDTO.setSessionTimeMinutes(time);

		Agenda agendaParam;
		agendaParam = agendaReqDTO.toAgenda();

// Propositalmente comentado para avaliar o antes e o depois do meu pensar
//
//		LocalDateTime now = LocalDateTime.now();
//		agendaParam.setStartOfSession(now);
//		agendaParam.setEndOfSesion(now.plusMinutes(time));
		
		Agenda result;
		result = repository.save(agendaParam);
		
		agendaParam.setEndOfSesion(agendaParam.getStartOfSession().plusMinutes(time));
		result = repository.saveAndFlush(agendaParam);
		
		AgendaResponseDTO resultDTO;
		resultDTO = new AgendaResponseDTO(result);
		
		return resultDTO;

	}

}
