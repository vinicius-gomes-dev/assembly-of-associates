package com.ntconult.desafio.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntconult.desafio.dto.vote.VoteResponseDTO;
import com.ntconult.desafio.models.Agenda;
import com.ntconult.desafio.models.Associate;
import com.ntconult.desafio.models.Vote;
import com.ntconult.desafio.models.VotePK;
import com.ntconult.desafio.repositories.AgendaRepository;
import com.ntconult.desafio.repositories.AssociateRepository;
import com.ntconult.desafio.repositories.VoteRepository;

@Service
public class VoteService {
	
	@Autowired
	private VoteRepository repository;
	@Autowired
	private AssociateRepository associateRepository;
	@Autowired
	private AgendaRepository agendaRepository;
	
	public List<VoteResponseDTO> findAll() {
		List<Vote> result;
		result = repository.findAll();
		
		List<VoteResponseDTO> resultDTO;
		resultDTO = result.stream().map(x -> new VoteResponseDTO(x)).collect(Collectors.toList());
		
		return resultDTO;
	}
	
	// TODO Refatorar e implementar
	public VoteResponseDTO findById(Long assocIdParam, Long agendIdParam) {
		
		Optional<Associate> assocIdOp = associateRepository.findById(assocIdParam);
		Associate assocID = assocIdOp.get();
		
		Optional<Agenda> agendIdOp = agendaRepository.findById(agendIdParam);
		Agenda agendID = agendIdOp.get();
		
		VotePK voteID = new VotePK(assocID, agendID); 
		
		Optional<Vote> result;
		result = repository.findById(voteID);
		
		VoteResponseDTO resultDTO;
		resultDTO = new VoteResponseDTO(result.get());

		
		return resultDTO;
	}
	
	public VoteResponseDTO register(Vote voteParam, Long assocIdParam, Long agendIdParam) {
		
		VoteResponseDTO resultDTO;
		resultDTO = new VoteResponseDTO(new Vote());
		
		
		return resultDTO;
	}

}
