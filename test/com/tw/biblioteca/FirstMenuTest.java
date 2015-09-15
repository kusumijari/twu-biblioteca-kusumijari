package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstMenuTest {

    @Test
    public void shouldReturnTheAvailableMenu() {
        FirstMenu firstMenu = new FirstMenu();

        assertEquals("FirstMenu\nList Books\nList Movies\nCheckout Movie\nLogin\nExit\n", firstMenu.toString());
    }

}