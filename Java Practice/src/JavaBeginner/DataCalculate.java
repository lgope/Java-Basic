package JavaBeginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DataCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d1 = new DecimalFormat("0.00");

        System.out.print("Enter total used data : ");
        double data = sc.nextDouble();

        System.out.print("Enter rate per data : ");

        double rate = sc.nextDouble();

        double perGBRate = (rate / data);// + (data % rate);

        System.out.println("Per gb rate : " +d1.format(perGBRate));
    }
}
