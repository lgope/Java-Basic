package com.assignment.three;

public class Person {

    private int id;
    private String name;
    private double salaryPerDay;


    public Person(int id, String name, double salaryPerDay) {
        this.id = id;
        this.name = name;
        this.salaryPerDay = salaryPerDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salary) {
        this.salaryPerDay = salary;
    }

    public static double calculateSalary(double salaryPerDay) {
        return salaryPerDay * 30;
    }

    public static double calculateBonusSalary(int numOfProduct) {
        return numOfProduct > 100 ? 500 : 0;
    }
}
