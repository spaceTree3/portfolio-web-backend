package com.portfolio.portfoliowebbackend.repository;

import org.springframework.stereotype.Repository;

import com.portfolio.portfoliowebbackend.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Integer> {
    
}
