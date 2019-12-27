package com.school.management.system;

public abstract class Person {
    protected String id;
    protected String name;


    /**
     * Just create a constructor
     */

    public Person() {
    }

    /**
     * Create a constructor with two
     *
     * @param id   and
     * @param name
     */

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * This is a abstract method
     *
     * @return null Just for showing info
     */


    abstract void show();
}
