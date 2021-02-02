package de.neuefische.product_dependency;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("productDb")


public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public List<Product> listProducts() {
        return productService.listProducts();
    }


    @PutMapping
    public ArrayList<Product> addProduct (@RequestBody Product product) {
    return productService.addProduct(product);
    }


    /*@GetMapping
    public List<Product> listProduct(@RequestParam Optional<String> search) {
        return productDB.searchProduct(search.orElse(" "));

    }
    */
}
