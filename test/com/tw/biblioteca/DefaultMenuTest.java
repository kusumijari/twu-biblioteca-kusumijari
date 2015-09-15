package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefaultMenuTest {

    @Test
    public void shouldReturnTheAvailableMenu() {
        DefaultMenu defaultMenu = new DefaultMenu();

        assertEquals("DefaultMenu\nList Books\nList Movies\nCheckout Movie\nLogin\nExit\n", defaultMenu.toString());
    }

}