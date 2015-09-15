package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void shouldBeEqualToItself() {
        User user = new User("User", "abc", "123-4567", "password");

        assertEquals(user, user);
    }
}