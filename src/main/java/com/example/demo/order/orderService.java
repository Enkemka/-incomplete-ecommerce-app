package com.example.demo.order;

import com.example.demo.Users.User;
import com.example.demo.order.orderItems.OrderItem;
import com.example.demo.order.orderItems.orderItemRepo;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class orderService {




    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private orderItemRepo orderItemRepo;



    public Orders getOrderById(int id){
        return (Orders) orderRepo.findById(id);
    }


    public List<Orders> getOrderHistory(User user) {

        return orderRepo.findOrdersByUser(user);


    }


    @Transactional
    public Orders newOrder(Orders newOrders) {

        Orders savedOrders = orderRepo.save(newOrders);

   List<OrderItem> OrderItems = newOrders.getOrderItems();

        for(OrderItem orderItem : OrderItems){

            orderItemRepo.save(orderItem);
        }


        return savedOrders;
    }









   /* //delete order
    @Transactional
    public void deleteOrder(int id) {

        orderItemRepo.deleteByOrder_Id(id);
         orderRepo.deleteById(id);
    }*/

    public List<Orders> getAllOrders(){
         return orderRepo.findAll();
     }



   /*  public List<Orders> getOrderByUserIdAsc(int userId){
        return orderRepo.findByUserIdOrdersByCreationDateAsc(userId);
     }

     public List<Orders> getOrderByUserIdDesc(int userId){
        return orderRepo.findByUserIdOrdersByCreationDateDesc(userId);
     }*/
}
