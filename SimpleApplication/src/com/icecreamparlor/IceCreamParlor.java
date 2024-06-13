package com.icecreamparlor;

//IceCreamParlor.java
import java.util.Scanner;

public class IceCreamParlor {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Create Ice Cream options
     IceCream chocolate = new IceCream("Chocolate", 100);
     IceCream vanilla = new IceCream("Vanilla", 70);

     // Create Topping options
     Topping nuts = new Topping("Nuts", 50);
     Topping sprinkles = new Topping("Sprinkles", 80);

     // Display Ice Cream options
     System.out.println("Welcome to the Ice Cream Parlor!");
     System.out.println("Choose your Ice Cream:");
     System.out.println("1. Chocolate - $100");
     System.out.println("2. Vanilla - $70");
     System.out.print("Enter your choice: ");
     int iceCreamChoice = scanner.nextInt();

     IceCream selectedIceCream;
     if (iceCreamChoice == 1) {
         selectedIceCream = chocolate;
     } else {
         selectedIceCream = vanilla;
     }

     // Create Ice Cream Order
     Order order = new Order(selectedIceCream);

     // Ask for toppings
     System.out.println("Do you want extra toppings?");
     System.out.println("1. Nuts - $50");
     System.out.println("2. Sprinkles - $80");
     System.out.println("3. None");
     System.out.print("Enter your choice (comma separated for multiple toppings, 3 for none): ");
     String toppingsChoice = scanner.next();

     if (!toppingsChoice.equals("3")) {
         String[] selectedToppings = toppingsChoice.split(",");
         for (String topping : selectedToppings) {
             switch (topping.trim()) {
                 case "1":
                     order.addTopping(nuts);
                     break;
                 case "2":
                     order.addTopping(sprinkles);
                     break;
                 default:
                     System.out.println("Invalid topping choice");
                     break;
             }
         }
     }

     // Ask for serving style
     System.out.println("Do you want it in a Cone or Scoop?");
     System.out.print("Enter your choice: ");
     String servingStyle = scanner.next();
     order.setServingStyle(servingStyle);

     // Display order details
     System.out.println("Your order details:");
     order.printOrderDetails();

     scanner.close();
 }
}
