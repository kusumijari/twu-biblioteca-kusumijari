package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class UserDetailsTest {

    @Test
    public void shouldReceiveTheUserDetails() {
        User user = new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);
        UserDetails userDetails = new UserDetails(session);

        assertEquals("Name:abc\tEmail:abc@mail.com\tPhone Number:12345", userDetails.getDetails());
    }

    @Test
    public void shouldDisplayTheUserDetails() {

        User user = new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);
        UserDetails userDetails = new UserDetails(session);

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        userDetails.execute();

        assertEquals("Name:abc\tEmail:abc@mail.com\tPhone Number:12345 \n", outContent.toString());
        System.setOut(System.out);
    }
}