package com.oop.classtest2;

public class Customer extends Person {

    private Room room;
    private String roomId;
    public Customer(String id, String name, String contactNo, Room room) {
        super(id, name, contactNo);
        this.room = room;
    }

    public void rentRoom() {
        this.roomId = room.getRoomID();
    }

    @Override
    void show() {

        System.out.println("Customer Info         :");
        System.out.println("Customer ID           : "+ super.id);
        System.out.println("Customer Name         : "+ super.name);
        System.out.println("Customer Contact Num  : "+ super.contactNo);
        System.out.println("Customer Room ID      : "+ roomId);
        
    }
}
