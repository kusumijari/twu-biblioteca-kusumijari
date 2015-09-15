package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoginTest {

    @Test
    public void shouldAskForUsername() {
        Login login = new Login();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        login.acceptUsername(new ConsoleInput());

        assertEquals("Enter Username:\n", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void shouldAcceptUsernameFromUser() {
        Login login = new Login();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);

        when(mockConsoleInput.getInput()).thenReturn("123-4567");

        assertEquals("123-4567", login.acceptUsername(mockConsoleInput));
    }

 
}