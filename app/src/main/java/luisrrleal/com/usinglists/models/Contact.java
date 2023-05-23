package luisrrleal.com.usinglists.models;

import java.util.ArrayList;
import java.util.List;

import luisrrleal.com.usinglists.R;

public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String facebook;
    private String instagram;
    private String twitter;
    private int photo;

    private static List<Contact> contacts = new ArrayList<>();

    static {
        addContact(new Contact(1, "Contacto 1", "LastName", "correo@contact.com",
                "461 123 4567", "Dirección 1", "https://facebook.com/contact1",
                "https://instagram.com/contact1", "https://twitter.com/contact1", R.drawable.photo_1));
        addContact(new Contact(2, "Contacto 2", "LastName", "correo@contact.com",
                "461 123 4567", "Dirección 2", "https://facebook.com/contact2",
                "https://instagram.com/contact2", "https://twitter.com/contact2", R.drawable.photo_2));
        addContact(new Contact(3, "Contacto 3", "LastName", "correo@contact.com",
                "461 123 4567", "Dirección 3", "https://facebook.com/contact3",
                "https://instagram.com/contact1", "https://twitter.com/contact1", R.drawable.photo_3));
        addContact(new Contact(4, "Contacto 4", "LastName", "correo@contact.com",
                "461 123 4567", "Dirección 4", "https://facebook.com/contact4",
                "https://instagram.com/contact4", "https://twitter.com/contact4", R.drawable.photo_4));
        addContact(new Contact(5, "Contacto 5", "LastName", "correo@contact.com",
                "461 123 4567", "Dirección 5", "https://facebook.com/contact5",
                "https://instagram.com/contact5", "https://twitter.com/contact5", R.drawable.photo_5));
    }

    public static void addContact(Contact c) {
        contacts.add(c);
    }

    public static List<Contact> getContacts() {
        return contacts;
    }

    public Contact() {
    }

    public Contact(int id, String firstName, String lastName, String email, String phone, String address, String facebook, String instagram, String twitter, int photo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.facebook = facebook;
        this.instagram = instagram;
        this.twitter = twitter;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}

