package com.mkpits.demo.dto;

public class AddressDto {

    private char addresstype;
    private String street;
    private  String city;
    private String state;
    private String country;

    public AddressDto(char addresstype, String street, String city, String state, String country) {
        this.addresstype = addresstype;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public char getAddresstype() {
        return addresstype;
    }

    public void setAddresstype(char addresstype) {
        this.addresstype = addresstype;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
