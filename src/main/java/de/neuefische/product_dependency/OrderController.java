package de.neuefische.product_dependency;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("orderDb")


public class OrderController {
private final ProductDB productDb;

    private final ProductService productService = new ProductService(new ArrayList<Product>();


    public OrderController(ProductDB productDB) {
        this.productDB = productDB;
    }





}
