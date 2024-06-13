package com.icecreamparlor;

// IceCream.java
// The IceCream class represents an ice cream with a specific flavor and price
public class IceCream {
    // Private fields for the flavor and price of the ice cream
    private String flavor;
    private double price;

    // Constructor that initializes the ice cream with a given flavor and price
    public IceCream(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    // Method to get the flavor of the ice cream
    public String getFlavor() {
        return flavor;
    }

    // Method to get the price of the ice cream
    public double getPrice() {
        return price;
    }
}
