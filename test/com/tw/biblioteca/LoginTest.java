package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoginTest {

    @Test
    public void shouldAcceptUsernameFromUser() {
        Login login = new Login(new ConsoleInput(), new ConsoleInput(), new Session(new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345)));
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);

        when(mockConsoleInput.getInput()).thenReturn("123-4567");

        assertEquals("123-4567", login.acceptUsername(mockConsoleInput));
    }

    @Test
    public void shouldAcceptPasswordFromUser() {
        Login login = new Login(new ConsoleInput(), new ConsoleInput(), new Session(new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345)));
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);

        when(mockConsoleInput.getInput()).thenReturn("password");

        assertEquals("password", login.acceptPassword(mockConsoleInput));
    }

    @Test
    public void shouldReturnTrueIfUsernamAndPasswordIsAuthenticated() {
        ConsoleInput mockConsoleInput1 = mock(ConsoleInput.class);
        ConsoleInput mockConsoleInput2 = mock(ConsoleInput.class);
        Login login = new Login(mockConsoleInput1, mockConsoleInput2,  new Session((new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345))));

        when(mockConsoleInput1.getInput()).thenReturn("123-4567");
        when(mockConsoleInput2.getInput()).thenReturn("password1");

        login.acceptUsername(mockConsoleInput1);

        login.acceptPassword(mockConsoleInput2);

        assertTrue(login.authenticate());
    }

    @Test
    public void shouldDisplaySuccessfulMessageIfLoginIsSuccessful() {
        ConsoleInput mockConsoleInput1 = mock(ConsoleInput.class);
        ConsoleInput mockConsoleInput2 = mock(ConsoleInput.class);
        Login login = new Login(mockConsoleInput1, mockConsoleInput2,  new Session((new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345))));

        when(mockConsoleInput1.getInput()).thenReturn("123-4567");
        when(mockConsoleInput2.getInput()).thenReturn("password1");

        login.acceptUsername(mockConsoleInput1);

        login.acceptPassword(mockConsoleInput2);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        login.execute();

        assertEquals("Successful Login\n", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void shouldDisplayUnsuccessfulMessageIfLoginIsUnsccessful() {
        ConsoleInput mockConsoleInput1 = mock(ConsoleInput.class);
        ConsoleInput mockConsoleInput2 = mock(ConsoleInput.class);
        Login login = new Login(mockConsoleInput1, mockConsoleInput2,  new Session((new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345))));

        when(mockConsoleInput1.getInput()).thenReturn("123-4567");
        when(mockConsoleInput2.getInput()).thenReturn("password");

        login.acceptUsername(mockConsoleInput1);

        login.acceptPassword(mockConsoleInput2);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        login.execute();

        assertEquals("Login failed\n", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void shouldCreateSessionObjectIfUsernameAndPasswordAreAuthenticated() {
        ConsoleInput mockConsoleInput1 = mock(ConsoleInput.class);
        ConsoleInput mockConsoleInput2 = mock(ConsoleInput.class);
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Login login = new Login(mockConsoleInput1, mockConsoleInput2,  new Session(user));

        when(mockConsoleInput1.getInput()).thenReturn("123-4567");

        login.acceptUsername(mockConsoleInput1);
        login.authenticate();

        assertEquals(user, login.startSession());
    }
}