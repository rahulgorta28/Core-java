package com.xworkz.mrpstoremanagementsystem.mrpstorelogic;

import java.util.Arrays;
public class MRPStore{

    static String[] AlcoholNames = {null,null,null,null,null,null,null,null,null,null};
    static int index;

    public static boolean addAlcoholName(String AlcoholName){

        boolean isAlcoholNameAdded = false;

        if(index < AlcoholNames.length){
            if(AlcoholName!= null){
                AlcoholNames[index++] = AlcoholName;

            }else
                System.out.println("The Alcohol Name is invalid");
        }else
            System.out.println("Sorry Alcohol name is full:");
        return isAlcoholNameAdded = true;
    }
    public static void printAlcoholNames(){
        for(String AlcoholName:AlcoholNames){

            System.out.println("The Alcohol Names are:" + AlcoholName);

        }


    }

    public static boolean updateAlcoholName(String oldAlcoholName , String newAlcoholName){

        System.out.println("<-------------------------------------------->");
        System.out.println("The Update method started");

        boolean isAlcoholNameUpdated = false;

        for(int position=0 ; position<AlcoholNames.length;position++){

            if(AlcoholNames[position] == oldAlcoholName){
                AlcoholNames[position] = newAlcoholName;

                isAlcoholNameUpdated = true;
            }
        }
        if(!isAlcoholNameUpdated)
            System.out.println(oldAlcoholName + "not found");

        return isAlcoholNameUpdated;
    }
    public static boolean deleteAlcoholName(String delete){

        System.out.println("<----------------------------------------->");
        System.out.println("The Delete method started");

        boolean isAlcoholNameDeleted = false;
        int position, newPosition;
        for(position = 0 , newPosition = 0 ; position<AlcoholNames.length ; position++){
            if(AlcoholNames[position]!=delete){
                AlcoholNames[newPosition] = AlcoholNames[position];
                newPosition++;
            }
            else
                isAlcoholNameDeleted = true;
        }
        AlcoholNames = Arrays.copyOf(AlcoholNames,newPosition);

        if(!isAlcoholNameDeleted)
            System.out.println(delete+" not found");
        return isAlcoholNameDeleted;
    }

}





