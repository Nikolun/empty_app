package by.lunev.javamentoryoutube.controller;

import by.lunev.javamentoryoutube.entity.Product;
import by.lunev.javamentoryoutube.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


@GetMapping
    public List<Product> getAll(){
        return productRepository.findAll();
    }
}
