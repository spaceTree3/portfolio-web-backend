package com.portfolio.portfoliowebbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.portfolio.portfoliowebbackend.model.Certificado;
import com.portfolio.portfoliowebbackend.service.ICertificadoService;

@RestController
public class CertificadoController{

    @Autowired
    private ICertificadoService certificadoService;

    @GetMapping ("/certificados/traer")
    public List<Certificado> getCertificados(){
        return certificadoService.getCertificados();
    }

    @PostMapping ("/certificados/crear")
    public String createCertificado(@RequestBody Certificado certificado){
        certificadoService.saveCertificado(certificado);
        return "Certificacion agregada correctamente";
    }

    @DeleteMapping ("/certificados/borrar/{id}")
    public String deleteCertificado (@PathVariable int id){
        certificadoService.deleteCertificado(id);
        return "Certificacion eliminada correctamente";
    }

    @PutMapping(value="certificados/editar/{id}")
    public Certificado editCertificado(@PathVariable int id, 
                    @RequestParam ("descripcion") String nuevaDescripcion,
                    @RequestParam ("anio") String nuevoAnio,
                    @RequestParam ("titulo") String nuevoTitulo,
                    @RequestParam ("lugar") String nuevoLugar,
                    @RequestParam ("estado") String nuevoEstado){

        Certificado certificado = certificadoService.findCertificado(id);

        certificado.setDescripcion(nuevaDescripcion);
        certificado.setAnio(nuevoAnio);
        certificado.setTitulo(nuevoTitulo);
        certificado.setLugar(nuevoLugar);
        certificado.setEstado(nuevoEstado);

        certificadoService.saveCertificado(certificado);
        
        return certificado;
    }


}