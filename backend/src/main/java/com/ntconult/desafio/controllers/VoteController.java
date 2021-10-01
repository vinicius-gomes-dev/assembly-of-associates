package com.ntconult.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ntconult.desafio.dto.vote.VoteResponseDTO;
import com.ntconult.desafio.models.Agenda;
import com.ntconult.desafio.models.Associate;
import com.ntconult.desafio.models.Vote;
import com.ntconult.desafio.services.VoteService;

@RestController
@RequestMapping("/votes")
public class VoteController {


	@Autowired
	private VoteService service;
	
	
	@GetMapping
	public ResponseEntity<List<VoteResponseDTO>> findAll() {
		List<VoteResponseDTO> voteResDTO;
		voteResDTO = service.findAll();
		
		return ResponseEntity.ok(voteResDTO);
	}
	
	@GetMapping(path = "/to-vote", params = { "assoc", "agend" })
	public ResponseEntity<VoteResponseDTO> findById(@RequestParam Long assoc,
													@RequestParam Long agend) {
		VoteResponseDTO voteResDTO;
		voteResDTO = service.findById(assoc, agend);
		
		
		return ResponseEntity.ok(voteResDTO);
	}
	

	// TODO Necessita refatorar e implementar
	@PostMapping(path = "/to-vote/register", headers = { "assocID", "agendID" })
	@ResponseStatus(value = HttpStatus.CREATED)
	public Vote register(@RequestBody(required = false) Vote voteParam,
													@RequestHeader Associate assocID,
													@RequestHeader Agenda agendID) {
		
		return voteParam;
	}
	


}
