package com.hifility.hifility.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor

@Getter
@Setter
public class OrderDetailsJoinDTO {
    private String clientName;
    private Long orderId;
    private String orderDate;
    private String orderStatus;
    private String productName;
    private int quantity;

}
