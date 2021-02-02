package de.neuefische.product_dependency;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProductService {

    private final ProductDB productDB;

    public ProductService(ProductDB productDB) {
        this.productDB = productDB;
    }

    public List<Product> listProducts() {
    return productDB.listProducts();
    }

    public ArrayList<Product> addProduct(Product product) {
        return productDB.addProduct(product);
    }
}
