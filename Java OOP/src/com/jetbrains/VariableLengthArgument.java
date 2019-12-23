package com.jetbrains;

public class VariableLengthArgument {

    public static void main(String[] args) {

        AddDemo plus = new AddDemo();

        plus.add(12, 13, 14);
        plus.add(10, 20, 30, 50);
        plus.add(10, 20, 30, 50, 60);
        plus.add(10, 20, 30, 50, 60, 70);
    }
}
