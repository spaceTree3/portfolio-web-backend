package com.portfolio.portfoliowebbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfoliowebbackend.model.Contacto;
import com.portfolio.portfoliowebbackend.repository.ContactoRepository;

@Service
public class ContactoService implements IContactoService{

    @Autowired
    private ContactoRepository contactoRepository;


    @Override
    public List<Contacto> getContactos() {
        List<Contacto> contactos=contactoRepository.findAll(); 
        return contactos;
    }

    @Override
    public void saveContacto(Contacto contacto) {
        contactoRepository.save(contacto);
        
    }

    @Override
    public void deleteContacto(int id) {
        contactoRepository.deleteById(id);       
    }

    @Override
    public Contacto findContacto(int id) {
        Contacto contacto=contactoRepository.findById(id).orElse(null);
        return contacto;
    }
    
}
