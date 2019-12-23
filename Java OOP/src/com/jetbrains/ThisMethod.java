package com.jetbrains;
//Created By Lakshman on 2/13/2019

public class ThisMethod {
    public ThisMethod() {
        this(10);
        System.out.println("This is Default Constructor");
    }

    public ThisMethod(int number1) {
        this(10, 20);
        System.out.println("This is Parametrized Constructor with one argument : "+ number1);
    }

    public ThisMethod(int number1, int number2) {
        System.out.println("This is Parametrized Constructor with two arguments : "+ number1 + " "+ number2);
    }

    public static void main(String[] args) {
        ThisMethod m = new ThisMethod();
    }
}
