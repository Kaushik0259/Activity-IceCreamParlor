package com.icecreamparlor;

//IceCreamOrder.java
import java.util.ArrayList;
import java.util.List;

public class Order {
 private IceCream iceCream;
 private List<Topping> toppings;
 private String servingStyle;

 public Order(IceCream iceCream) {
     this.iceCream = iceCream;
     toppings = new ArrayList<>();
     servingStyle = "Cone"; // Default serving style
 }

 public void addTopping(Topping topping) {
     toppings.add(topping);
 }

 public void setServingStyle(String servingStyle) {
     this.servingStyle = servingStyle;
 }

 public double calculateTotal() {
     double total = iceCream.getPrice();
     for (Topping topping : toppings) {
         total += topping.getPrice();
     }
     return total;
 }

 public void printOrderDetails() {
     System.out.println("Ice Cream: " + iceCream.getFlavor());
     System.out.println("Toppings:");
     for (Topping topping : toppings) {
         System.out.println("- " + topping.getName());
     }
     System.out.println("Serving Style: " + servingStyle);
     System.out.println("Total Amount: $" + calculateTotal());
 }
}
