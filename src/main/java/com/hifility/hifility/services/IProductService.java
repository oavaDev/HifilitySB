package com.hifility.hifility.services;

import com.hifility.hifility.entities.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    Product getById(Long id);

}
