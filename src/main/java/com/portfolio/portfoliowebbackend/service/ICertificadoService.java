package com.portfolio.portfoliowebbackend.service;

import java.util.List;

import com.portfolio.portfoliowebbackend.model.Certificado;

public interface ICertificadoService {
        
    public List<Certificado> getCertificados();   
    
    public void saveCertificado(Certificado certificado);

    public void deleteCertificado(int id);

    public Certificado findCertificado(int id);

    
}
