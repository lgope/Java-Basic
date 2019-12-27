package com.school.management.system;

/**
 * Created by Lakshman
 * This class is responsible for keeping the track
 * of teacher's name, id, salary.
 */
public class Teacher extends Person {
    private double salary;
    private double salaryEarned;

    public Teacher() {
    }

    /**
     * Creates a new Teacher object.
     *
     * @param id     id for the teacher.
     * @param name   name of the teacher.
     * @param salary salary of the teacher.
     */

    public Teacher(String id, String name, double salary) {
        super(id, name);
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return the id of the teacher.
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name of the teacher.
     */
    public String getName() {
        return this.name;
    }


    /**
     * @return the salary of the teacher.
     */
    public double getSalary() {
        return this.salary;
    }

    /**
     * set the salary.
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Adds  to salaryEarned.
     * Removes from the total money earned by the school.
     *
     * @param salary
     */
    public void receiveSalary(double salary) {
        this.salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }


    /**
     * Overriding the show method
     *
     * @return null Just for showing info
     */

    @Override
    public void show() {
        System.out.println("Teacher Info : ");
        System.out.println("ID : " + super.id);
        System.out.println("Name : " + super.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Salary Earned : " + this.salaryEarned);
        System.out.println();
    }
}