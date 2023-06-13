package com.hifility.hifility.repository;

import com.hifility.hifility.entities.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Long> {
    @Query(value = "select amount from credit where user_id  = 5",nativeQuery = true)
    BigDecimal findAmountByClientId(Long userId);
}
