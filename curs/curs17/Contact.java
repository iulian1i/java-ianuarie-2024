package curs.curs17;

//-Create a contact list application where you can add, remove, and search for contacts by name.

import java.util.ArrayList;
import java.util.List;

class Contact {
    private String name;
    private String phoneNumber;

    public String getName() {
        return this.name;
    }

    ArrayList<Contact> contacte = new ArrayList<>();

    /**
     * constructor, getteri, setteri
     */

    public void addContact(Contact contact) {
        contacte.add(contact);
    }

    public void remove(String name) {
        for (int i = 0; i < contacte.size(); i++) {
            if (contacte.get(i).getName().equals(name)) {
                contacte.remove(i);
                break;
            }
        }
    }

    public Contact search(String name) {
        for (Contact contact : contacte) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

}