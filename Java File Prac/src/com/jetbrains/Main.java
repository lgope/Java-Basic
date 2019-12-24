package com.jetbrains;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileReader fileReader = new FileReader("G:\\JavaFile Prac\\src\\com\\jetbrains\\orderMenu");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null)
                System.out.println(line);
        } catch (FileNotFoundException fi) {
            System.out.println(fi);
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            RestManage r1 = new RestManage(sc.nextInt(), sc.nextInt());
            r1.findQuantity(sc.nextInt());
            r1.CalcPrice();
            r1.CalcServiceCharge();

            RestManage r2 = new RestManage(sc.nextInt(), sc.nextInt());
            r2.findQuantity(sc.nextInt());
            r2.CalcPrice();
            r2.CalcServiceCharge();
        } catch (Exception e) {
            System.out.println("Execption : " + e);
            System.out.println("Please enter a number");
        }
    }
}
