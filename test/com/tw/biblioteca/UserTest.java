package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldBeEqualToItself() {
        User user = new User("Customer", "123-4567", "password");

        assertEquals(user, user);
    }

    @Test
    public void shouldNotBeEqualToNull() {
        User user = new User("Customer", "123-4567", "password");

        assertNotEquals(user, null);
    }

    @Test
    public void shouldNotBeEqualToAnyOtherObject() {
        User user = new User("Customer", "123-4567", "password");

        assertNotEquals(user, "not a user");
    }


    @Test
    public void shouldBeEqualToAnotherUserWithSameUsername() {
        User user1 = new User("Customer", "123-4567", "password");
        User user2 = new User("Customer", "123-4567", "password");

        assertEquals(user1, user2);
    }

    @Test
    public void shouldNotBeEqualToAnotherUserWithDifferentUsername() {
        User user1 = new User("Customer", "123-4568", "password");
        User user2 = new User("Customer", "123-4567", "password");

        assertNotEquals(user1, user2);
    }

    @Test
    public void shouldGetTheRoleOfTheUser() {
        User user = new User("Customer", "123-4567", "password");

        assertEquals("Customer", user.getRole());
    }

    @Test
    public void shouldHaveSameHashCodeForEqualUsers () {
        User user1 = new User("Customer", "123-4568", "password");
        User user2 = new User("Customer", "123-4568", "password");

        assertEquals(user1.hashCode(), user2.hashCode());

    }

    @Test
    public void shouldReturnTrueIfPasswordIsCorrect() {
        User user1 = new User("Customer", "123-4567", "password");
        User user2 = new User("Customer", "123-4567", "password");

        assertTrue(user1.authenticatePassword(user2));
    }


    @Test
    public void shouldReturnFalseIfPasswordIsIncorrect() {
        User user1 = new User("Customer", "123-4567", "password");
        User user2 = new User("Customer", "123-4567", "password1");

        assertFalse(user1.authenticatePassword(user2));
    }
}