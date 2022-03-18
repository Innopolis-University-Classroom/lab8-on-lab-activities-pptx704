package com.muwaffaq.innopolis.solid.LSP_IS.correct;

interface Bird {
    void eat();
    void hatch();
}

interface FlyBird extends Bird {
    void fly();
}

interface SwimmerBird extends Bird {
    void swim();
}