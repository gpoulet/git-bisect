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

}