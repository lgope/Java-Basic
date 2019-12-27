package com.hospital.billing;

public class Main {

    public static void main(String[] args) {

        Doctor doctor = new Doctor("Kamal", "MBBS", "Emergency Room", "12344, ER", 32, 400);

        Patient patient = new Patient("Jamal", 30, "8767878", 5);

        Diagnostic diagnostic = new Diagnostic(doctor, patient, "X-RAY, Physical Test, Blood Test, Height-Weight Test", 4);
        diagnostic.diagnosticCost();

        HospitalBillInfo hospitalBillInfo = new HospitalBillInfo(doctor, patient, diagnostic);
        hospitalBillInfo.hospitalTotalCost();
        hospitalBillInfo.patientBillInfo();

    }
}
