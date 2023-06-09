package com.hifility.hifility.services;

import com.hifility.hifility.entities.Order;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    List<Order> getAll();
    Optional<Order> getOrderById(String id);

    //List<Object[]> getOrderByClientId(String id);
    Optional<List> getOrderDetailsById(String id);
}
