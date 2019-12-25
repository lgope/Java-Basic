//Created By Lakshman on 2/26/2019

public class Student extends Person {
    private int batch;

    public Student() {}
    public Student(String ID, String name, String dept, int batch) {
        super(ID, name, dept);
        this.batch = batch;
    }

    public void show() {
        System.out.println("Students info:");
        super.show();
        System.out.println("batch: " + this.batch);
        System.out.println();
    }
}
