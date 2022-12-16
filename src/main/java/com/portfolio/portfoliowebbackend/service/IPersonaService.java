package com.portfolio.portfoliowebbackend.service;

import java.util.List;

import com.portfolio.portfoliowebbackend.model.Persona;

public interface IPersonaService {

    public List<Persona> getPersonas();   
    
    public void savePersona(Persona persona);

    public void deletePersona(int id);

    public Persona findPersona(int id);
}