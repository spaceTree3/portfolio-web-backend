package com.portfolio.portfoliowebbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfoliowebbackend.model.Certificado;
import com.portfolio.portfoliowebbackend.repository.CertificadoRepository;

@Service
public class CertificadoService implements ICertificadoService{

    @Autowired
    private CertificadoRepository certificadoRepository;

    @Override
    public List<Certificado> getCertificados() {
        List<Certificado> certificados=certificadoRepository.findAll();
        return certificados;
    }

    @Override
    public void saveCertificado(Certificado certificado) {
        certificadoRepository.save(certificado);
        
    }

    @Override
    public void deleteCertificado(int id) {
        certificadoRepository.deleteById(id);        
    }

    @Override
    public Certificado findCertificado(int id) {
        Certificado certificado=certificadoRepository.findById(id).orElse(null);
        return certificado;
    }
    
}
