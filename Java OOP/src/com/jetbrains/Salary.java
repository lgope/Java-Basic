package com.jetbrains;

public class Salary {
    private ProjectManager pm;
    private SoftwareDeveloper sd;

    public Salary(ProjectManager pm, SoftwareDeveloper sd) {
        this.pm = pm;
        this.sd = sd;
    }

    public void pmsalaryInfo() {
        System.out.println("Name : " + this.pm.getName());
        System.out.println("ID : "+ this.pm.getId());
        System.out.println("");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
