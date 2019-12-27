package com.school.management.system;

/**
 * Created by Rakshith on 4/3/2017.
 * This class is responsible for keeping the
 * track of students fees, name ,grade & fees
 * paid.
 */
public class Student extends Person {

    private double grade;
    private double feesPaid;
    private double feesTotal;


    public Student() {
    }

    /**
     * To create a new student by initializing.
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     *
     * @param id    id for the student: Must be unique.
     * @param name  name of the student.
     * @param grade grade of the student.
     */
    public Student(String id, String name, double grade) {
        super(id, name);
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 5000;
    }

    /**
     * Used to update the student's grade.
     *
     * @param grade new grade of the student.
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }


    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     *
     * @param fees the fees that the student pays.
     */
    public void payFees(double fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * @return id of the student.
     */
    public String getId() {
        return id;
    }

    /**
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * @return the grade of the student.
     */
    public double getGrade() {
        return grade;
    }

    /**
     * @return fees paid by the student.
     */
    public double getFeesPaid() {
        return feesPaid;
    }

    /**
     * @return the total fees of the student.
     */
    public double getFeesTotal() {
        return feesTotal;
    }

    /**
     * @return the remaining fees.
     */
    public double getRemainingFees() {
        return feesTotal - feesPaid;
    }


    /**
     * Overriding the show method
     *
     * @return null Just for showing info
     */

    @Override
    public void show() {
        System.out.println("Student Info : ");
        System.out.println("ID : " + super.id);
        System.out.println("Name : " + super.name);
        System.out.println("Grade : " + this.grade);
        System.out.println("Total Fees Paid : " + this.feesPaid);
        System.out.println("Total Fees Paid : " + this.feesTotal);
        System.out.println();
    }
}