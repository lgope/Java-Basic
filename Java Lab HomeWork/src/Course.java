//Created By Lakshman on 2/26/2019

public class Course {
    private String courseCode, courseTitle;
    private double credit;
    //and all required methods here

    public Course() {}
    public Course(String courseCode, String courseTitle, double credit) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void show() {
        System.out.println("Course's info:");
        System.out.println("courseCode:" + courseCode + "\n"
                + "courseTitle:" + courseTitle + "\n"
                + "credit:" + credit);
        System.out.println();
    }

}
