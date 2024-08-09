package com.xworkz.patient.area;

import com.xworkz.patient.city.City;
import com.xworkz.patient.street.Street;

public class Area {

    Street street;

    public Area(Street street) {
        this.street = street;
    }

    public void getAreaDetails(){
        System.out.println("get area details method started");
        this.street.getStreetDetails();
        System.out.println("get area details method ended");
    }
}
