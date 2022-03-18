package com.muwaffaq.innopolis.solid.SRP.correct;

public class Price {
    float total;

    public Price(){
        total = 0;
    }

    public void addPrice(float v){
        total += v;
    }

    public void reducePrice(float v){
        total -= v;
    }

    public void addDiscount(float percentage){
        total = total * (percentage / 100);
    }
}
