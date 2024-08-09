package com.zworkz.hotelroomappsystem.roomsystem;

public class Rooms {

    public int capacity;
    public int roomNumber;
    public String guestName;

    public Rooms(int capacity, int roomNumber, String guestName) {
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.guestName = guestName;
    }

    public void displayDetails(){
        System.out.println("The room Capacity is:" + capacity);
        System.out.println("The room Number is:" + roomNumber);
        System.out.println("The guest name is:" + guestName);
    }
}
