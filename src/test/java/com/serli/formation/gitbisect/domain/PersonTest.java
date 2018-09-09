package com.serli.formation.gitbisect.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void test_empty_constructor() {
        Person person = new Person();
        assertNull(person.getFirstname());
        assertNull(person.getLastname());
    }

    @Test
    public void test_empty_constructor_with_setters() {
        Person person = new Person();

        person.setFirstname("Alain");
        person.setFirstname("Chabat");

        assertEquals("Alain", person.getFirstname());
        assertEquals("Chabat", person.getLastname());
    }

    @Test
    public void test_firstname_and_lastname_constructor() {
        Person person = new Person("Gauthier", "Poulet");
        assertEquals("Gauthier", person.getFirstname());
        assertEquals("Poulet", person.getLastname());
    }

    @Test
    public void test_firstname_and_lastname_and_age_constructor() {
        Person person = new Person("Gauthier", "Poulet", "33");
        assertEquals("Gauthier", person.getFirstname());
        assertEquals("Poulet", person.getLastname());
        assertEquals("33", person.getAge());
    }

}