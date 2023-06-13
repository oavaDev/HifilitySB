package com.hifility.hifility.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetailsDTO {
    private String clientName;
    private Long orderId;
    private String date;
    private Long status;
    private String productName;
    private int quantity;
}
