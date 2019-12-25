package JavaBeginner;
//Created By Lakshman on 1/26/2019

import java.util.Scanner;

public class DigitCounting {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t, n;

        int[] array1 = new int[10];
        String str;

        t = scanner.nextInt();

        while (t-- > 0){
            n = scanner.nextInt();
            for (int i = 1; i <= n; i++){
                str = String.valueOf(i);
                for (int j = 0; j < str.length(); j++){
                    switch (str.charAt(j)){
                        case '0':
                            array1[0] += 1;
                            break;
                        case '1':
                            array1[1] += 1;
                            break;
                        case '2':
                            array1[2] += 1;
                            break;
                        case '3':
                            array1[3] += 1;
                            break;
                        case '4':
                            array1[4] += 1;
                            break;
                        case '5':
                            array1[5] += 1;
                            break;
                        case '6':
                            array1[6] += 1;
                            break;
                        case '7':
                            array1[7] += 1;
                            break;
                        case '8':
                            array1[8] += 1;
                            break;
                        case '9':
                            array1[9] += 1;
                            break;
                    }
                }
            }
            System.out.print(array1[0]);
            array1[0] = 0;

            for (int i = 1; i < 10; i++){
                System.out.print(" "+array1[i]);
                array1[i] = 0;
            }
            System.out.println();
        }
    }
}
