package JavaBeginner;
//Created By Lakshman on 2/21/2019

import java.util.Scanner;

public class PoundsIntoKilograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = sc.nextDouble();

        double res = pounds * 0.454;

        System.out.println(pounds +" pounds is "+ res +" kilograms");
    }
}
