package com.jetbrains;

public class AnimalDogInherit {

    public static void main(String[] args) {
        Animal animall = new Animal("Animall", 1, 1, 5, 5);

        Dog dog = new Dog("Boju", 8, 20, 2, 4, 1, 20, "Long silky");

        dog.eat();

//      dog.walk();

        dog.run();

    }
}
