package com.example.keycloakDemo.models;

public class Customer {

    private String id;
    private String name;
    private String address;
    private String serviceRendered;

    public Customer(String name, String address, String serviceRendered) {
        this.name = name;
        this.address = address;
        this.serviceRendered = serviceRendered;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServiceRendered() {
        return serviceRendered;
    }

    public void setServiceRendered(String serviceRendered) {
        this.serviceRendered = serviceRendered;
    }
}
