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
}