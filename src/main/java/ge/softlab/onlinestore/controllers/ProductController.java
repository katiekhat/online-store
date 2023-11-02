package ge.softlab.onlinestore.controllers;

import ge.softlab.onlinestore.entities.Product;
import ge.softlab.onlinestore.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("api/products/search")
    public List<Product> findProductsByNameOrEan(@RequestParam("search") String search) {
        return productService.findProductsByNameOrEan(search);
    }
    @GetMapping("products/{id}")
    public Product product(@PathVariable Integer id){
        return productService.getProduct(id);
    }

}


