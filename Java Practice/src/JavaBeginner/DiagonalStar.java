package JavaBeginner;
//Created By Lakshman on 1/7/2019

import java.util.Scanner;

public class DiagonalStar {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printSquareStar(scanner.nextInt());
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int column; //i
            int row; //j

            for (column = 0; column < number; column++) {
                for (row = 0; row < number; row++) {
                    if (column == 0 ||
                            column == number - 1 ||
                            row == 0 ||
                            row == number - 1 ||
                            column == row ||
                            column == number - (row + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
