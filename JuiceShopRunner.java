package com.xworkz.juiceshopappmanagement;

import com.xworkz.juiceshopappmanagement.juiceshoplogic.JuiceShop;

public class JuiceShopRunner{

    public static void main(String[] args){

        System.out.println("Main method started");

        boolean   isJuiceNameAdded	= JuiceShop.addJuiceName("Orange Juice");
        isJuiceNameAdded	= JuiceShop.addJuiceName("Apple Juice");
        isJuiceNameAdded	= JuiceShop.addJuiceName("Grape Juice");
        isJuiceNameAdded	= JuiceShop.addJuiceName("Pineapple Juice");
        isJuiceNameAdded	= JuiceShop.addJuiceName("Cranberry Juice");
        isJuiceNameAdded	= JuiceShop.addJuiceName("Mango Juice");


        if(isJuiceNameAdded){

            JuiceShop.printJuiceNames();


            boolean isupdated	= JuiceShop.updateJuiceName("Mango Juice" , "Strawberry Juice");
            if(isupdated)
                JuiceShop.printJuiceNames();
            boolean  isdeleted = JuiceShop.deleteJuiceName("Apple Juice");
            if(isdeleted)
                JuiceShop.printJuiceNames();
        }


    }


}