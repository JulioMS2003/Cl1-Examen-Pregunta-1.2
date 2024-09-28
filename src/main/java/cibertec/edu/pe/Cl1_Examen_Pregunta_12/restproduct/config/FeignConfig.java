package cibertec.edu.pe.Cl1_Examen_Pregunta_12.restproduct.config;

import cibertec.edu.pe.Cl1_Examen_Pregunta_12.restproduct.errorhandler.CustomErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public ErrorDecoder errorDecoder(){
        return new CustomErrorDecoder();
    }

}
