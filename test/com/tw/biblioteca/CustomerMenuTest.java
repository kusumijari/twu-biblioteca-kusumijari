package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerMenuTest {


    @Test
    public void shouldReturnTheAvailableMenu() {
        CustomerMenu customerMenu = new CustomerMenu();

        assertEquals("Customer Menu\nList Books\nList Movies\nCheckout Movie\nCheckout Book\nCheckin Book\nLogout\nExit\n", customerMenu.toString());
    }
}