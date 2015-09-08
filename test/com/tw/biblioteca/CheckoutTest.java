package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CheckoutTest {

    @Test
    public void shouldAcceptChoiceOfBookFromTheUser() {
        Library library = new Library();
        Checkout checkout = new Checkout(library);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        when(mockConsoleInput.getInput()).thenReturn("Harry Potter");
        assertEquals("Harry Potter", checkout.acceptBookChoice(mockConsoleInput));
    }

    @Test
    public void shouldReturnTrueIfTheBookExists() {
        Library library = new Library();
        Checkout checkout = new Checkout(library);
        Book book = new Book("Harry Potter", "author", 0);

        assertTrue(checkout.hasBeenCheckedOut(book));
    }

    @Test
    public void shouldReturnFalseIfTheBookDoesntExist() {
        Library library = new Library();
        Checkout checkout = new Checkout(library);
        Book book = new Book("Inferno", "author", 0);

        assertFalse(checkout.hasBeenCheckedOut(book));
    }
}