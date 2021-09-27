package com.ntconult.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntconult.desafio.models.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
