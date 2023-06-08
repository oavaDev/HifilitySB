package com.hifility.hifility.services;

import com.hifility.hifility.entities.Order;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    List<Order> getAll();

    //Optional<List> getOrderByClientId(String id);

}
