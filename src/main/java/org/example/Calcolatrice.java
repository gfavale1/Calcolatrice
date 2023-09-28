package org.example;

public class Calcolatrice {

    public Calcolatrice(){
        this.a = 0;
        this.b = 0;
    }

    public double sum(double a, double b){
        return a + b;
    }

    public double multiplication(double a, double b){
        return a * b;
    }



    private double a, b;
}
