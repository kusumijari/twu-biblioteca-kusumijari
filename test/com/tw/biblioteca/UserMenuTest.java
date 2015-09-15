package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserMenuTest {


    @Test
    public void shouldReturnTheAvailableMenu() {
        UserMenu userMenu = new UserMenu();

        assertEquals("User Menu\nList Books\nList Movies\nCheckout Movie\nCheckout Book\nCheckin Book\nExit\n", userMenu.toString());
    }
}