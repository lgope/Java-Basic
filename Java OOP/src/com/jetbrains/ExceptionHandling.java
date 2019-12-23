package com.jetbrains;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {

            try {
                int res = 10 / 0;

                System.out.println("Res : " + res);
            } catch (Exception l) {
                System.out.println("Exception handle : " + l);
            }

            try {
                String dt = null;

                if (dt.equals("gfg")) {
                    System.out.println("equal");
                } else {
                    System.out.println("not equal");
                }
            } catch (Exception st) {
                System.out.println("String exception : " + st);
            }


            int[] a = new int[5];

            a[5] = 10;

            System.out.println("Array a[5] : " + a[5]);
        /*catch(ArrayIndexOutOfBoundsException k){
            System.out.println("Array out of bound : "+k);*/
        } catch (Exception e) {
            System.out.println("Execption : " + e);
        }

        System.out.println("\n\nRest of program");
    }
}
