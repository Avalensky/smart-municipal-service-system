package model;

public class Citizen extends Person {

    private String phoneNumber;

    public Citizen() {
    }

    public Citizen(String name,
                   String email,
                   String phoneNumber) {

        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}