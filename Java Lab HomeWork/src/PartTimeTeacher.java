//Created By Lakshman on 2/26/2019

public class PartTimeTeacher extends Teacher {

    public PartTimeTeacher(String ID, String name, String dept, String initial, double basic) {
        super(ID, name, dept, initial, basic);
    }

    @Override
    public double calcSalary() {
        double salary = super.basic;
        return salary;
    }

    public double calcSalary(double allowance) {
        double salary = super.basic + allowance;
        return salary;
    }
}
