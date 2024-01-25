package com.codegym.crud_databasse.model;

import jdk.internal.foreign.abi.Binding;

import javax.persistence.*;

@Entity
@Table(name = "cakes")
public class TrungCake {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String details;

    @Override
    public String toString() {
        return "TrungCake{" +
                "id=" + id +
                ", details='" + details + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public TrungCake(String details, String type, double price, boolean status) {
        this.details = details;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public TrungCake() {
    }

    private String type;
    private double price;
    private boolean status;
}
