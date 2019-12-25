//Created By Lakshman on 2/26/2019

public class Teacher extends Person {
    protected String initial;
    protected double basic;

    public Teacher() {}

    public Teacher(String ID, String name, String dept, String initial, double basic) {
        super(ID, name, dept);
        this.initial = initial;
        this.basic = basic;
    }

    public double calcSalary() {
        double salary = this.basic + this.basic / 10 + this.basic / 2;
        return salary;
    }

    public String getInitial() {
        return initial;
    }

    public String getName() {
        return name;
    }

    @Override
    public void show() {
        System.out.println("Teacher's info:");
        super.show();
        System.out.println("initial: " + this.initial);
        System.out.println("Salary : " + this.calcSalary());
        System.out.println();
    }
}
