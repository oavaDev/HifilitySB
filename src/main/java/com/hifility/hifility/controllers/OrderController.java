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
    /**@GetMapping("/api/orders/{id}")
   public Optional<List> getOrderByClientId(@PathVariable String id) {
        return service.getOrderByClientId(id);
    }
**/


}
