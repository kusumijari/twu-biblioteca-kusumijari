package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoginTest {

    @Test
    public void shouldAcceptUsernameFromUser() {
        Login login = new Login();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);

        when(mockConsoleInput.getInput()).thenReturn("123-4567");

        assertEquals("123-4567", login.acceptUsername(mockConsoleInput));
    }

    @Test
    public void shouldAcceptPasswordFromUser() {
        Login login = new Login();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);

        when(mockConsoleInput.getInput()).thenReturn("password");

        assertEquals("password", login.acceptPassword(mockConsoleInput));
    }

    @Test
    public void shouldReturnTrueIfTheEnteredUsernameIsAValidUsername() {
        Login login = new Login();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);

        when(mockConsoleInput.getInput()).thenReturn("123-4567", "password");

        assertTrue(login.authenticate());
    }
}