package com.portfolio.portfoliowebbackend.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.portfolio.portfoliowebbackend.model.Persona;
import com.portfolio.portfoliowebbackend.service.IPersonaService;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService interPersona;


    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }

    @PostMapping ("/personas/crear")
    public String createPersona(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona (@PathVariable int id){
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

    @PutMapping(value="personas/editar/{id}")
    public Persona editPersona(@PathVariable int id, 
                    @RequestParam ("nombre") String nuevoNombre,
                    @RequestParam ("apellido") String nuevoApellido,
                    @RequestParam ("telefono") double nuevoTelefono,
                    @RequestParam ("email") String nuevoEmail){
        Persona perso= interPersona.findPersona(id);

        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setTelefono(nuevoTelefono);
        perso.setEmail(nuevoEmail);

        interPersona.savePersona(perso);
        
        return perso;
        /*Optional puede ser una opcion.
         *          @RequestParam ("nombre") Optional<String> nuevoNombre,
                    @RequestParam ("apellido") Optional <String> nuevoApellido,
                    @RequestParam ("telefono") Optional <Double> nuevoTelefono,
                    @RequestParam ("email") Optional <String> nuevoEmail){
         */
    }

}