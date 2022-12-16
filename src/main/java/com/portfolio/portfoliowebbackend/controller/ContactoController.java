package com.portfolio.portfoliowebbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.portfolio.portfoliowebbackend.model.Contacto;
import com.portfolio.portfoliowebbackend.service.IContactoService;

@RestController
public class ContactoController {
    @Autowired
    private IContactoService contactoService;

    @GetMapping ("/contacto/traer")
    public List<Contacto> getContactos(){
        return contactoService.getContactos();
    }

    @PostMapping ("/contacto/crear")
    public String createContacto(@RequestBody Contacto contacto){
        contactoService.saveContacto(contacto);
        return "Contacto agregado correctamente";
    }

    @DeleteMapping ("/contacto/borrar/{id}")
    public String deleteContacto (@PathVariable int id){
        contactoService.deleteContacto(id);
        return "Contacto eliminado correctamente";
    }

    @PutMapping(value="contacto/editar/{id}")
    public Contacto editContacto(@PathVariable int id, 
                    @RequestParam ("nombre") String nuevoNombre,
                    @RequestParam ("apellido") String nuevoApellido,
                    @RequestParam ("email") String nuevoEmail){
        Contacto contacto = contactoService.findContacto(id);

        contacto.setNombre(nuevoNombre);
        contacto.setApellido(nuevoApellido);
        contacto.setEmail(nuevoEmail);

        contactoService.saveContacto(contacto);
        
        return contacto;
    }

}
