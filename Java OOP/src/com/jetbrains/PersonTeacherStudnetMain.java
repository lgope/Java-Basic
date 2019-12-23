package com.jetbrains;
//Created By Lakshman on 2/12/2019

import java.util.Scanner;

public class PersonTeacherStudnetMain {
    private static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        PersonTeacherStudent person;

        person  = new TeacherPerson(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.next());
        ((TeacherPerson) person).teacherInfo();


        person = new StudentPerson(scanner.next(), scanner.next(), scanner.nextInt(), scanner.next());
        ((StudentPerson) person).studentInfo();

//        StudentPerson studentPerson = new StudentPerson(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.next());
//        studentPerson.studentInfo();

    }
}

// Input Sample

 /*MR
Musfiqur Rahman
Senior Teacher
SWE*/

 /*173-35-2256
Lakshman Gope
24
SWE*/