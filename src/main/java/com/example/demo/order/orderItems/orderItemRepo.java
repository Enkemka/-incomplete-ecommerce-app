package com.example.demo.order.orderItems;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface orderItemRepo extends JpaRepository<OrderItem,Integer> {
    Optional<OrderItem> findOrderItemById(int id);
}
