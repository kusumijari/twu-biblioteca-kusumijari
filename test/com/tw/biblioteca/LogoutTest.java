package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LogoutTest {

    @Test
    public void shouldSetTheSessionUserRoleTodefault(){
        Logout logout = new Logout(new Session(new User("Customer", "123-4567", "password1")));

        assertTrue(logout.stopSession());
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