package com.xworkz.patient.state;

import com.xworkz.patient.city.City;

public class State {
    City city;

    public State(City city) {
        this.city = city;
    }

    public void getStateDetails(){
        System.out.println("get state details method started");
        this.city.getCityDetails();
        System.out.println("get state details method ended");
    }
}
