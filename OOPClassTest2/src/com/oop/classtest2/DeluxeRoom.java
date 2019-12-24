package com.oop.classtest2;

public class DeluxeRoom extends Room {
    private double roomSize;

    public DeluxeRoom(String roomID, int roomNum, double roomFare, double roomSize) {
        super(roomID, roomNum, roomFare);
        this.roomSize = roomSize;
    }

    @Override
    void roomInfo() {
        System.out.println("Deluxe Room Info :");
        System.out.println("Room ID          : " + super.getRoomID());
        System.out.println("Room Number      : " + super.getRoomNum());
        System.out.println("Room Fare        : " + super.getRoomFare());
        System.out.println("Room Size        : " + this.roomSize);
        System.out.println();
    }
}
