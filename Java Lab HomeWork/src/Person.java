//Created By Lakshman on 2/26/2019

public class Person {
    protected String ID;
    protected String name;
    protected String department;

    public Person() {
    }

    public Person(String ID, String name, String dept) {
        this.ID = ID;
        this.name = name;
        this.department = dept;
    }

    public void show() {
        System.out.println("ID: " + this.ID + "\n"
                + "name: " + this.name + "\n"
                + "department: " + this.department);
    }
}
