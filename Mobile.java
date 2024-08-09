package com.xworkz.mobileappsystem.contacts.mobile;

import com.xworkz.mobileappsystem.contacts.Contacts;

public class Mobile {

    Contacts contacts;

    public Mobile(Contacts contacts) {
        this.contacts = contacts;
    }

    public void openContacts(){
        System.out.println("Display method started");
        this.contacts.contactDetails();
    }
}
