package com.xworkz.mobileappsystem;

import com.xworkz.mobileappsystem.contacts.Contacts;
import com.xworkz.mobileappsystem.contacts.mobile.Mobile;

public class MobileRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Contacts contacts = new Contacts("Rahul",9886883294L);
        Mobile mobile = new Mobile(contacts);
        mobile.openContacts();
        System.out.println("main ended");
    }
}
