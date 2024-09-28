package cibertec.edu.pe.Cl1_Examen_Pregunta_12.controller;

import cibertec.edu.pe.Cl1_Examen_Pregunta_12.restproduct.placeholder.model.Product;
import cibertec.edu.pe.Cl1_Examen_Pregunta_12.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products/{id}")
    public Product obtenerProductoXid(
            @PathVariable("id") Long id){
        return productService.obtenerProductoXid(id);
    }

    @PostMapping("/products")
    public Product crearProducto(@RequestBody Product title){
        return productService.crearProducto(title);
    }

}
