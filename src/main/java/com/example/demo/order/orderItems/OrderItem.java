package com.example.demo.order.orderItems;

import com.example.demo.Items.Items;
import jakarta.persistence.*;
import com.example.demo.order.Orders;


@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

    @ManyToOne
    @JoinColumn(name="Orders_id")
    private Orders orders;

    @ManyToOne
    @JoinColumn(name="item_id")
    private Items item;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Orders getOrder() {
        return orders;
    }

    public void setOrder(Orders orders) {
        this.orders = orders;
    }

}
