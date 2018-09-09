package com.serli.formation.gitbisect.domain;

public class Person {

    private String surname;

    private String lastname;

    public Person(String surname, String lastname) {
        this.surname = surname;
        this.lastname = lastname;
    }

    public Person(String surname) {
        this.surname = surname;
    }
    
    public Person() {}

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }
}
