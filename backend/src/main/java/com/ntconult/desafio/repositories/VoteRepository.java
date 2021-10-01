package com.ntconult.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntconult.desafio.models.Vote;
import com.ntconult.desafio.models.VotePK;

public interface VoteRepository extends JpaRepository<Vote, VotePK> {
	
	
}
