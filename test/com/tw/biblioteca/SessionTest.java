package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SessionTest {

    @Test
    public void shouldGetTheSessionDetails() {
        Session session = new Session(new User("Customer", "123-4567", "somepassword", "abc", "abc@mail.com", 12345));

        assertEquals(User.class, session.getUser().getClass());
    }

    @Test
    public void shouldSetTheSessionDetails() {
        Session session = new Session(new User("Customer", "123-4567", "somepassword", "abc", "abc@mail.com", 12345));
        User user = new User("Librarian", "111-1111", "password2", "abc", "abc@mail.com", 12345);

        assertEquals(user, session.setUser(user));
    }
}