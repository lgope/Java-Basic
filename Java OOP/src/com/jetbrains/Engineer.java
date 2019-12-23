package com.jetbrains;

public class Engineer {
    private String id;
    private String name;
    private double basicSalary;
    private double houseRent;
    private double allowance;
    private double totalSalary;

    public Engineer(String id, String name, double basicSalary, double allowance, double totalSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.totalSalary = totalSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
}
