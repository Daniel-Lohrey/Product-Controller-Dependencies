package de.neuefische.product_dependency;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDB {


    private ArrayList<Order> orders = new ArrayList<>(List.of(
            new Order("1",new ArrayList<>(List.of(
                    new Product("22", "Tomato"),
                    new Product("11", "Melon"),
                    new Product("13", "Banana")
    )))));


    public Order add(Order order) {
        this.orders.add(order);
        return order;
    }

    public ArrayList<Order> getOrderList() {
        return orders;
    }
}
