package com.xworkz.patient.country;

import com.xworkz.patient.state.State;

public class Country {
    State state;

    public Country(State state) {
        this.state = state;
    }

    public void getCountryDetails(){
        System.out.println("get country details method started");
        this.state.getStateDetails();
        System.out.println("get country details method ended");
    }
}
