package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibrarianMenuTest {

    @Test
    public void shouldReturnTheAvailableMenu() {
        LibrarianMenu librarianMenu = new LibrarianMenu();

        assertEquals("Librarian Menu\nList Books\nList Movies\nCheckout Movie\nCheckout Book\nCheckin Book\nBook Details\nLogout\nExit\n", librarianMenu.toString());
    }
}