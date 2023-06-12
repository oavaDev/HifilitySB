package com.hifility.hifility.services;

import com.hifility.hifility.entities.Client;
import com.hifility.hifility.entities.Order;
import com.hifility.hifility.repository.ClientRepository;
import com.hifility.hifility.repository.OrderRepository;
import jakarta.transaction.Transactional;
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
    private ClientRepository clientRepository;

    public OrderService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Order> getAll() {
        return (List<Order>) repository.findAll();
    }

    @Override
    public Order createOrder(String clientId, String status) {
        Long clientIdLong = Long.valueOf(clientId);
        java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        Order order = new Order();
        order.setClientId(clientIdLong);
        order.setStatus(Long.valueOf(status));
        order.setDate(String.valueOf(date));

        return repository.save(order);
    }

    @Override
    public Optional<Order> getOrderById(String id) {
        return repository.findById(Long.valueOf(id));
    }

    @Override
    public Optional<Order> findOrder(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<List> getOrdersByClientId(String id) {
        return Optional.ofNullable(repository.getOrdersByClientId(Long.valueOf(id)));
    }
    @Override
    public Optional<List> getOrderDetailsByOrderId(String clientId, String orderId) {
        return Optional.ofNullable(repository.getOrderDetailsByOrderId(Long.valueOf(clientId),Long.valueOf(orderId)));
    }

    @Override
    @Transactional
    public void updateOrderStatus(String clientId, String orderId, String status) {
        repository.updateOrderStatus(Long.valueOf(clientId), Long.valueOf(orderId), Long.valueOf(status));
    }


}
