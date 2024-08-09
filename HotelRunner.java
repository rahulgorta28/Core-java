package com.zworkz.hotelroomappsystem;

import com.zworkz.hotelroomappsystem.roomsystem.Rooms;
import com.zworkz.hotelroomappsystem.roomsystem.systemlogic.Hotel;

public class HotelRunner {
    public static void main(String[] args) {
       Rooms rooms = new Rooms(5,256,"Dr.Vijay");
        Hotel hotel = new Hotel(rooms);
        hotel.getRooms();
    }
}
