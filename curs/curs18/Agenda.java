package curs.curs18;

import java.util.ArrayList;

public class Agenda {
    String nume;
    ArrayList<Contact> contacte = new ArrayList<>();

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
