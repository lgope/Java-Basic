package com.assignment.three;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        String name = scanner.next();
        double salaryPerDay = scanner.nextDouble();
        int numOfProduct = scanner.nextInt();

        Person person = new Person(id, name, salaryPerDay);

        double totalSalary = person.calculateSalary(salaryPerDay) + person.calculateBonusSalary(numOfProduct);

        System.out.println("Total Salary : " + totalSalary);


    }
}
