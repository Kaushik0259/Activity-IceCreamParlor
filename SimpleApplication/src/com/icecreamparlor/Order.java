package com.icecreamparlor;

// IceCreamOrder.java
import java.util.ArrayList;
import java.util.List;

// The Order class represents an order for an ice cream
public class Order {
    // Private fields for ice cream, list of toppings, and serving style
    private IceCream iceCream;
    private List<Topping> toppings;
    private String servingStyle;

    // Constructor that initializes the order with a given ice cream
    public Order(IceCream iceCream) {
        this.iceCream = iceCream;
        toppings = new ArrayList<>(); // Initialize the toppings list
        servingStyle = "Cone"; // Default serving style is "Cone"
    }

    // Method to add a topping to the order
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    // Method to set the serving style for the order
    public void setServingStyle(String servingStyle) {
        this.servingStyle = servingStyle;
    }

    // Method to calculate the total cost of the order
    public double calculateTotal() {
        double total = iceCream.getPrice(); // Start with the price of the ice cream
        for (Topping topping : toppings) { // Add the price of each topping
            total += topping.getPrice();
        }
        return total; // Return the total cost
    }

    // Method to print the details of the order
    public void printOrderDetails() {
        System.out.println("Ice Cream: " + iceCream.getFlavor()); // Print the flavor of the ice cream
        System.out.println("Toppings:"); // Print the list of toppings
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getName());
        }
        System.out.println("Serving Style: " + servingStyle); // Print the serving style
        System.out.println("Total Amount: $" + calculateTotal()); // Print the total amount
    }
}
