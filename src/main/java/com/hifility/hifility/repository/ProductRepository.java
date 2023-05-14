package com.hifility.hifility.repository;

import com.hifility.hifility.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
