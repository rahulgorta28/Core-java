package com.xworkz.patient.city;

import com.xworkz.patient.area.Area;

public class City {

    Area area;

    public City(Area area) {
        this.area = area;
    }
    public void getCityDetails(){
        System.out.println("get city details method started");
        this.area.getAreaDetails();
        System.out.println("get city details method ended");
    }
}
