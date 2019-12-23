package com.jetbrains;
//Created By Lakshman on 2/15/2019

import java.util.ArrayList;
import java.util.List;

class Animals {
    private String type;
    private boolean canJump;
    private boolean canSwimg;

    public Animals(String type, boolean canJump, boolean canSwing) {
        this.type = type;
        this.canJump = canJump;
        this.canSwimg = canSwing;
    }

    public boolean canJump() {
        return canJump;
    }

    public boolean canSwimg() {
        return canSwimg;
    }

    public String getType() {
        return type;
    }

}

interface CheckAnimal {
    boolean check(Animals animal);
}

class CheckCanJump implements CheckAnimal {

    @Override
    public boolean check(Animals animal) {
        return animal.canJump();
    }
}

interface AnotherCheck {
    boolean check(Animals first, Animals second);
}

public class LambdaExpressions {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();
        animals.add(new Animals("fish", false, true));
        animals.add(new Animals("rabbit", true, false));
        animals.add(new Animals("dog", true, true));

        print(animals, new CheckCanJump()); // print all the animals that can jump
        print(animals, animal -> animal.canSwimg()); // print all the animals that can swim
        print(animals, animal -> !animal.canSwimg()); // print all the animals that can't swim

        print(animals, (Animals animal) -> {
            return animal.canJump();
        });

        print(animals, (Animals animal) -> {
//            Animals animal = new Animals("cat", true, false);
            System.out.println("Checking animal = " + animal.getType());
            return animal.canJump();
        });

        Animals fish = animals.get(0);
        Animals rabbit = animals.get(1);
        Animals dog = animals.get(2);

        // print(fish, rabbit, ((first, second) -> ));
    }

    private static void print(Animals first, Animals second, AnotherCheck check) {
        System.out.println(check.check(first, second));
    }

    private static void print(List<Animals> animals, CheckAnimal filter) {
        for (Animals animals1 : animals) {
            if (filter.check(animals1)) {
                System.out.println(animals1.getType());
            }
        }
        System.out.println();
    }
}
