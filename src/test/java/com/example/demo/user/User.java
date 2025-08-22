package com.example.demo.user;

import com.example.demo.itemLog.item;

import java.util.List;

public class User {
    private String Id;
    private String userName;
    private String password;
    private String creationDate;
    private List<item> shoppingCart;

    public User(String Id, String userName, String password, String creationDate) {
        this.Id = Id;
        this.userName = userName;
        this.password = password;
        this.creationDate = creationDate;
    }


}
