package com.portfolio.portfoliowebbackend.service;

import java.util.List;

import com.portfolio.portfoliowebbackend.model.Contacto;

public interface IContactoService {
        
    public List<Contacto> getContactos();   
    
    public void saveContacto(Contacto contacto);

    public void deleteContacto(int id);

    public Contacto findContacto(int id);
    
}
