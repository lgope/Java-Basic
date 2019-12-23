package com.jetbrains;
//Created By Lakshman on 2/5/2019

public class GroupWork3 {
    private String courseTitle;
    private String courseCode;
    private int courseCredit;

    public GroupWork3(String courseTitle, String courseCode, int courseCredit) {
        this.setCourseTitle(courseTitle);
        this.setCourseCode(courseCode);
        this.setCourseCredit(courseCredit);
    }

    private void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    private void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    private void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void showDetails() {
        System.out.println("Course Title : " + this.courseTitle);
        System.out.println("Course Code : " + this.courseCode);
        System.out.println("Course Credit : " + this.courseCredit);
    }
}
