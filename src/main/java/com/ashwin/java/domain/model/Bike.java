package com.ashwin.java.domain.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

//@JsonTypeName("bike")
public class Bike extends Vehicle {
    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                '}';
    }
}
