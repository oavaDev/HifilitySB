package com.hifility.hifility.services;

import com.hifility.hifility.entities.Order;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    List<Order> getAll();

    Order createOrder(String clientId, String status);
    Optional<Order> getOrderById(String id);

    Optional<Order> findOrder(Long id);
    Optional<List> getOrdersByClientId(String id);
    Optional<List> getOrderDetailsByOrderId(String clientId,String orderId);
    void updateOrderStatus(String clientId, String orderId, String newStatus);

}
