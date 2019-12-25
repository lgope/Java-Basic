package JavaBeginner;
//Created By Lakshman on 2/8/2019

import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str, ch = "";
//        char temp;

        str = scanner.next().toLowerCase();

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        /*ch = str;
        char[]  charString = str.toCharArray();
        Arrays.sort(charString);
        int k = scanner.nextInt(), i = 0, j = 0;

        while (k > 0) {
            j = str.length()-1;
            for (i = 0; i < j; i++, j--) {
                temp = str.charAt(i);
                str.charAt(i) = str.charAt(j);
                str.charAt(j) = temp;
            }
            k--;
        }*/
    }
}
