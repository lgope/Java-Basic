package JavaBeginner;
//Created By Lakshman on 1/7/2019

import java.util.Scanner;

public class AgeCalculate {

    private static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.print("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt(); // checking the birth year int or other type

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}
