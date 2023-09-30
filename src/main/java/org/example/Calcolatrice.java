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
    public double substraction(double a, double b) { return a - b;}
    public double division(double a, double b){ if(b != 0) {return a / b;} else return 0;}
    public double PD(double a, double b){return b;}

    private double a, b;
}
