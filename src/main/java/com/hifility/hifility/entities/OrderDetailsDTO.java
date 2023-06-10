package com.hifility.hifility.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderDetailsDTO {
    private String clientName;
    private Long orderId;
    private String orderDate;
    private String orderStatus;
    private String productName;
    private int quantity;


    public OrderDetailsDTO(String clientName, Long orderId, String orderDate, String orderStatus, String productName, int quantity) {
        this.clientName = clientName;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.productName = productName;
        this.quantity = quantity;
    }

    public OrderDetailsDTO() {

    }
}
