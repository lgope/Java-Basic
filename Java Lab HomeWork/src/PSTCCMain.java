//Created By Lakshman on 2/26/2019

public class PSTCCMain {

    public static void main(String[] args) {

        Person student = new Student("123-456-789", "ABCD", "SWE", 24);
        student.show();

        Course course = new Course("SWE233", "OOP", 4.0);

        Teacher teacher = new Teacher("7123456", "Md. Mushfiqur Rahman", "MR", "SWE", 1000);
        teacher.show();

        CourseOffer courseOffer = new CourseOffer("Spring, 2019", course, teacher);
        courseOffer.semesterWiseCourseAndTeacherInfo();
    }
}
