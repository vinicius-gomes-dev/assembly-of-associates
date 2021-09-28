package com.ntconult.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntconult.desafio.models.VotingSession;

public interface VotingSessionRepository extends JpaRepository<VotingSession, Long> {

}
