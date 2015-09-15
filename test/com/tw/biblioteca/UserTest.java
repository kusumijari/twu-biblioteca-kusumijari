package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UserTest {

    @Test
    public void shouldBeEqualToItself() {
        User user = new User("User", "abc", "123-4567", "password");

        assertEquals(user, user);
    }

    @Test
    public void shouldNotBeEqualToNull() {
        User user = new User("User", "abc", "123-4567", "password");

        assertNotEquals(user, null);
    }

    @Test
    public void shouldNotBeEqualToAnyOtherObject() {
        User user = new User("User", "abc", "123-4567", "password");

        assertNotEquals(user, "not a user");
    }


}