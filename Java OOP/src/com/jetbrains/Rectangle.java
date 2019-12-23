package com.jetbrains;

public class Rectangle extends Shape{
//    area
    double length, width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        System.out.print("Area for Rectangle : ");
       return length * width;
    }
}
