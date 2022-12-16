package com.portfolio.portfoliowebbackend.repository;

import org.springframework.stereotype.Repository;

import com.portfolio.portfoliowebbackend.model.Certificado;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CertificadoRepository extends JpaRepository<Certificado,Integer> {
    
}
