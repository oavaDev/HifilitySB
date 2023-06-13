package com.hifility.hifility.controllers;

import com.hifility.hifility.entities.Order;
import com.hifility.hifility.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
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

    @GetMapping("/api/orders/client/{id}")
    public Optional<List> getOrdersByClientId(@PathVariable String id) {
        return service.getOrdersByClientId(id);
    }
    @GetMapping("/api/orders/{clientId}/details/{orderId}")
    public Optional<List> getOrderDetailsByOrderId(@PathVariable String clientId, @PathVariable String orderId) {
        return Optional.ofNullable(Collections.singletonList(service.getOrderDetailsByOrderId(clientId,orderId)));
    }
    @PostMapping("/api/order/create")
    public Optional<Order> createOrder(@RequestBody Map<String,Object> requestBody){
            String clientId = (String) requestBody.get("clientId");
            String status = (String) requestBody.get("status");
            Order order = service.createOrder(clientId, status);
        return Optional.ofNullable(order);
    }
    @PutMapping("/api/order/status")
    public ResponseEntity<String> updateOrderStatus(@RequestBody Map<String, Object> requestBody) {
        try {
            String status = (String) requestBody.get("status");
            String clientId = (String) requestBody.get("clientId");
            String orderId = (String) requestBody.get("orderId");
            service.updateOrderStatus(clientId, orderId, status);
            return ResponseEntity.ok("Order status updated successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to update order status.");
        }
    }
}
