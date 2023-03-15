package org.example;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact>myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }
    public boolean addNewContact(Contact item) //check exist contact in arraylist
    {
        if(findContact(item)>=0)
            return false;
        else {
            this.myContacts.add(item);
            return true;
        }





    }
    public boolean updateContact(Contact oldContact,Contact newContact)
    {
        int var=this.myContacts.indexOf(oldContact);
        if(var>=0) {
            this.myContacts.set(var,newContact);
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean removeContact(Contact delContact)
    {
        if(this.myContacts.contains(delContact)) {
            this.myContacts.remove(delContact);
            return true;
        }
        else
        {
            return false;
        }
    }
    public int findContact(Contact item)
    {
        for(int i=0;i<this.myContacts.size();i++)
        {
            if(this.myContacts.get(i).getPhoneNumber()==item.getPhoneNumber() && this.myContacts.get(i).getName()==item.getName())
                return i;
        }
        return -1;
    }
    public int findContact(String item) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            if(this.myContacts.get(i).getPhoneNumber()==item || this.myContacts.get(i).getName()==item)
                return i;
        }
        return -1;
    }
    public Contact queryContact(String item) {
        for (Contact myContact : this.myContacts) {
            if (item.equals(myContact.getName())) {
                return myContact;
            }

        }
        return null;
    }
    public void printContacts()
    {
        for (int i=0;i<this.myContacts.size();i++)
        {
            System.out.println(i+1+". "+this.myContacts.get(i).getName()+"->"+this.myContacts.get(i).getPhoneNumber());
        }
        /*
        for (Contact myContact : this.myContacts)
        {
            System.out.println(myContact.getName()+"->"+myContact.getPhoneNumber());
        }
         */
    }
}
