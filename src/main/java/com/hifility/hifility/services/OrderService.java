package com.hifility.hifility.services;

import com.hifility.hifility.entities.Order;
import com.hifility.hifility.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService  implements IOrderService{
    @Autowired
    private OrderRepository repository;
    @Override
    public List<Order> getAll() {
        return (List<Order>) repository.findAll();
    }

   /** @Override
    public Optional<List> getOrderByClientId(String id) {
        return Optional.ofNullable(repository.getClientOrders(Long.valueOf(id)));
    }
    **/
}
