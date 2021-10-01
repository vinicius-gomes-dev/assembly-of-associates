package com.ntconult.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ntconult.desafio.dto.agenda.AgendaRequestDTO;
import com.ntconult.desafio.dto.agenda.AgendaResponseDTO;
import com.ntconult.desafio.services.AgendaService;

@RestController
@RequestMapping("/agendas")
public class AgendaController {
	
	@Autowired
	private AgendaService service;
	
	
	
	@GetMapping
	public ResponseEntity<List<AgendaResponseDTO>> findAll() {
		List<AgendaResponseDTO> agendaResDTO;
		agendaResDTO= service.findAll();
		
		return ResponseEntity.ok(agendaResDTO);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<AgendaResponseDTO> findById(@PathVariable Long id) {
		AgendaResponseDTO agendaResDTO;
		agendaResDTO= service.findById(id);
		
		return ResponseEntity.ok(agendaResDTO);
	}
	
	@PostMapping(path = "/register")
	@ResponseStatus(value = HttpStatus.CREATED)
	public ResponseEntity<AgendaResponseDTO> register(@RequestBody AgendaRequestDTO agendaReqDTO) {
		AgendaResponseDTO agendaResDTO;
		agendaResDTO = service.register(agendaReqDTO);
		
		return ResponseEntity.ok(agendaResDTO);
		
	}
	
	
	
//	@Autowired
//	private AgendaRepository agendaRepository;
//	
//	@Autowired
//	private AssociateRepository associateRepository;
//	
//	@Autowired
//	private VoteRepository voteRepository;
//	
//	@GetMapping
//	public List<Agenda> findAll() {
//		List<Agenda> agendas = agendaRepository.findAll();
//		
//		return agendas;
//	}
//	
//	@GetMapping(path = "/{id}")
//	public Optional<Agenda> findById(@PathVariable Long id) {
//		Optional<Agenda> agenda = agendaRepository.findById(id);
//		
//		return agenda;
//	}
//	
//	@PostMapping(path = "/register")
//	@ResponseStatus(value = HttpStatus.CREATED)
//	public Agenda register(@RequestBody Agenda agendaParam) {
//		
//		long time = (agendaParam.getSessionTimeMinutes() > 0L) ? agendaParam.getSessionTimeMinutes() : 1L;
//		agendaParam.setSessionTimeMinutes(time);
//		LocalDateTime now = LocalDateTime.now();
//		agendaParam.setStartOfSession(now);
//		agendaParam.setEndOfSesion(now.plusMinutes(time));
//		
//		Agenda agenda = agendaRepository.save(agendaParam);
//		
//		return agenda;
//	}

//	
//	@PostMapping(path = "/{id}/vote")
//	public Vote vote(@PathVariable Long id, @RequestBody Vote voteParam) {
//		Agenda agenda = agendaRepository.getById(id);
//		voteParam.setAgenda(agenda);
//		
//		Associate associate = associateRepository.getById(1L);
//		voteParam.setAssociate(associate);
//		
//		Vote vote = voteRepository.save(voteParam);
//		
//		return vote;
//	}
//	
//	@GetMapping(path = "/votes")
//	public List<Vote> findAllVotes() {
//		List<Vote> votes = voteRepository.findAll();
//		
//		return votes;
//	}
	

}
