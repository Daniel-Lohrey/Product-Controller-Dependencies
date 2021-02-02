package de.neuefische.product_dependency;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductDB {

    private ArrayList<Product> productDb = new ArrayList<>(List.of(
            new Product("22", "Tomato"),
            new Product("11", "Melon"),
            new Product("13", "Banana"))
    );

    public ArrayList<Product> listProducts() {
        return productDb;
    }

    public void setProducts(ArrayList<Product> products) {
        this.productDb = products;
    }


    public ArrayList<Product> addProduct(Product product) {
    productDb.add(product);
    return productDb;
    }



    /*public List<Product> searchProduct(String search) {

        List<Product> result = new ArrayList<>();
        for (Product product : productDb) {
            if (product.getName().contains(search)){
                result.add(product);
            }
        }
        return result;
   } */
}
