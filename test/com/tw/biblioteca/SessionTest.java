package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SessionTest {

    @Test
    public void shouldGetTheSessionDetails() {
        Session session = new Session(new User("Customer", "123-4567", "somepassword"));

        assertEquals(User.class, session.getUser());
    }
}