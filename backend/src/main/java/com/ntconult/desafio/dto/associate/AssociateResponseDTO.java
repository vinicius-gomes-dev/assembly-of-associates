package com.ntconult.desafio.dto.associate;

import com.ntconult.desafio.models.Associate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssociateResponseDTO {
	
	private String cpf;
	private String name;

	
	public AssociateResponseDTO(Associate entity) {
		cpf = entity.getCpf();
		name = entity.getName();
	}
}
