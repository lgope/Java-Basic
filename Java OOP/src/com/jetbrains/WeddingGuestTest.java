package com.jetbrains;

import java.util.Scanner;

public class WeddingGuestTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        WeddingGuest g1 = new WeddingGuest(sc.nextLine());
        WeddingGuest g2 = new WeddingGuest(sc.nextLine());

        g1.attendParty();
        g1.setGiftAmount(sc.nextInt());

        g1.showGuest();
        g2.showGuest();
    }
}
