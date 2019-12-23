package com.jetbrains;

public class Output {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.SetData(10, 5);
        sample.Display();
    }
}

class Sample {
    int i;
    int j;

    public void SetData(int i, int j) {
        this.i = j;
        j = i;
    }

    public void Display() {
        System.out.println(i + " "+ j);
    }
}
