package com.portfolio.portfoliowebbackend;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 

/**

 * Clase que habilita CORS

 * @author YOProgramo

 */

@EnableWebMvc

@Configuration

@CrossOrigin(origins = "*")

public class WebConfig implements WebMvcConfigurer {

    @Override

    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
        .allowedOrigins("*")
        // .allowedOriginPatterns("")
        .allowCredentials(false)
        .allowedHeaders("*")
        .exposedHeaders("*")
        .maxAge(60 *30)
        .allowedMethods("*")
        ;
    }
}