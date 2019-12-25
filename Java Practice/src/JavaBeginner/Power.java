package JavaBeginner;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        int n = in.nextInt(), p = in.nextInt();

        int resultOfPower = power(n, p);

        System.out.println("Result: "+resultOfPower);
    }

    public static int power(int n, int p){

        if(n % 2 != 0)
            return (int) Math.pow(n, p);
        else return (int) Math.pow(p, n);
    }
}
