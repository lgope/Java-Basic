package com.jetbrains;

import java.util.Scanner;

public class ReUnionParticipantTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ReUnionParticipant r1 = new ReUnionParticipant(sc.next(), sc.nextInt(), sc.next());
        ReUnionParticipant r2 = new ReUnionParticipant(sc.next(), sc.nextInt(), sc.next());
        ReUnionParticipant r3 = new ReUnionParticipant(sc.next(), sc.nextInt(), sc.next());

        r1.setDonationAmount(sc.nextInt());
        r2.setDonationAmount(sc.nextInt());

        r1.showParticipant();
        r2.showParticipant();
        r3.showParticipant();

    }
}
