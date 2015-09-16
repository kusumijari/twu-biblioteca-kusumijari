package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserDetailsTest {

    @Test
    public void shouldReceiveTheUserDetails() {
        User user = new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);
        UserDetails userDetails = new UserDetails(session);

        assertEquals("Name:abc\tEmail:abc@mail.com\tPhone Number:12345", userDetails.getDetails());
    }
}