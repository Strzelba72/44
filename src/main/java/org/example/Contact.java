package org.example;

public class Contact {
    private String name, phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static Contact createContact(String name_, String phoneNumber_)
    {
        Contact newContact=new Contact(name_,phoneNumber_);
        return newContact ;
    }
}
