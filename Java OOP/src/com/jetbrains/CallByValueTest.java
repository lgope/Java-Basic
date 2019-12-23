package com.jetbrains;

public class CallByValueTest {

    public static void main(String[] args) {

        CallByValue ob = new CallByValue();

        int y = 10;
        System.out.println("Before calling : "+y);

        ob.change(y);
        System.out.println("After calling : "+y);
    }
}
