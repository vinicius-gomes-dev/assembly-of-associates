package com.ntconult.desafio.dto.associate;

import com.ntconult.desafio.models.Associate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssociateRequestDTO {
	
	private String cpf;
	private String name;
	
	public Associate toAssociate() {
		Associate associate = new Associate(null, cpf, name, null);
		
		return associate;
	}

}
