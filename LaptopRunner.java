package com.xworkz.laptopsystem;

import com.xworkz.laptopsystem.motherboardsystem.MotherBoard;
import com.xworkz.laptopsystem.motherboardsystem.systemlogic.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        MotherBoard motherBoard = new MotherBoard(12,"Intel Z490","Micro ATX","AM4");
        Laptop laptop = new Laptop(motherBoard);
        laptop.getMotherboardDetails();


    }
}
