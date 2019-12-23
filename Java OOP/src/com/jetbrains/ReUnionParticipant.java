package com.jetbrains;

import java.security.PublicKey;

public class ReUnionParticipant {
    private String participantName;
    private int sscYear = 0;
    private String reaction;
    private static int interested = 0;
    private static int going = 0;
    private static int notAbleToJoin = 0;
    private int donationAmount = 0;
    private static int totalDonation = 0;

    public ReUnionParticipant(String participantName, int sscYear, String reaction) {
        this.participantName = participantName;
        this.sscYear = sscYear;
        this.reaction = reaction;

        if (this.reaction.equals("M"))
            interested++;
        if (this.reaction.equals("G"))
            going++;
        if (this.reaction.equals("I"))
            notAbleToJoin++;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public int getSscYear() {
        return sscYear;
    }

    public void setSscYear(int sscYear) {
        this.sscYear = sscYear;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public static int getInterested() {
        return interested;
    }

    public static void setInterested(int interested) {
        ReUnionParticipant.interested = interested;
    }

    public static int getGoing() {
        return going;
    }

    public static void setGoing(int going) {
        ReUnionParticipant.going = going;
    }

    public static int getNotAbleToJoin() {
        return notAbleToJoin;
    }

    public static void setNotAbleToJoin(int notAbleToJoin) {
        ReUnionParticipant.notAbleToJoin = notAbleToJoin;
    }

    public int getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(int donationAmount) {
        try {
            this.donationAmount = donationAmount;
            totalDonation += this.donationAmount;
        } catch (NumberFormatException e) {
            System.out.println("Exception : " + e);
        }

    }

    public static int getTotalDonation() {
        return totalDonation;
    }

    public static void setTotalDonation(int totalDonation) {
        ReUnionParticipant.totalDonation = totalDonation;
    }

    public void showParticipant() {
        System.out.println("Name : " + participantName);
        System.out.println("SSC Year : " + sscYear);
        System.out.println("Reaction : " + reaction);
        System.out.println("Interested : " + interested);
        System.out.println("Going : " + going);
        System.out.println("Not Able To Join : " + notAbleToJoin);
        System.out.println("Donation Amount : " + donationAmount);
        System.out.println("Total Donation : " + totalDonation + "\n");
    }

    @Override
    public String toString() {
        return "ReUnionParticipant{" +
                "participantName='" + participantName + '\'' +
                ", sscYear=" + sscYear +
                ", reaction='" + reaction + '\'' +
                ", donationAmount=" + donationAmount +
                '}';
    }
}
