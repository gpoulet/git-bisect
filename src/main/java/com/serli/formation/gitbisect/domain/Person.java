package com.serli.formation.gitbisect.domain;

public class Person {

    private String firstname;

    private String lastname;

    private Integer age;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Person(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname) {
        this.firstname = firstname;
    }

    public Person() {}

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
