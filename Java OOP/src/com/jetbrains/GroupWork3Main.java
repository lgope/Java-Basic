package com.jetbrains;
//Created By Lakshman on 2/5/2019

import java.util.Scanner;

public class GroupWork3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GroupWork3 gw = new GroupWork3(sc.nextLine(), sc.nextLine(), sc.nextInt());
        gw.showDetails();
    }
}
