package com.portfolio.portfoliowebbackend.model;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String institucion;
    private String anio;
    private String titulo;
    private String lugar;
    private String estado; 
    
}