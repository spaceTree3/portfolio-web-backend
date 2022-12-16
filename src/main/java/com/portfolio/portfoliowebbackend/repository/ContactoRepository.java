package com.portfolio.portfoliowebbackend.repository;

import org.springframework.stereotype.Repository;
import com.portfolio.portfoliowebbackend.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ContactoRepository extends JpaRepository<Contacto,Integer> {
    
}
