package com.hifility.hifility.services;

import com.hifility.hifility.entities.ProductOrder;

public interface IProductOrderService {
     void createProductOrder(Long orderId, Long productId, Long quantity) throws Exception;
}
