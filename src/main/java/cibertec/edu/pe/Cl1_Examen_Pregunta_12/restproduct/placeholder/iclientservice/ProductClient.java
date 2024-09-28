package cibertec.edu.pe.Cl1_Examen_Pregunta_12.restproduct.placeholder.iclientservice;

import cibertec.edu.pe.Cl1_Examen_Pregunta_12.restproduct.placeholder.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "userClient",
              url = "https://fakestoreapi.com")
public interface ProductClient {

    @GetMapping("/products/{id}")
    Product obtenerProductoXid(
            @PathVariable("id") Long id,
            @RequestHeader("Authorization") String token);

    @PostMapping("/products")
    Product crearProducto(@RequestBody Product title,
                          @RequestHeader("Authorization") String token);


}
