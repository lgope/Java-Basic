package com.oopLabExam;

public class PowerPlant {
    protected String plantName = "Electricity Power Plant";
    protected String plantLocation = "Dhaka";
    protected double totalPowerCapacityMW = 600.00;
    protected double productionCostPerMW = 150000.00;
    protected int totalNumberOfConsumer = 10;
    protected double priceOfOneKW = 1.00;


    @Override
    public String toString() {
        return "PowerPlant{" +
                "plantName='" + plantName + '\'' +
                ", plantLocation='" + plantLocation + '\'' +
                ", totalPowerCapacityMW=" + totalPowerCapacityMW +
                ", productionCostPerMW=" + productionCostPerMW +
                ", totalNumberOfConsumer=" + totalNumberOfConsumer +
                ", priceOfOneKW=" + priceOfOneKW +
                '}';
    }
}
