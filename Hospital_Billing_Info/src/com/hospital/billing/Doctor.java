package com.hospital.billing;

/**
 * This is a subclass of Person class
 * This class is responsible for keeping the Doctor's
 * name, age, contact information, department, degree and doctor fee
 */

public class Doctor extends Person {

    private String department;
    private String degree;
    private int doctorsFee;

    /**
     * @param name        name of the Doctor
     * @param degree      Doctor's degree
     * @param department  Doctor's department
     * @param contactInfo contact information of Doctor
     * @param age         age of the Doctor
     * @param doctorsFee
     */

    public Doctor(String name, String degree, String department, String contactInfo, int age, int doctorsFee) {
        super(name, age, contactInfo);
        this.department = department;
        this.degree = degree;
        this.doctorsFee = doctorsFee;
    }

    /**
     * @return return Department of doctor as string
     */

    public String getDepartment() {
        return department;
    }

    /**
     * @param department department of doctor set as parameter
     */

    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return Degree of doctor as string
     */

    public String getDegree() {
        return degree;
    }

    /**
     * @param degree degree of doctor set as parameter
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * @return Doctor's Fee as integer
     */

    public int getDoctorsFee() {
        return doctorsFee;
    }


    /**
     * @param doctorsFee Fees of doctor set as parameter
     */
    public void setDoctorsFee(int doctorsFee) {
        this.doctorsFee = doctorsFee;
    }

    /**
     * Overriding the show method from super class (Person class)
     *
     * @return null Just for showing doctor's information
     */

    @Override
    public void show() {
        System.out.println("Doctor Info :");
        System.out.println("Name        : " + super.getName());
        System.out.println("Degree      : " + this.degree);
        System.out.println("Department  : " + this.department);
        System.out.println("Contact     : " + super.getContactInfo());
        System.out.println("Age         : " + super.getAge());
        System.out.println("Doctor Fee  : " + this.doctorsFee);
        System.out.println();
    }
}
