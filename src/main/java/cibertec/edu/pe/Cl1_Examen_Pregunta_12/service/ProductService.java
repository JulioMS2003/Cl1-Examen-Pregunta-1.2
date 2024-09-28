package cibertec.edu.pe.Cl1_Examen_Pregunta_12.service;

import cibertec.edu.pe.Cl1_Examen_Pregunta_12.restproduct.placeholder.iclientservice.ProductClient;
import cibertec.edu.pe.Cl1_Examen_Pregunta_12.restproduct.placeholder.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductClient productClient;

    public Product obtenerProductoXid(Long id){
        return productClient.obtenerProductoXid(id,
                "Bearer aqui_token");
    }

    public Product crearProducto(Product title){
        return productClient.crearProducto(title,
                "Bearer aqui_token");
    }
}
