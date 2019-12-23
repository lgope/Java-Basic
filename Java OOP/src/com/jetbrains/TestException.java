package com.jetbrains;

public class TestException {
    public static void main(String[] args) {
        try {
            int a = 1;
            int arr[] = new int[10];
            int result = a / arr[10];
        }catch (ArrayIndexOutOfBoundsException e){
            Method1();
        }catch (ArithmeticException e){
            Method2();
        }finally {
            Method1();
            Method2();
        }
    }

    public static void Method1(){
        try {
            int a = Integer.parseInt("ABC900");
            System.out.println(a);
        }catch (Exception e){
            System.out.println("Exception in Method1 : "+e);
        }
    }

    public static void Method2(){
        try {
            int arr[] = new int[-10];
            arr[0] = 100;
            System.out.println(arr[0]);
        }catch (Exception e){
            System.out.println("Exception in Method2 : "+e);
        }
    }
}
