package com.xworkz.touristcompanyapp;

import com.xworkz.touristcompanyapp.systemlogic.TouristCompany;

class TouristCompanyRunner{

    public static void main(String[] args){

        System.out.println("Main method started");

        boolean   isTouristPlaceNameAdded	= TouristCompany.addTouristPlaceName("Eiffel Tower, Paris, France");
        isTouristPlaceNameAdded	= TouristCompany.addTouristPlaceName("Great Wall of China, China");
        isTouristPlaceNameAdded	= TouristCompany.addTouristPlaceName("Machu Picchu, Peru");
        isTouristPlaceNameAdded	= TouristCompany.addTouristPlaceName("Colosseum, Rome, Italy");
        isTouristPlaceNameAdded	= TouristCompany.addTouristPlaceName("Grand Canyon, Arizona, USA");
        isTouristPlaceNameAdded	= TouristCompany.addTouristPlaceName("Taj Mahal, Agra, India");
        isTouristPlaceNameAdded	= TouristCompany.addTouristPlaceName("Sydney Opera House, Sydney, Australia");
        isTouristPlaceNameAdded	= TouristCompany.addTouristPlaceName("Santorini, Greece");
        isTouristPlaceNameAdded	= TouristCompany.addTouristPlaceName("Mount Fuji, Japan");
        isTouristPlaceNameAdded	= TouristCompany.addTouristPlaceName("Statue of Liberty, New York, USA");


        if(isTouristPlaceNameAdded){

            TouristCompany.printTouristPlaceNames();

            boolean isupdated	= TouristCompany.updateTouristPlaceName("Taj Mahal, Agra, India" , "Dubai");
            if(isupdated)
                TouristCompany.printTouristPlaceNames();
            boolean  isdeleted = TouristCompany.deleteTouristPlaceName("Mount Fuji, Japan");
            if(isdeleted)
                TouristCompany.printTouristPlaceNames();
        }


    }


}
