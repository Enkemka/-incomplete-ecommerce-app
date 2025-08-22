/*
package com.example.demo.cart;

import com.example.demo.Users.User;
import com.example.demo.cart.cartItems.cartItem;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class cart {

    @Id
    @GeneratedValue
    private int id;


    //join col
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

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

    public List<cartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<cartItem> cartItems) {
        this.cartItems = cartItems;
    }

    @OneToMany
    private List<cartItem> cartItems;
}
*/
