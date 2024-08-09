package com.xworkz.mrpstoremanagementsystem;

import com.xworkz.mrpstoremanagementsystem.mrpstorelogic.MRPStore;

class MRPStoreRunner{

    public static void main(String[] args){

        System.out.println("Main method started");

        boolean   isAlcoholNameAdded	= MRPStore.addAlcoholName("Absolut Vodka");
        isAlcoholNameAdded	= MRPStore.addAlcoholName("Jack Daniel's Tennessee Whiskey");
        isAlcoholNameAdded	= MRPStore.addAlcoholName("Bacardi Rum");
        isAlcoholNameAdded	= MRPStore.addAlcoholName("Tanqueray Gin");
        isAlcoholNameAdded	= MRPStore.addAlcoholName("Patrón Tequila");
        isAlcoholNameAdded	= MRPStore.addAlcoholName("Hennessy Cognac");
        isAlcoholNameAdded	= MRPStore.addAlcoholName("Smirnoff Vodka");
        isAlcoholNameAdded	= MRPStore.addAlcoholName("Captain Morgan Spiced Rum");
        isAlcoholNameAdded	= MRPStore.addAlcoholName("Jameson Irish Whiskey");


        if(isAlcoholNameAdded){

            MRPStore.printAlcoholNames();

            boolean isupdated	= MRPStore.updateAlcoholName("Bacardi Rum" , "Wisky");
            if(isupdated)
                MRPStore.printAlcoholNames();
            boolean  isdeleted = MRPStore.deleteAlcoholName("Smirnoff Vodka");
            if(isdeleted)
                MRPStore.printAlcoholNames();
        }


    }


}