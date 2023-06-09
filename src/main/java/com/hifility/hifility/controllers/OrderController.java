package com.hifility.hifility.controllers;

import com.hifility.hifility.entities.Order;
import com.hifility.hifility.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class OrderController {
    @Autowired
    private IOrderService service;
    @GetMapping("/api/orders")
    public List<Order> getAll (){
        return service.getAll();
    }

    @GetMapping("/api/orders/{id}")
    public Optional<Order> getOrderById (@PathVariable String id) {
        return service.getOrderById(id);
    }

   /** @GetMapping("/api/orders/client/{id}")
    public Optional<List> getOrdersByClientId(@PathVariable String id) {
        return Optional.ofNullable(service.getOrderByClientId(id));
    }
    **/
    @GetMapping("/api/orders/client/{id}")
    public Optional<List> getOrderDetailsByClientId(@PathVariable String id) {
        return service.getOrderDetailsById(id);
    }
}
