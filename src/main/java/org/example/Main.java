package org.example;

public class Main {
    public static void main(String[] args) {
        MobilePhone mikolajphone=new MobilePhone("12345678");
        System.out.println(mikolajphone.addNewContact(Contact.createContact("Bob","734993")));
        System.out.println(mikolajphone.addNewContact(Contact.createContact("Bob","734993")));
        mikolajphone.printContacts();


    }
}