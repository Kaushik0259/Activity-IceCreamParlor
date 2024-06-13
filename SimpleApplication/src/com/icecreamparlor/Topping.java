package com.icecreamparlor;

// Topping.java
// The Topping class represents a topping that can be added to an ice cream order
public class Topping {
    // Private fields for the name and price of the topping
    private String name;
    private double price;

    // Constructor that initializes the topping with a given name and price
    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to get the name of the topping
    public String getName() {
        return name;
    }

    // Method to get the price of the topping
    public double getPrice() {
        return price;
    }
}
