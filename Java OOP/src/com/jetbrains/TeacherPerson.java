package com.jetbrains;
//Created By Lakshman on 2/12/2019

public class TeacherPerson extends PersonTeacherStudent {
    private String initial;
    private String designation;

    public TeacherPerson(String initial, String name, String designation, String dept) {
        super(name, dept);
        this.setInitial(initial);
        this.setDesignation(designation);
    }

    private void setInitial(String initial) {
        this.initial = initial;
    }

    private void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getInitial() {
        return initial;
    }

    public String getDesignation() {
        return designation;
    }

    public void teacherInfo() {
        System.out.println("\nTeacher initial : "+ this.initial);
        System.out.println("Teacher name : "+ getName());
        System.out.println("Teacher designation : "+ this.designation);
        System.out.println("Teacher departmenet : "+ getDept());
    }
}
