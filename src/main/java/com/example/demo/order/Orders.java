package com.example.demo.order;

import com.example.demo.Users.User;
import jakarta.persistence.*;
import com.example.demo.order.orderItems.OrderItem;

import java.util.List;

@Entity
public class Orders {

    @Id
    @GeneratedValue
    private int id;


    //join col
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;


    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
    private List<OrderItem> OrderItems;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderItem> getOrderItems() {
        return OrderItems;
    }

    public void setOrderItems(List<OrderItem> OrderItems) {
        this.OrderItems = OrderItems;
    }

}


