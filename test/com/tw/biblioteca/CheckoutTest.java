package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;


public class CheckoutTest {

    @Test
    public void shouldAcceptChoiceOfBookFromTheUser() {
        Library library = new Library();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Checkout checkout = new Checkout(library, mockConsoleInput);

        when(mockConsoleInput.getInput()).thenReturn("Harry Potter");

        assertEquals("Harry Potter", checkout.acceptBookChoice());
    }

    @Test
    public void shouldReturnTrueIfTheBookExists() {
        Library library = new Library();
        ConsoleInput mockConsoleInput = new ConsoleInput();
        Checkout checkout = new Checkout(library, mockConsoleInput);
        Book book = new Book("Harry Potter", "author", 0);

        assertTrue(checkout.hasBeenCheckedOut(book));
    }

    @Test
    public void shouldReturnFalseIfTheBookDoesntExist() {
        Library library = new Library();
        ConsoleInput mockConsoleInput = new ConsoleInput();
        Checkout checkout = new Checkout(library, mockConsoleInput);
        Book book = new Book("Inferno", "author", 0);

        assertFalse(checkout.hasBeenCheckedOut(book));
    }


    @Test
    public void shouldReturnSuccessMessageIfBookIsAvailable() {
        Library library = mock(Library.class);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Checkout checkout = new Checkout(library, mockConsoleInput);
        Checkout spy = spy(checkout);
        when(spy.acceptBookChoice()).thenReturn("Harry Potter");
        when(library.removeBook(any(Book.class))).thenReturn(true);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkout.execute();

        assertEquals("Thank you! Enjoy the book.\n", outContent.toString());
        System.setOut(System.out);
    }


    @Test
    public void shouldReturnUnsuccessMessageIfBookIsUnavailable() {
        Library library = mock(Library.class);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Checkout checkout = new Checkout(library, mockConsoleInput);
        Checkout spy = spy(checkout);
        when(spy.acceptBookChoice()).thenReturn("Inferno");
        when(library.removeBook(any(Book.class))).thenReturn(false);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkout.execute();

        assertEquals("That book is not available.\n", outContent.toString());
        System.setOut(System.out);
    }
}