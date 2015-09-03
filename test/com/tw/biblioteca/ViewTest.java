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
    public void shouldShowDisplayNothingWhenThereIsNoList() {
        View view = new View(" ");

        assertEquals(" ", view.showBookList());
    }

    @Test
    public void shouldDisplayTheBookList() {
        View view = new View("Harry Potter and the Sorcerer's Stone");

        assertEquals("Harry Potter and the Sorcerer's Stone", view.showBookList());
    }
}