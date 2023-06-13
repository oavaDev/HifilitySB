package com.hifility.hifility.repository;

import com.hifility.hifility.entities.ProductOrder;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Products_Order (orderId, productId, quantity)\n" +
            "VALUES (:orderId, :productId, :quantity)",nativeQuery = true)
    void createProductOrder(Long orderId, Long productId, Long quantity);
}
