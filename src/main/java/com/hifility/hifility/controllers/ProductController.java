package com.hifility.hifility.controllers;

import com.hifility.hifility.entities.Product;
import com.hifility.hifility.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private IProductService service;

    @GetMapping("/api/products")
    public List<Product> getAll(){
        return service.getAll();
    }
}
