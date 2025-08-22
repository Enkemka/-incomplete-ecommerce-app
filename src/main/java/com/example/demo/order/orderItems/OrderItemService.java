package com.example.demo.order.orderItems;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {
    @Autowired
    private orderItemRepo orderItemRepo;

    public OrderItem findOrderItemById(int id){
        return orderItemRepo.findOrderItemById(id)
                .orElseThrow(()->new EntityNotFoundException("order item not found"));

    }

}
