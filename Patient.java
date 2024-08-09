package com.xworkz.patient.patientdetails;

import com.xworkz.patient.address.Address;

public class Patient {
    Address address;

    public Patient(Address address) {
        this.address = address;
    }
    public void displayPatientDetails(){
        System.out.println("The display patient details method started");
        this.address.getAddress();
        System.out.println("The display patient details method ended");
    }
}
