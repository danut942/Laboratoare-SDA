package com.example.javafxdemo28;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private StringProperty firstName = new SimpleStringProperty(this, "firstName","");

    //Return the firstName value
    public String getFirstName() {
        return firstName.get();
    }

    //Return the StringProperty object
    public StringProperty firstNameProperty() {
        return firstName;
    }

    //Set the firstName value
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
}
