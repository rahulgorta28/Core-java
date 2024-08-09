package com.xworkz.patient.street;

public class Street {
    String streetName;
    int streetNumber;

    public Street(String streetName, int streetNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }
    public void getStreetDetails(){
        System.out.println("get street details method started");
        System.out.println("The Street Name is:" + streetName);
        System.out.println("The Street Number is:" + streetNumber);
        System.out.println("get street details method started");
    }
}
