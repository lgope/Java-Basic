package com.school.management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {


        Teacher lizzy = new Teacher("1", "Lizzy", 500);
        Teacher mellisa = new Teacher("2", "Mellisa", 700);
        Teacher vanderhorn = new Teacher("3", "Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        System.out.println("All Teachers List :");
        for (Teacher teacher : teacherList) {

            System.out.println(teacher.getName());

        }

        System.out.println();


        Student tamasha = new Student("1", "Tamasha", 4);
        Student rakshith = new Student("2", "Rakshith Vasudev", 12);
        Student rabbi = new Student("3", "Rabbi", 5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);

        System.out.println("All Students List : ");
        for (Student student : studentList) {
            System.out.println(student.getName());
        }


        School bhs = new School(teacherList, studentList);

        Teacher megan = new Teacher("6", "Megan", 900);

        bhs.addTeacher(megan);


        tamasha.payFees(5000);
        rakshith.payFees(6000);

        System.out.println("\n\t\t------Making SCHOOL PAY SALARY----");
        System.out.println("BHS has earned $" + bhs.getTotalMoneyEarned());
        
        lizzy.receiveSalary(lizzy.getSalary());

        System.out.println("BHS has spent for salary to " + lizzy.getName()
                + " and now has $" + bhs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                + " and now has $" + bhs.getTotalMoneyEarned() + "\n");


        //mellisa.receiveSalary(mellisa.getSalary());
        mellisa.show();

        rakshith.show();
    }
}