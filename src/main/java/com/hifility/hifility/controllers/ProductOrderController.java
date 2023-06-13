package com.hifility.hifility.controllers;

import com.hifility.hifility.entities.ProductOrder;
import com.hifility.hifility.services.IProductOrderService;
import com.hifility.hifility.services.IProductService;
import com.hifility.hifility.services.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProductOrderController {

    @Autowired
    private IProductOrderService service;

    @PostMapping("/api/productOrder/create")
    public void createProductOrder(@RequestBody Map<String, Object> requestBody) throws Exception {
        Long orderId = Long.valueOf(requestBody.get("orderId").toString());
        Long productId = Long.valueOf(requestBody.get("productId").toString());
        Long quantity = Long.valueOf(requestBody.get("quantity").toString());
        service.createProductOrder(orderId, productId, quantity);
    }
}
