package com.xworkz.mobileappsystem.contacts;

public class Contacts {
    public String contactName;
    public long phoneNumber;

    public Contacts(String contactName, long phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }
    public void contactDetails(){
        System.out.println("The contact name is:" + contactName);
        System.out.println("The Phone name is:" + phoneNumber);

    }
}
