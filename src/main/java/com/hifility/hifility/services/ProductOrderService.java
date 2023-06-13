package com.hifility.hifility.services;

import com.hifility.hifility.entities.ProductOrder;
import com.hifility.hifility.repository.ProductOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductOrderService implements IProductOrderService{

    private ProductOrderRepository repository;

    public ProductOrderService(ProductOrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createProductOrder(Long orderId, Long productId, Long quantity) throws Exception {
        /*ProductOrder newProductOrder = new ProductOrder();
        if(orderId != null && productId != null && quantity > 0){
            newProductOrder.setOrderId(orderId);
            newProductOrder.setProductId(productId);
            newProductOrder.setQuantity(quantity);
            return repository.save(newProductOrder);
        }else{
            throw new Exception("Los campos deben estar llenos");
        }*/
        repository.createProductOrder(orderId,productId,quantity);
    }
}
