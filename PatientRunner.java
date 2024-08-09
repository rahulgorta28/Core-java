package com.xworkz.patient;

import com.xworkz.patient.address.Address;
import com.xworkz.patient.area.Area;
import com.xworkz.patient.city.City;
import com.xworkz.patient.country.Country;
import com.xworkz.patient.patientdetails.Patient;
import com.xworkz.patient.state.State;
import com.xworkz.patient.street.Street;

public class PatientRunner {
    public static void main(String[] args) {
        System.out.println("The main method started");
        Street street = new Street("Rajaji Nagar",560010);
        Area area = new Area(street);
        City city = new City(area);
        State state = new State(city);
        Country country = new Country(state);
        Address address = new Address(country);
        Patient patient = new Patient(address);
        patient.displayPatientDetails();
        System.out.println("The main method ended");
    }
}
