package com.ntconult.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntconult.desafio.dto.associate.AssociateResponseDTO;
import com.ntconult.desafio.services.AssociateService;

@RestController
@RequestMapping("/associates")
public class AssociateController {
	
	
	@Autowired
	private AssociateService service;
	
	
	
	@GetMapping
	public ResponseEntity<List<AssociateResponseDTO>> findAll() {
		List<AssociateResponseDTO> associateResDTO;
		associateResDTO= service.findAll();
		
		return ResponseEntity.ok(associateResDTO);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<AssociateResponseDTO> findById(@PathVariable Long id) {
		AssociateResponseDTO associateResDTO;
		associateResDTO = service.findById(id);
		
		return ResponseEntity.ok(associateResDTO);
	}
}
