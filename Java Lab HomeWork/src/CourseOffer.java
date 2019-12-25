//Created By Lakshman on 2/26/2019

public class CourseOffer {
    private String semester;
    private Course course;
    private Teacher teacher;

    public CourseOffer(Course course, Teacher teacher) {
        this.course = course;
        this.teacher = teacher;
    }

    public CourseOffer(String semester, Course course, Teacher teacher) {
        this.semester = semester;
        this.course = course;
        this.teacher = teacher;
    }

    public void semesterWiseCourseAndTeacherInfo() {
        System.out.println("Semester wise Course and Teacher Info");
        System.out.println("Semester:" + this.semester + ", "
                + "course:" + course.getCourseTitle() + ", "
                + "teacher:" + teacher.getName());
        System.out.println();
    }
}
