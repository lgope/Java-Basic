package com.jetbrains;

import java.util.Scanner;

public class PersonTeacherQuTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        TeacherQu t1 = new TeacherQu();
        TeacherQu t2 = new TeacherQu();

        t1.setName(in.nextLine());
        t1.setAge(20);
        t1.setQualification("BSc in SWE");

        t2.setName("Priya");
        t2.setAge(19);
        t2.setQualification("School graduated");

        t1.display();
        t2.display();
    }
}
