package com.jetbrains;

public class AddDemo {

    void add(int... num){
        int sum = 0;

        for (int i: num){
            sum += i;
        }

        System.out.println("Sum = "+sum);
    }
}
