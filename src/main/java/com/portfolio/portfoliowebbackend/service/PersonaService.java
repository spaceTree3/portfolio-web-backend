package com.portfolio.portfoliowebbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfoliowebbackend.model.Persona;
import com.portfolio.portfoliowebbackend.repository.PersonaRepository;



@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getPersonas(){
        List<Persona> listaPersonas=personaRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona persona){
        personaRepository.save(persona);
    } 

    @Override
    public void deletePersona(int id){
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(int id){
        Persona persona=personaRepository.findById(id).orElse(null);
        return persona;
    }

}