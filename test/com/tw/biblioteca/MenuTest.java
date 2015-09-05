package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    @Test
    public void shouldReturnTheAvailableMenu() {
        Menu menu = new Menu();

        assertEquals("Menu\n1. List Books\n", menu.toString());
    }

    @Test
    public void shouldPerformTheAppropriateMenuFunction() {
        Menu menu = new Menu();

        assertEquals("Name\tAuthor\tYear\nHarry Potter\tJ. K. Rowling\t1997\nTale of Two Cities\tCharles Dickens\t1859\n", menu.callFunction("1"));
    }
}