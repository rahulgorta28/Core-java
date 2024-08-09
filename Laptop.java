package com.xworkz.laptopsystem.motherboardsystem.systemlogic;

import com.xworkz.laptopsystem.motherboardsystem.MotherBoard;

public class Laptop {

    MotherBoard motherBoard;

    public Laptop(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }
    public void getMotherboardDetails(){
        this.motherBoard.displayDetails();
    }
}
