package JavaBeginner;
//Created By Lakshman on 1/7/2019

import java.util.Scanner;

public class PerfectNumber {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(scanner.nextInt()));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        return number == sum;
    }
}
