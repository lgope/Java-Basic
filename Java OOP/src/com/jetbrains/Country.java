package com.jetbrains;
//Created By Lakshman on 2/15/2019

public class Country {
    private String countryID;
    private String countryName;
    private int totalFoodProduced;

    public Country(String countryID, String countryName, int totalFoodProduced) {
        this.countryID = countryID;
        this.countryName = countryName;
        this.totalFoodProduced = totalFoodProduced;
        totalFoodProduction(this.totalFoodProduced);
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getTotalFoodProduced() {
        return totalFoodProduced;
    }

    public void setTotalFoodProduced(int totalFoodProduced) {
        this.totalFoodProduced = totalFoodProduced;
    }

    public void totalFoodProduction(int totalFoodProduced) {
        if (totalFoodProduced >= 50 && totalFoodProduced <= 500)
            System.out.println("The country does not need any support");
        else System.out.println("Country need FAO support for Food Production");
    }
}
