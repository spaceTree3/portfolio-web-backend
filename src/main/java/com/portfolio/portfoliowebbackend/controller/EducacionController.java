package com.portfolio.portfoliowebbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.portfolio.portfoliowebbackend.model.Educacion;
import com.portfolio.portfoliowebbackend.service.IEducacionService;


@RestController
public class EducacionController{

    @Autowired
    private IEducacionService educacionService;

    @GetMapping ("/educacion/traer")
    public List<Educacion> getEducacion(){
        return educacionService.getEducacion();
    }

    @PostMapping ("/educacion/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        educacionService.saveEducacion(educacion);
        return "Educacion agregada correctamente";
    }

    @DeleteMapping ("/educacion/borrar/{id}")
    public String deleteEducacion (@PathVariable int id){
        educacionService.deleteEducacion(id);
        return "Educacion eliminada correctamente";
    }

    @PutMapping(value="educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable int id, 
                    @RequestParam ("institucion") String nuevaInstitucion,
                    @RequestParam ("anio") String nuevoAnio,
                    @RequestParam ("titulo") String nuevoTitulo,
                    @RequestParam ("lugar") String nuevoLugar,
                    @RequestParam ("estado") String nuevoEstado){
        Educacion educacion = educacionService.findEducacion(id);

        educacion.setInstitucion(nuevaInstitucion);
        educacion.setAnio(nuevoAnio);
        educacion.setTitulo(nuevoTitulo);
        educacion.setLugar(nuevoLugar);
        educacion.setEstado(nuevoEstado);

        educacionService.saveEducacion(educacion);
        
        return educacion;
    }




}