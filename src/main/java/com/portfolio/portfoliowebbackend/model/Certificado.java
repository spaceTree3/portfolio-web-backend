package com.portfolio.portfoliowebbackend.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Certificado {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String descripcion;
    private String titulo;
    private String anio;
    private String lugar;
    private String estado; 
    
}