package com.oopLabExam;

public class Consumer extends Person {

    private String consumerLocation;
    private double monthlyPowerUsedKW;
    private String powerPlantName;
    private double totalElectricityBill;
    private String consumerType;

    public Consumer(String ID, String name, String consumerLocation, double monthlyPowerUsedKW, String powerPlantName, double totalElectricityBill, String consumerType) {

        super(ID, name);
        this.consumerLocation = consumerLocation;
        this.monthlyPowerUsedKW = monthlyPowerUsedKW;
        this.powerPlantName = powerPlantName;
        this.totalElectricityBill = totalElectricityBill;
        this.consumerType = consumerType;

    }

    @Override
    public String toString() {

        return "Consumer{" +
                ", ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                "consumerLocation='" + consumerLocation + '\'' +
                ", monthlyPowerUsedKW=" + monthlyPowerUsedKW +
                ", powerPlantName='" + powerPlantName + '\'' +
                ", totalElectricityBill=" + totalElectricityBill +
                ", consumerType='" + consumerType + '\'' +
                '}';
                
    }
}
