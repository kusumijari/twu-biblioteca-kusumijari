package com.tw.biblioteca;

import org.junit.Test;

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
    public void shouldReturnNewBookList() {
        Library library = new Library();
        Checkout checkout = new Checkout(library);

        assertEquals("Name\tAuthor\tYear\nHarry Potter\tJ. K. Rowling\t1997\nTale of Two Cities\tCharles Dickens\t1859\n", checkout.receiveNewBookList());
    }
}