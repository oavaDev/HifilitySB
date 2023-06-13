package com.hifility.hifility.repository;

import com.hifility.hifility.entities.Order;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


   @Query("SELECT c.name AS client_name, o.orderId, o.date, o.status, p.name AS product_name, po.quantity\n" +
           "FROM Client c\n" +
           "JOIN Order o ON c.Id = o.clientId\n" +
           "JOIN ProductOrder po ON o.orderId = po.orderId\n" +
           "JOIN Product p ON po.productId = p.Id\n" +
           "WHERE c.Id = :clientId AND o.orderId = :orderId")
   List<Object[]> getOrderDetailsByOrderId(Long clientId,Long orderId);
   @Modifying
   @Transactional
   @Query(value = "INSERT INTO Products_Order (orderId, productId, quantity) VALUES (:orderId, :productId, :quantity)", nativeQuery = true)
   void createProductOrder(Long orderId, Long productId, int quantity);

   @Query("SELECT o FROM Order o where o.clientId = :clientId")
   List<Order> getOrdersByClientId(Long clientId);

   @Modifying
   @Query("UPDATE Order o SET o.status = :status WHERE o.clientId = :clientId AND o.orderId = :orderId")
   void updateOrderStatus(@Param("clientId") Long clientId, @Param("orderId") Long orderId, @Param("status") Long status);
   }
