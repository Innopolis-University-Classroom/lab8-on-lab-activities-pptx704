package com.muwaffaq.innopolis.solid.SRP.correct;

public class Product {
    int value;
    String name;

    public Product(String name, int value){
        this.name = name;
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}