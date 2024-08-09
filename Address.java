package com.xworkz.patient.address;

import com.xworkz.patient.country.Country;

public class Address {
    Country country;
    public Address(Country country) {
        this.country=country;

    }
    public void getAddress(){
        System.out.println("get address method started");
        this.country.getCountryDetails();
        System.out.println("get address method ended");
    }
}
