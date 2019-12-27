package com.hospital.billing;

/**
 * This class has Doctor, Patient and Diagnostic information
 * This class is responsible for keeping the Doctor's, Patient's, Diagnostic's information
 * cabin cost, intensive care unit cost, professional fees and total hospital cost of patien's
 */

public class HospitalBillInfo {
    private Doctor doctor;
    private Patient patient;
    private Diagnostic diagnostic;
    private double cabinCost = 20.00;
    private double intensiveCareUnit = 15.00;
    private double respiratoryService = 100.00;
    private double physicalTherapy = 200.00;
    private double occupationalTherapy = 500.00;
    private double ecg = 600.00;
    private double professionalFees = 50.00;
    private double totalHospitalCharge;

    /**
     * @param doctor     as doctor's all info
     * @param patient    as patient's all info
     * @param diagnostic as diagnostic's all info
     */

    public HospitalBillInfo(Doctor doctor, Patient patient, Diagnostic diagnostic) {
        this.doctor = doctor;
        this.patient = patient;
        this.diagnostic = diagnostic;
    }

    /**
     * @return void
     * Calculating total hospital cost
     */
    public void hospitalTotalCost() {
        this.cabinCost = this.cabinCost * patient.getTotalDays();
        this.intensiveCareUnit = this.intensiveCareUnit * patient.getTotalDays();
        this.respiratoryService *= patient.getTotalDays();
        this.physicalTherapy *= patient.getTotalDays() / 2;
        this.occupationalTherapy *= 2;

        this.totalHospitalCharge = this.cabinCost + this.intensiveCareUnit + this.professionalFees + diagnostic.getDiagnosticTotalCost() + doctor.getDoctorsFee()
                + this.respiratoryService + this.physicalTherapy + this.occupationalTherapy + this.ecg;
    }

    /**
     * @return void
     * showing patient's all costs
     */

    public void patientBillInfo() {
        System.out.println(patient.getName() + " Bill Info :");

        System.out.println("Doctor Name          : " + doctor.getName());
        System.out.println("Patient Name         : " + patient.getName());

        System.out.println("Patient Tests        : " + diagnostic.getTestsName());
        System.out.println("Test Quantity        : " + diagnostic.getTestQuantity());
        System.out.println();
        System.out.println("Total Hospital Cost  :");
        System.out.println("Doctor Fee           : " + doctor.getDoctorsFee());
        System.out.println("Cabin Cost           : " + this.cabinCost);
        System.out.println("Intensive Care Unit  : " + this.intensiveCareUnit);
        System.out.println("Respiratory Service  : " + this.respiratoryService);
        System.out.println("Physical Therapy     : " + this.physicalTherapy);
        System.out.println("Occupational Therapy : " + this.occupationalTherapy);
        System.out.println("ECG Test             : " + this.ecg);
        System.out.println("Professional Fees    : " + this.professionalFees);
        System.out.println("Diagnostic Cost      : " + diagnostic.getDiagnosticTotalCost());
        System.out.println("______________________________");
        System.out.println("Total Charges        : " + this.totalHospitalCharge);

    }
}
