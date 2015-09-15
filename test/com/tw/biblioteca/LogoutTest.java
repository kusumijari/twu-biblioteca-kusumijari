package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LogoutTest {

    @Test
    public void shouldSetTheSessionUserRoleTodefault(){
        Logout logout = new Logout(new Session(new User("Customer", "123-4567", "password1")));

        assertTrue(logout.stopSession());
    }

}