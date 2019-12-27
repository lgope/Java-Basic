package com.hospital.billing;

/**
 * This is a subclass of Person class
 * This class is responsible for keeping the Patient's
 * name, age, contact information and total days
 * that patient has stayed at hospital
 */

public class Patient extends Person {

    private int totalDays;

    /**
     * @param name        name of the patient
     * @param age         age of the patient
     * @param contactInfo contact information of patient
     * @param totalDays   total days patient has stayed at hospital
     */

    public Patient(String name, int age, String contactInfo, int totalDays) {
        super(name, age, contactInfo);
        this.totalDays = totalDays;
    }

    /**
     * @return return total days that has patient stayed at hospital
     */
    public int getTotalDays() {
        return totalDays;
    }

    /**
     * @param totalDays set the total days that patient has stayed at hospital
     */

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    /**
     * Overriding the show method from super class (Person class)
     *
     * @return null Just for showing patient's information
     */

    @Override
    public void show() {
        System.out.println("Patient Info :");
        System.out.println("Name         : " + super.getName());
        System.out.println("Age          : " + super.getAge());
        System.out.println("Contact      : " + super.getContactInfo());
        System.out.println("Total Days   : " + this.totalDays);
        System.out.println();
    }
}
