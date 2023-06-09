package com.hifility.hifility.services;

import com.hifility.hifility.entities.Order;
import com.hifility.hifility.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@ComponentScan
public class OrderService  implements IOrderService{
    @Autowired
    private OrderRepository repository;
    @Override
    public List<Order> getAll() {
        return (List<Order>) repository.findAll();
    }

    public Optional<Order> getOrderById(String id) {
        return repository.findById(Long.valueOf(id));
    }

    /**@Override
    public List<Object[]> getOrderByClientId(String id) {
        return repository.getOrderByClientId(Long.valueOf(id));
    }
     **/
    public Optional<List> getOrderDetailsById(String id) {
        return Optional.ofNullable(repository.getOrderDetailsById(Long.valueOf(id)));
    }
}
