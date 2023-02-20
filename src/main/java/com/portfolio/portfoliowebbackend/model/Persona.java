package com.portfolio.portfoliowebbackend.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String apellido;
    private double telefono;
    private String email; 
    private String usuario;
    private String password;
    
}
