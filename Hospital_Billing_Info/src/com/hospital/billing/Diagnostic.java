package com.hospital.billing;

/**
 * This class has Doctor info and Patient info
 * This class is responsible for keeping the Doctor's information,
 * Patient information, Tests Name of patient, Test quantity and
 * Diagnostic total cost
 */

public class Diagnostic {
    private Doctor doctor;
    private Patient patient;
    private String testsName;
    private int testQuantity;
    private double diagnosticTotalCost;

    /**
     * @param doctor       as doctor's all info
     * @param patient      as patient's all info
     * @param testsName    tests name of patient's
     * @param testQuantity total test number of patient's
     */

    public Diagnostic(Doctor doctor, Patient patient, String testsName, int testQuantity) {
        this.doctor = doctor;
        this.patient = patient;
        this.testsName = testsName;
        this.testQuantity = testQuantity;
    }

    /**
     * Calculating total diagnostic cost of patient's
     */
    public void diagnosticCost() {
        this.diagnosticTotalCost = testQuantity * 200;

        if (this.diagnosticTotalCost >= 2000) {
            this.diagnosticTotalCost -= this.diagnosticTotalCost * 0.10;
        }
    }

    /**
     * @return Tests Name of patient's
     */

    public String getTestsName() {
        return testsName;
    }

    /**
     * @param testsName set Tests Name of patient's
     */

    public void setTestsName(String testsName) {
        this.testsName = testsName;
    }

    /**
     * @return total test number of patient's
     */

    public int getTestQuantity() {
        return testQuantity;
    }

    /**
     * @param testQuantity set total test number of patient's
     */

    public void setTestQuantity(int testQuantity) {
        this.testQuantity = testQuantity;
    }

    /**
     * @return Diagnostic total cost of patient's
     */
    public double getDiagnosticTotalCost() {
        return diagnosticTotalCost;
    }

    /**
     * @param diagnosticTotalCost set the value of Diagnostic total cost of patient's
     */
    public void setDiagnosticTotalCost(double diagnosticTotalCost) {
        this.diagnosticTotalCost = diagnosticTotalCost;
    }

    /**
     * showing total Diagnostic cost of patient's
     *
     * @return void
     */
    public void diagnosticInfo() {
        System.out.println("Diagnostic Info :");
        System.out.println("Doctor Name     : " + doctor.getName());
        System.out.println("Patient Name    : " + patient.getName());
        System.out.println("Patient Tests   : " + this.testsName);
        System.out.println("Test Quantity   : " + this.testQuantity);
        System.out.println("Diagnostic Cost : " + this.diagnosticTotalCost);
        System.out.println();
    }
}
