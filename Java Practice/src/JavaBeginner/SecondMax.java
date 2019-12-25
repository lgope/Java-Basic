package JavaBeginner;

import java.util.Arrays;

public class SecondMax {

    public static void main(String[] args) {

        int[] a = {9, 5, 4, 2, 8};

        int secondMax = secondBig(a, a.length);

        System.out.println(secondMax);
    }

    public static int secondBig(int a[], int size){

        int swap;
//        Arrays.sort(a);

        for (int i = 0; i < size-1; i++){

            for (int j = 0; j < size-i-1; j++){

                if (a[j] > a[j+1]){
                    swap = a[j];
                    a[j] = a[j+1];
                    a[j+1] = swap;
                }
            }
        }

        return a[size-2];
    }
}
