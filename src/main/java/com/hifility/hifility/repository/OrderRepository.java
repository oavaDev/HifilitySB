package com.hifility.hifility.repository;

import com.hifility.hifility.entities.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends CrudRepository<Order, Long> {

    /**@Query("SELECT Client.Id, Client.name, Client.email, Order.orderId, Order.date, Product.name, ProductOrder.quantity " +
            "FROM Client " +
            "JOIN Order ON Client.Id = Order.clientId " +
            "JOIN ProductOrder ON Order.orderId = ProductOrder.orderId " +
            "JOIN Product ON ProductOrder.productId = Product.Id " +
            "WHERE Client.Id = :clientId")
    List<Object[]> getClientOrders(Long clientId);
     **/
}
