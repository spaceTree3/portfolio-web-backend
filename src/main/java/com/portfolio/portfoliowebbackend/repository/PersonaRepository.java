package com.portfolio.portfoliowebbackend.repository;

import org.springframework.stereotype.Repository;
import com.portfolio.portfoliowebbackend.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona,Integer> {
    
}
