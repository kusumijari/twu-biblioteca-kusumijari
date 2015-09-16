package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class LogoutTest {

    @Test
    public void shouldSetTheSessionUserRoleTodefault(){
        User user = new User("Customer", "123-4567", "password1");
        Logout logout = new Logout(new Session(user));

        User newUser = new User("default", "nousername", "nopassword");
        assertEquals(newUser, logout.stopSession());
    }

    @Test
    public void shouldDisplaySuccessfullLogoutMessage() {
        Logout logout = new Logout(new Session(new User("Customer", "123-4567", "password1")));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        logout.execute();

        assertEquals("Successful Logout.\n", outContent.toString());
        System.setOut(System.out);
    }

}