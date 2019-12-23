package com.jetbrains;

public class Teacher {

    String name, gender;
    int phone;


    Teacher() {

        System.out.println("No information!");
    }

    Teacher(String n, String g) {

        name = n;
        gender = g;
    }

    Teacher(String n, String g, int ph){

        name = n;
        gender = g;
        phone = ph;
    }

    void displayInformation(){

        System.out.println("Name   : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone  : "+phone);
    }
}
