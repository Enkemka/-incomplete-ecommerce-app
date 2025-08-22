package com.example.demo.order.orderItems;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderItem")
public class OrderItemsController {

    @Autowired
    private OrderItemService orderItemService;

    public OrderItem findOrderItemById(int id){
        return orderItemService.findOrderItemById(id);
    }
}
