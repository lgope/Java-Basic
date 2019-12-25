package JavaBeginner;
//Created By Lakshman on 2/5/2019

import java.util.Arrays;

public class ArrayOutput {
    public static void main(String[] args) {
        String[] animals = {"Parrot", "Dog", "Cat"};
        String[] myAnimals = animals;
        String[] otherAnimals = {"Parrot", "Dog", "Cat"};

        System.out.println(animals.equals(myAnimals)); // checking reference so True
        System.out.println(animals == myAnimals);      // they are same reference so True
        System.out.println(Arrays.equals(animals, myAnimals)); // checking elements so True

        System.out.println(animals.equals(otherAnimals)); // different reference so false
        System.out.println(animals == otherAnimals); // different reference so false
        System.out.println(Arrays.equals(animals, otherAnimals)); // same elements so True

        System.out.println(animals); // [L symbol of array
        System.out.println(animals.toString());

        System.out.println(Arrays.toString(animals)); // print an array nicely
    }
}
