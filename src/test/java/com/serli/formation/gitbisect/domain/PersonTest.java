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
    public void test_firstName_and_lastname_constructor() {
        Person person = new Person("Gauthier", "Poulet");
        assertEquals("Gauthier", person.getFirstname());
        assertEquals("Poulet", person.getLastname());
    }

}