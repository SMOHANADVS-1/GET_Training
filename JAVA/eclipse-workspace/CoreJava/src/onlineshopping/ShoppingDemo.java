package onlineshopping;

/**
 * Author  :Sola.Sri
 * Date    :Sep 6, 2025
 * Time    :12:04:54 PM  
 * project :CoreJava
*/

/*
Shopping System with:

Abstract Class (Product) → base for all products.

Concrete Products (Laptop, Mobile) extending Product.

Interfaces (OnlinePayment, Discount) → for payment & discount behaviors.

ShoppingCart → manages multiple products, applies discounts, and makes payments.
*/
// Main Class
public class ShoppingDemo {
    public static void main(String[] args) {
        // Customer's Shopping Cart
        ShoppingCart cart = new ShoppingCart("Rohit");

        // Adding Products
        cart.addProduct(new Laptop("Dell XPS 15", 85000));
        cart.addProduct(new Mobile("iPhone 15", 120000));

        // Show cart
        cart.showCartDetails();

        // Apply discount
        double finalAmount = cart.applyDiscount(cart.getTotalAmount());

        // Make payment
        cart.payOnline(finalAmount);
        
        System.out.println("************************************************");
        
        //Another Customers shopping Cart
        ShoppingCart cart2 = new ShoppingCart("Mohana");
        cart2.addProduct(new Laptop("Samsung Galaxy S23", 70000));
        cart2.showCartDetails();
        double finalAmount2 = cart2.applyDiscount(cart2.getTotalAmount());
        cart2.payOnline(finalAmount2);

        System.out.println("************************************************"); 
      //Another Customers shopping Cart
        ShoppingCart cart3 = new ShoppingCart("Nikitha");
        cart3.addProduct(new Laptop("Samsung Galaxy I23", 190000));
        cart3.showCartDetails();
        double finalAmount3 = cart3.applyDiscount(cart3.getTotalAmount());
        cart3.payOnline(finalAmount3);

        
    }
}
