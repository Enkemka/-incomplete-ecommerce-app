package com.example.demo.Items;

import jakarta.persistence.*;

@Entity
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name="quantity_on_hand")
    private int quantity;

    private String name;

    private double price;

    private String description;

    @Column(name = "creation_date" )
    private String creationDate;

    public Items( String name, String description, int quantity, double price, String creationDate) {

        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.creationDate = creationDate;
    }
    public Items() {
        this.Id = 0;
        this.name = null;
        this.description = null;
        this.quantity = 0;
        this.price = 0.0;
        this.creationDate = null;
    }




    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
