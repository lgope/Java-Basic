package JavaBeginner;
//Created By Lakshman on 2/17/2019

import java.math.BigInteger;
import java.util.Scanner;

public class UVABigInteger {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println(num + "!");
            System.out.println(factorial(num));
        }
    }

    public static BigInteger factorial(int num) {
        BigInteger bigInteger = new BigInteger("1");

        for (int i = 2; i <= num; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }

        return bigInteger;
    }
}
