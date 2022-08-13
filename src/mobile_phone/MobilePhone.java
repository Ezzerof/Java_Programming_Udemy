package mobile_phone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        boolean exists = false;
        if (findContact(contact) >= 0) {
            System.out.println("Contact already exists.");
            return exists;
        }
        myContacts.add(contact);
        System.out.printf("Contact %s was created.\n", contact.getName());

        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) >= 0) {
            int index = findContact(oldContact);
            myContacts.set(index, newContact);
            System.out.println("Contact was updated successfully.");
            return true;
        }
        System.out.println("Contact does not exists");
        return false;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact.getName());
        if (position >= 0) {
            myContacts.remove(position);
            System.out.printf("Contact %s was removed successfully.\n", contact.getName());
            return true;
        }
        System.out.println("Contact does not exists");
        return false;
    }

    public boolean removeContact(int num) {
        if (num >= 0) {
            myContacts.remove(num);
            System.out.printf("Contact %s was removed successfully.\n", myContacts.get(num).getName());
            return true;
        }
        System.out.println("Contact does not exists");
        return false;
    }

    public int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(name)){
                return myContacts.indexOf(contact);
            } else if (contact.getPhoneNumber().equals(name)) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }
}
