package com.example.demo.order;

import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class orderController {

    @Autowired
private orderService OrderService;




    @GetMapping("/getOrder/{id}")
    public ResponseEntity<?> getOrder(@PathVariable int Id){
        return ResponseEntity.ok(OrderService.getOrderById(Id));
    }

    @PostMapping("/NewOrder")
    public ResponseEntity<?>newOrder(@RequestBody Orders newOrder){
        return ResponseEntity.ok(OrderService.newOrder(newOrder));
    }

 /*   @DeleteMapping("/deleteOrder/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable int Id){
        return ResponseEntity.ok(orderService.deleteOrder(Id));
    }*/

}
