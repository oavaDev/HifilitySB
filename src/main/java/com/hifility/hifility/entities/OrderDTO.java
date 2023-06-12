package com.hifility.hifility.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
public class OrderDTO {
    private Long orderId;
    private Long clientId;
    private String date;
    private Integer status;

}
