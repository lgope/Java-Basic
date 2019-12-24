package com.oop.classtest2;

public class StandardRoom extends Room {
    private boolean ac_availability;

    public StandardRoom(String roomID, int roomNum, double roomFare, boolean ac_availability) {
        super(roomID, roomNum, roomFare);
        this.ac_availability = ac_availability;
    }


    @Override
    void roomInfo() {
        System.out.println("Standard Room Info   :");
        System.out.println("Room ID              : " + super.getRoomID());
        System.out.println("Room Number          : " + super.getRoomNum());
        System.out.println("Room Fare            : " + super.getRoomFare());
        System.out.println("Room Ac Availability : " + this.ac_availability);
        System.out.println();
    }
}
