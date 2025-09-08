package onlineshopping;

/**
 * Author  :Sola.Sri
 * Date    :Sep 6, 2025
 * Time    :12:01:15 PM  
 * project :CoreJava
*/

import java.util.ArrayList;
import java.util.List;

// Abstract Class - Product
abstract class Product {
    String productName;
    double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public abstract void showProductDetails();
}
