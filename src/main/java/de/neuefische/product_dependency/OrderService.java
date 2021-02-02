package de.neuefische.product_dependency;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService {

    private final OrderDB orderDB;

    public OrderService(OrderDB orderDB) {
        this.orderDB = orderDB;
    }

    public Order add(Order order) {
        return this.orderDB.add(order);
    }

    public ArrayList<Order> getOrderList() {
        return orderDB.getOrderList();
    }
}
