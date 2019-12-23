package com.jetbrains;
//Created By Lakshman on 2/15/2019

import java.util.Scanner;

public class CountryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Country country = new Country(sc.next(), sc.next(), sc.nextInt());
    }
}
