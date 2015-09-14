package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    @Test
    public void shouldReturnTheAvailableMenu() {
        Menu menu = new Menu();

        assertEquals("Menu\n1. List Books\n2. Checkout Book\n3. Return Book\n4. List Movies\n5. Exit\n", menu.toString());
    }

}