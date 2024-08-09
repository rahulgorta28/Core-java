package com.xworkz.teapointmanagementsystem;

import com.xworkz.teapointmanagementsystem.systemlogic.TeaPoint;

class TeaPointRunner{

    public static void main(String[] args){

        System.out.println("Main method started");

        boolean isTeaNameAdded	= TeaPoint.addTeaName("Amrut Tea");
        isTeaNameAdded	= TeaPoint.addTeaName("Lemon Tea");
        isTeaNameAdded	= TeaPoint.addTeaName("Ginger Tea");
        isTeaNameAdded	= TeaPoint.addTeaName("kesar Elaichi Tea");
        isTeaNameAdded	= TeaPoint.addTeaName("chocolate Tea");
        isTeaNameAdded	= TeaPoint.addTeaName("Badam Tea");


        if(isTeaNameAdded){

            TeaPoint.printTeaNames();


            boolean isupdated	= TeaPoint.updateTeaName("Lemon Tea" , "New Tea");
            if(isupdated)
                TeaPoint.printTeaNames();
            boolean  isdeleted = TeaPoint.deleteTeaName("Badam Tea");
            if(isdeleted)
                TeaPoint.printTeaNames();
        }


    }


}
