package com.lakshman;

public class Circle extends Shape{

//    Circle = 3.1416 * r * r

    Circle(double redius){
        super(redius, redius);
    }

    void area(){
        double result = Math.PI * dim1 * dim2;
        System.out.println("Circle : "+ result);
    }

}
