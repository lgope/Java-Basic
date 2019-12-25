package JavaBeginner;

import java.util.Scanner;

import static java.lang.StrictMath.max;
import static java.lang.StrictMath.min;

public class BoxesPacking {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt(), y, mini = 0;
        int[] a = new int[x];

        while(x > 0){
           y = in.nextInt();

            a[mini++] = y;
            x--;
        }

        System.out.println(getMin(a));
    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1; i<inputArray.length; i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
