package com.develhope.demo.controller;

import com.develhope.demo.entities.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*POST /products: Crea un nuovo prodotto.
GET /products: Restituisci tutti i prodotti.
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    List<Product> products = new ArrayList<>();

    @GetMapping
    public List<Product> listaProdotti() {
        return products;
    }

    @PostMapping
    public Product createProduct (@RequestBody Product product) {
        product.setId(products.size() +1);
        products.add(product);
        return product;

    }

}
