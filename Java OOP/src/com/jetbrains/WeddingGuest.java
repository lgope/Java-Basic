package com.jetbrains;

public class WeddingGuest {
    private String guestName;
    private static int confirmedGuest = 0;
    private static int mayBe = 0;
    private int giftAmount = 0;
    private static int totalGiftAmount = 0;

    public WeddingGuest(String guestName) {
        this.guestName = guestName;
        mayBe++;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public static int getConfirmedGuest() {
        return confirmedGuest;
    }

    public static void setConfirmedGuest(int confirmedGuest) {
        WeddingGuest.confirmedGuest = confirmedGuest;
    }

    public static int getMayBe() {
        return mayBe;
    }

    public static void setMayBe(int mayBe) {
        WeddingGuest.mayBe = mayBe;
    }

    public int getGiftAmount() {
        return giftAmount;
    }

    public void setGiftAmount(int giftAmount) {
        try {

            this.giftAmount = giftAmount;
            totalGiftAmount += this.giftAmount;

        } catch (NumberFormatException e) {
            System.out.println("Exception : " + e);
        }
    }

    public static int getTotalGiftAmount() {
        return totalGiftAmount;
    }

    public static void setTotalGiftAmount(int totalGiftAmount) {
        WeddingGuest.totalGiftAmount = totalGiftAmount;
    }

    public void attendParty() {
        try {
                confirmedGuest++;
        } catch (ArithmeticException e) {
            System.out.println("Exception : " + e);
        }

    }

    public void showGuest() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("MayBe Guest : " + mayBe);
        System.out.println("Confirmed Guest : " + confirmedGuest);
        System.out.println("Gift Amount : " + giftAmount);
        System.out.println("Total Gift Amount : " + totalGiftAmount+"\n");
    }
}
