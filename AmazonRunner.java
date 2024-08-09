package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazonlogic.Amazon;

class AmazonRunner{

    public static void main(String[] args){

        System.out.println("Main method started");

        boolean   isProductNameAdded	= Amazon.addProductName("Echo Dot (4th Gen)");
        isProductNameAdded	= Amazon.addProductName("Fire TV Stick 4K");
        isProductNameAdded	= Amazon.addProductName("Kindle Paper white");
        isProductNameAdded	= Amazon.addProductName("Amazon Basics AA Batteries");
        isProductNameAdded	= Amazon.addProductName("Ring Video Doorbell");
        isProductNameAdded	= Amazon.addProductName("Fire HD 10 Tablet");
        isProductNameAdded	= Amazon.addProductName("Echo Show 8");
        isProductNameAdded	= Amazon.addProductName("Amazon Smart Plug");
        isProductNameAdded	= Amazon.addProductName("Fire 7 Kids Edition Tablet");
        isProductNameAdded	= Amazon.addProductName("AmazonBasics High-Speed HDMI Cable");

        if(isProductNameAdded){

            Amazon.printProductNames();

            boolean isUpdated	= Amazon.updateProductName("Echo Show 8" , "Speaker");
            if(isUpdated)
                Amazon.printProductNames();
            boolean  isdeleted = Amazon.deleteProductName("Amazon Smart Plug");
            if(isdeleted)
                Amazon.printProductNames();
        }


    }


}
