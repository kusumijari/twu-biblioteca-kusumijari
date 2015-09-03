package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViewTest {

    @Test
    public void shouldShowWelcomeMessage() {
        View view = new View("Hello!Welcome to biblioteca");

        assertEquals("Hello!Welcome to biblioteca", view.welcomeMesasge());
    }

    @Test
    public void shouldDisplayTheBookList() {
        View view = new View("Showing book list");

        assertEquals("Harry Potter"+"Tale of Two Cities", view.showBookList());
    }

}