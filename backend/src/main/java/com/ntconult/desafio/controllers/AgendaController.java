package com.ntconult.desafio.controllers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntconult.desafio.models.Agenda;
import com.ntconult.desafio.repositories.AgendaRepository;

@RestController
@RequestMapping("/agendas")
public class AgendaController {
	
	@Autowired
	private AgendaRepository agendaRepository;
	
	@GetMapping
	public List<Agenda> findAll() {
		List<Agenda> agendas = agendaRepository.findAll();
		return agendas;
	}
	
	@GetMapping("/{id}")
	public Optional<Agenda> findById(@PathVariable Long id) {
		Optional<Agenda> agenda = agendaRepository.findById(id);
		
		return agenda;
	}
	
	@PostMapping(path = "/register")
	public Agenda register(@RequestBody Agenda agenda) {
		long time = (agenda.getSessionTimeMinutes() > 0L) ? agenda.getSessionTimeMinutes() : 1L;
		agenda.setSessionTimeMinutes(time);
		LocalDateTime now = LocalDateTime.now();
		agenda.setStartOfSession(now);
		agenda.setEndOfSesion(now.plusMinutes(time));
		
		return agendaRepository.save(agenda);
	}
	

}
