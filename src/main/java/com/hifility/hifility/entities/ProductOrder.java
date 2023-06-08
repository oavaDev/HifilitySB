package com.hifility.hifility.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product_order")
@Getter
@Setter
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private Long orderId;

    @Column(name = "productId")
    private Long productId;

    @Column(name = "quantity")
    private String quantity;
}

