package com.jetbrains;

public class ConstructorOverloding {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Lakshman", "Male");

        Teacher teacher3 = new Teacher("Lakshman", "Male", 1742824722);

        teacher2.displayInformation();
        teacher3.displayInformation();
    }
}
