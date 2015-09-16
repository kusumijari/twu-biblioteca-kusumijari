package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;


public class CheckoutBookTest {

    @Test
    public void shouldAcceptChoiceOfBookFromTheUser() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Session session = new Session(new User("Customer", "123-4567", "password1"));
        CheckoutBook checkoutBook = new CheckoutBook(bookLibrary, mockConsoleInput, session);

        when(mockConsoleInput.getInput()).thenReturn("Harry Potter");

        assertEquals("Harry Potter", checkoutBook.acceptBookChoice());
    }

    @Test
    public void shouldReturnTrueIfTheBookExists() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput mockConsoleInput = new ConsoleInput();
        Session session = new Session(new User("Customer", "123-4567", "password1"));
        CheckoutBook checkoutBook = new CheckoutBook(bookLibrary, mockConsoleInput, session);
        Book book = new Book("Harry Potter", "author", 0);

        assertTrue(checkoutBook.hasBeenRemoved(book));
    }

    @Test
    public void shouldReturnFalseIfTheBookDoesntExist() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput mockConsoleInput = new ConsoleInput();
        Session session = new Session(new User("Customer", "123-4567", "password1"));
        CheckoutBook checkoutBook = new CheckoutBook(bookLibrary, mockConsoleInput,session);
        Book book = new Book("Inferno", "author", 0);

        assertFalse(checkoutBook.hasBeenRemoved(book));
    }


    @Test
    public void shouldReturnSuccessMessageIfBookIsAvailable() {
        BookLibrary bookLibrary = mock(BookLibrary.class);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Session session = new Session(new User("Customer", "123-4567", "password1"));
        CheckoutBook checkoutBook = new CheckoutBook(bookLibrary, mockConsoleInput,session);
        CheckoutBook spy = spy(checkoutBook);
        when(spy.acceptBookChoice()).thenReturn("Harry Potter");
        when(bookLibrary.removeBook(any(Book.class), session)).thenReturn(true);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkoutBook.execute();

        assertEquals("Thank you! Enjoy the book.\n", outContent.toString());
        System.setOut(System.out);
    }


    @Test
    public void shouldReturnUnsuccessMessageIfBookIsUnavailable() {
        BookLibrary bookLibrary = mock(BookLibrary.class);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Session session = new Session(new User("Customer", "123-4567", "password1"));
        CheckoutBook checkoutBook = new CheckoutBook(bookLibrary, mockConsoleInput,session);
        CheckoutBook spy = spy(checkoutBook);
        when(spy.acceptBookChoice()).thenReturn("Inferno");
        when(bookLibrary.removeBook(any(Book.class), session)).thenReturn(false);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkoutBook.execute();

        assertEquals("That book is not available.\n", outContent.toString());
        System.setOut(System.out);
    }
}