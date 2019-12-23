package com.jetbrains;
//Created By Lakshman on 2/12/2019

public class PersonTeacherStudent {
    protected String name;
    protected static String dept;

    public PersonTeacherStudent(String name, String dept) {
        this.setName(name);
        this.setDept(dept);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}
