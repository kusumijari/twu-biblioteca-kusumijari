package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SessionTest {

    @Test
    public void shouldGetTheSessionDetails() {
        Session session = new Session(new User("Customer", "123-4567", "somepassword"));

        assertEquals(User.class, session.getUser().getClass());
    }

    @Test
    public void shouldSetTheSessionDetails() {
        Session session = new Session(new User("Customer", "123-4567", "somepassword"));
        User user = new User("Librarian", "111-1111", "password2");

        assertTrue(session.setUser(user));
    }
}