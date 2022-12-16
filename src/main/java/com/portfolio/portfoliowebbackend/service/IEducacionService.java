package com.portfolio.portfoliowebbackend.service;

import java.util.List;

import com.portfolio.portfoliowebbackend.model.Educacion;

public interface IEducacionService {
        
    public List<Educacion> getEducacion();   
    
    public void saveEducacion(Educacion educacion);

    public void deleteEducacion(int id);

    public Educacion findEducacion(int id);

}
