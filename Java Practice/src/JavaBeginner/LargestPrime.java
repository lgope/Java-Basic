package JavaBeginner;
//Created By Lakshman on 1/7/2019

import java.util.Scanner;

public class LargestPrime {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getLargestPrime(scanner.nextInt()));
    }

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        int largestPrime = 0;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        if (j >= i) {
                            largestPrime = j;
                        }
                        break;
                    }
                }
            }
        }
        return largestPrime;
    }
}
