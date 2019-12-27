package com.hospital.billing;

/**
 * This is a abstract and super class of
 * Patient class and Doctor class
 * This class is responsible for keeping the subclasses
 * name, age and contact information
 */

public abstract class Person {
    protected String name;
    protected int age;
    protected String contactInfo;


    /**
     * Default Constructor
     * Just for Overloading
     */

    public Person() {
    }


    /**
     * @param name        name parameter keeping inherited class's name field
     * @param age         age parameter keeping inherited class's age field
     * @param contactInfo contact information  parameter keeping inherited class's contactInfo field
     */

    public Person(String name, int age, String contactInfo) {
        this.name = name;
        this.age = age;
        this.contactInfo = contactInfo;
    }

    /**
     * @return name as type of string
     */

    public String getName() {
        return name;
    }

    /**
     * @param name set name as parameter
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age as type of integer
     */

    public int getAge() {
        return age;
    }

    /**
     * @param age set age as parameter
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return contact information as string
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     * @param contactInfo set contact information as parameter
     */

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * Abstract method for overriding
     * return void
     */
    abstract void show();
}
