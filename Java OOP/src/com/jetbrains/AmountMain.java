package com.jetbrains;
//Created By Lakshman on 1/11/2019

import static java.lang.System.out;

public class AmountMain {

    public static void main(String[] args) {
        Amount amount = new Amount("Lakshman");
        amount.deposit(1000);
        amount.withdraw(500);
        amount.withdraw(-200);
        amount.deposit(-20);
        amount.calculateBalance();

        out.println("Balance on account is " + amount.getBalance());
    }
}
