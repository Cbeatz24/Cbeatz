package com.zoo;

public class Bird extends Animal {

    public Bird(String name, int age, String gender) {
        super(name, age, gender);
    }

    private int wingspan;
    private String country;

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
