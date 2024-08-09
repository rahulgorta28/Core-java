package com.zworkz.hotelroomappsystem.roomsystem.systemlogic;

import com.zworkz.hotelroomappsystem.roomsystem.Rooms;

public class Hotel {

    Rooms rooms;

    public Hotel(Rooms rooms) {
        this.rooms = rooms;
    }

    public void getRooms(){
        this.rooms.displayDetails();
    }
}
