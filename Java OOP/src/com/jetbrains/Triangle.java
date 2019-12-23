package com.jetbrains;

public class Triangle extends Shape{
//    area

    double base, height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    double area(){
        System.out.print("Area for Triangle : ");
        return 0.5 * base * height;
    }
}
