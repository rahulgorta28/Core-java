package com.xworkz.laptopsystem.motherboardsystem;

public class MotherBoard {

    public int modelNumber;
    public String chipset;
    public String formFactor;
    public String socketType;

    public MotherBoard(int modelNumber, String chipset, String formFactor, String socketType) {
        this.modelNumber = modelNumber;
        this.chipset = chipset;
        this.formFactor = formFactor;
        this.socketType = socketType;
    }
    public void displayDetails(){
        System.out.println("The Model Number is:" + modelNumber);
        System.out.println("The chipset used is:" + chipset);
        System.out.println("The Form Factor is:" + formFactor);
        System.out.println("The Socket Type is:" + socketType);
    }
}
