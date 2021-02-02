package de.neuefische.product_dependency;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("orderDb")


public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PutMapping
    public Order addOrder(@RequestBody Order order){
       return this.orderService.add(order);
    }

    @GetMapping
    public ArrayList<Order> getOrderList(){
        return orderService.getOrderList();
    }


}
