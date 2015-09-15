package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AuthenticatorTest {

    @Test
    public void shouldReturnTrueIfUsernameIsValid() {
        Authenticator authenticator =  new Authenticator(new User("role", "123-4567", "password"));

        assertTrue(authenticator.authenticate());
    }

    @Test
    public void shouldCheckIftheUsernameIsInvalid() {
        Authenticator authenticator =  new Authenticator(new User("role", "123-4568", "password"));

        assertFalse(authenticator.authenticate());
    }


}