package com.example.atividade01.model;

/**
 * Product
 */
public class Product {

    private Integer code;
    private String name;
    private double value;
    private int stock;

    public Product(Integer code, String name, double value, int stock) {
        this.code = code;
        this.name = name;
        this.value = value;
        this.stock = stock;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    
}