package com.jetbrains;
//Created By Lakshman on 1/22/2019

import javax.swing.*;
import java.util.Scanner;

public class SWE233AMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SWE233A test = new SWE233A(scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat());
        test.totalMarksCalculate();
        test.gradeCalculate();
        String result = Double.toString(test.showResult());
        JOptionPane.showMessageDialog(null, "Grade: "+ result);
    }
}
//4
//4
//14
//18
//24
//28