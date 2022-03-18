package com.muwaffaq.innopolis.solid.OCP_DI.correct;

// class is a basic calculator
// we can later extend the class and add methods like power and root
 class BasicCalculator {
    private double left;
    private double right;

    public BasicCalculator(double left, double right){
        this.left = left;
        this.right = right;
    }

    public double add(){
        return left + right;
    }

    public double subtract(){
        return left - right;
    }

    public double multiply(){
        return left * right;
    }

    public double divide(){
        return left / right;
    }

    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator(10, 15);
        calculator.add();
        calculator.multiply();
    }
}