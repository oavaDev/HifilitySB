package com.hifility.hifility.repository;

import com.hifility.hifility.entities.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

   @Query("SELECT c.name AS client_name, o.orderId, o.date, p.name AS product_name, po.quantity\n" +
           "FROM Client c\n" +
           "JOIN Order o ON c.Id = o.clientId\n" +
           "JOIN ProductOrder po ON o.orderId = po.orderId\n" +
           "JOIN Product p ON po.productId = p.Id\n" +
           "WHERE c.Id = :clientId")
   List<Object[]> getOrderDetailsById(Long clientId);

   /**@Query(
           value = "SELECT * FROM Order where clientId = :clientId;",
           nativeQuery = true)
   List<Object[]> getOrderByClientId(Long clientId);
   **/
   }
