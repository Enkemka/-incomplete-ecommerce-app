package com.example.demo.Users;


import jakarta.persistence.*;
import com.example.demo.order.Orders;


import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "user")
public class User {

    //annotation to map to mysql primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //annotation to map by exact column name
    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "creation_date")
    private String creationDate;

    @Column(name = "email")
    private String email;
/*
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="cart_id")
    // This creates a 'cart_id' foreign key column in the 'users'
    // table that references 'cart'
    // table's primary key
    //owning side or whichever side is 'many' has forgien key column
    private userService.Cart mycart;

*/


  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Orders> myOrders= new ArrayList<>();



    @Enumerated(EnumType.STRING)
    private Role role;


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User( String userName, String password, String creationDate, String email, Role role) {

        this.userName = userName;
        this.password = password;
        this.creationDate = creationDate;
        this.email = email;
        this.role = role;
    }



    public User() {

    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

/*    public List<Orders> getMyOrder() {
        return myOrders;
    }

    public void setMyOrder(List<Orders> myOrders) {
        this.myOrders = myOrders;
    }*/

}
