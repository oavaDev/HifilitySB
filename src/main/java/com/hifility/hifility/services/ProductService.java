package com.hifility.hifility.services;

import com.hifility.hifility.entities.Product;
import com.hifility.hifility.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private ProductRepository repository;
    @Override
    public List<Product> getAll() {
        return (List<Product>) repository.findAll();
    }
    @Override
    public Product getById(Long id) {
        return (Product) repository.findById(id).get();
    }
}
