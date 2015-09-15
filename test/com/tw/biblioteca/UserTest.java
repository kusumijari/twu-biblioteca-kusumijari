package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UserTest {

    @Test
    public void shouldBeEqualToItself() {
        User user = new User("User", "123-4567", "password");

        assertEquals(user, user);
    }

    @Test
    public void shouldNotBeEqualToNull() {
        User user = new User("User", "123-4567", "password");

        assertNotEquals(user, null);
    }

    @Test
    public void shouldNotBeEqualToAnyOtherObject() {
        User user = new User("User", "123-4567", "password");

        assertNotEquals(user, "not a user");
    }


    @Test
    public void shouldBeEqualToAnotherUserWithSameUsernameAndSamePassword() {
        User user1 = new User("User", "123-4567", "password");
        User user2 = new User("User", "123-4567", "password");

        assertEquals(user1, user2);
    }

    @Test
    public void shouldNotBeEqualToAnotherUserWithDifferentUsernameAndSamePassword() {
        User user1 = new User("User", "123-4568", "password");
        User user2 = new User("User", "123-4567", "password");

        assertNotEquals(user1, user2);
    }

    @Test
    public void shouldNotBeEqualToAnotherUserWithDifferentUsernameAndDifferentPassword() {
        User user1 = new User("User", "123-4568", "password1");
        User user2 = new User("User", "123-4567", "password");

        assertNotEquals(user1, user2);
    }

    @Test
    public void shouldNotBeEqualToAnotherUserWithSameUsernameAndDifferentPassword() {
        User user1 = new User("User", "123-4567", "password1");
        User user2 = new User("User", "123-4567", "password");

        assertNotEquals(user1, user2);
    }

    @Test
    public void shouldGetTheRoleOfTheUser() {
        User user = new User("User", "123-4567", "password");

        assertEquals("User", user.getUser());
    }

    
}