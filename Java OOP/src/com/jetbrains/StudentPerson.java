package com.jetbrains;
//Created By Lakshman on 2/12/2019

public class StudentPerson extends PersonTeacherStudent {
    private String id;
    private int batch;

    public StudentPerson(String id, String name, int batch, String dept) {
        super(name, dept);
        this.setId(id);
        this.setBatch(batch);
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setBatch(int batch) {
        this.batch = batch;
    }

    public String getId() {
        return id;
    }


    public int getBatch() {
        return batch;
    }

    public void studentInfo() {
        System.out.println("\nStudent id : "+ this.id);
        System.out.println("Student name : "+ getName());
        System.out.println("Student batch : "+ this.batch);
        System.out.println("Student department : "+ getDept());
    }

}
