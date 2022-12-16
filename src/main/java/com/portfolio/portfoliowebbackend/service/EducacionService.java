package com.portfolio.portfoliowebbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfoliowebbackend.model.Educacion;
import com.portfolio.portfoliowebbackend.repository.EducacionRepository;

@Service
public class EducacionService implements IEducacionService{

    @Autowired
    private EducacionRepository educacionRepository;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion=educacionRepository.findAll();
        return educacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        educacionRepository.save(educacion);
        
    }

    @Override
    public void deleteEducacion(int id) {
        educacionRepository.deleteById(id);       
    }

    @Override
    public Educacion findEducacion(int id) {
        Educacion educacion=educacionRepository.findById(id).orElse(null);
        return educacion;
    }
}
