package com.muwaffaq.innopolis.solid.SRP.correct;

import java.util.List;


public class Cart {

    List<Product> products;
    Price total;
    String token;

    void addToCart(Product product) {
        products.add(product);
        total.addPrice(product.getValue());
    }

    void removeFromCart(Product product) {
        products.remove(product);
        total.reducePrice(product.getValue());
    }

    void applyDiscount(int percentage) {
        total.addDiscount((float) percentage);
    }
}



