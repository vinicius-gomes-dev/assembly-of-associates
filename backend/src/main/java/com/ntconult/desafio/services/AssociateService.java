package com.ntconult.desafio.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntconult.desafio.dto.associate.AssociateResponseDTO;
import com.ntconult.desafio.models.Associate;
import com.ntconult.desafio.repositories.AssociateRepository;

@Service
public class AssociateService {
	
	@Autowired
	private AssociateRepository repository;
	
	
	public List<AssociateResponseDTO> findAll() {
		List<Associate> result;
		result = repository.findAll();
		
		List<AssociateResponseDTO> resultDTO;
		resultDTO = result.stream().map(x -> new AssociateResponseDTO(x)).collect(Collectors.toList());
		
		return resultDTO;
	}
	
	public AssociateResponseDTO findById(Long id) {
		Optional<Associate> result;
		result= repository.findById(id);
		
		AssociateResponseDTO resultDTO;
		resultDTO = new AssociateResponseDTO(result.get());
		
		return resultDTO;
	}

}
