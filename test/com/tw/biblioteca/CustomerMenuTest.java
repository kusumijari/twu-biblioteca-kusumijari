package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerMenuTest {


    @Test
    public void shouldReturnTheAvailableMenu() {
        CustomerMenu customerMenu = new CustomerMenu();

        assertEquals("User Menu\nList Books\nList Movies\nCheckout Movie\nCheckout Book\nCheckin Book\nExit\n", customerMenu.toString());
    }
}