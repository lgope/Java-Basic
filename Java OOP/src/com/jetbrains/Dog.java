package com.jetbrains;

public class Dog extends Animal {

    private int eyes;
    private int lags;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int lags, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);

        this.eyes = eyes;
        this.lags = lags;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");

        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLags(int speed) {
        System.out.println("Dog.moveLags() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLags(speed);
        super.move(speed);
    }
}