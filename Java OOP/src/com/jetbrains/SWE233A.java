package com.jetbrains;
//Created By Lakshman on 1/22/2019

public class SWE233A {

    private float attendenceMarks;
    private float assignmentMarks;
    private float quizMarks;
    private float midExamMarks;
    private float labMarks;
    private float finalMarks;
    private float totalMarks;
    private double grade;
    private String gradePoint;

    public SWE233A(float attendenceMarks, float assignmentMarks, float quizMarks, float midExamMarks, float labMarks, float finalMarks) {
        this.attendenceMarks = attendenceMarks;
        this.assignmentMarks = assignmentMarks;
        this.quizMarks = quizMarks;
        this.midExamMarks = midExamMarks;
        this.labMarks = labMarks;
        this.finalMarks = finalMarks;
    }

    public float getAttendenceMarks() {
        return attendenceMarks;
    }

    public void setAttendenceMarks(float attendenceMarks) {
        this.attendenceMarks = attendenceMarks;
    }

    public float getAssignmentMarks() {
        return assignmentMarks;
    }

    public void setAssignmentMarks(float assignmentMarks) {
        this.assignmentMarks = assignmentMarks;
    }

    public float getQuizMarks() {
        return quizMarks;
    }

    public void setQuizMarks(float quizMarks) {
        this.quizMarks = quizMarks;
    }

    public float getMidExamMarks() {
        return midExamMarks;
    }

    public void setMidExamMarks(float midExamMarks) {
        this.midExamMarks = midExamMarks;
    }

    public float getLabMarks() {
        return labMarks;
    }

    public void setLabMarks(float labMarks) {
        this.labMarks = labMarks;
    }

    public float getFinalMarks() {
        return finalMarks;
    }

    public void setFinalMarks(float finalMarks) {
        this.finalMarks = finalMarks;
    }

    public void totalMarksCalculate() {
        this.totalMarks = this.attendenceMarks + this.assignmentMarks + this.quizMarks + this.midExamMarks + this.labMarks + this.finalMarks;
    }

    public void gradeCalculate() {

        if (this.totalMarks >= (double) 80) {
            this.gradePoint = "A+";
            this.grade = (float) 4;
        } else if (this.totalMarks >= (double) 70) {
            this.gradePoint = "A";
            this.grade = 3.75;
        } else if (this.totalMarks >= (double) 60) {
            this.gradePoint = "A-";
            this.grade =  3.50;
        } else if (this.totalMarks >= (double) 50) {
            this.gradePoint = "B+";
            this.grade = 3.25;
        } else if (this.totalMarks >= (double) 40) {
            this.gradePoint = "C";
            this.grade = (double) 3;
        } else  {
            this.gradePoint = "F";
            this.grade = (double) 0;
        }
    }

    public double showResult() {
        System.out.println("Grade Point: "+ this.gradePoint);
        System.out.println("Grade: "+this.grade);

        return this.grade;
    }
}
