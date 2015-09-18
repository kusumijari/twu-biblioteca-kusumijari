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

    private static final String AUTHOR = "auhtor";
    private static final int YEAROFPUBLICATION = 0;

    @Test
    public void shouldAcceptChoiceOfBookFromTheUser() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Session session = new Session(new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345));
        CheckoutBook checkoutBook = new CheckoutBook(bookLibrary, mockConsoleInput, session);

        when(mockConsoleInput.getInput()).thenReturn("Harry Potter");

        assertEquals("Harry Potter", checkoutBook.acceptBookChoice());
    }

    @Test
    public void shouldReturnTrueIfTheBookExists() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput mockConsoleInput = new ConsoleInput();
        Session session = new Session(new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345));
        CheckoutBook checkoutBook = new CheckoutBook(bookLibrary, mockConsoleInput, session);
        Book book = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);

        assertTrue(checkoutBook.hasBeenRemoved(book));
    }

    @Test
    public void shouldReturnFalseIfTheBookDoesntExist() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput mockConsoleInput = new ConsoleInput();
        Session session = new Session(new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345));
        CheckoutBook checkoutBook = new CheckoutBook(bookLibrary, mockConsoleInput,session);
        Book book = new Book("Inferno",AUTHOR, YEAROFPUBLICATION);

        assertFalse(checkoutBook.hasBeenRemoved(book));
    }


    @Test
    public void shouldReturnSuccessMessageIfBookIsAvailable() {
        BookLibrary bookLibrary = mock(BookLibrary.class);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Session session = new Session(new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345));
        CheckoutBook checkoutBook = new CheckoutBook(bookLibrary, mockConsoleInput,session);
        CheckoutBook spy = spy(checkoutBook);
        when(spy.acceptBookChoice()).thenReturn("Harry Potter");
        when(bookLibrary.removeBook(any(Book.class), any(Session.class))).thenReturn(true);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkoutBook.execute();

        assertEquals("Enter the book you want to checkout:\nThank you! Enjoy the book.\n", outContent.toString());
        System.setOut(System.out);
    }


    @Test
    public void shouldReturnUnsuccessMessageIfBookIsUnavailable() {
        BookLibrary bookLibrary = mock(BookLibrary.class);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Session session = new Session(new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345));
        CheckoutBook checkoutBook = new CheckoutBook(bookLibrary, mockConsoleInput,session);
        CheckoutBook spy = spy(checkoutBook);
        when(spy.acceptBookChoice()).thenReturn("Inferno");
        when(bookLibrary.removeBook(any(Book.class), any(Session.class))).thenReturn(false);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkoutBook.execute();

        assertEquals("Enter the book you want to checkout:\nThat book is not available.\n", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void shouldDisplayThePromptMessageForCheckout() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Session session = new Session(new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345));
        CheckoutBook checkoutBook = new CheckoutBook(bookLibrary, mockConsoleInput, session);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkoutBook.checkoutChoicePrompt();

        assertEquals("Enter the book you want to checkout:\n", outContent.toString());
        System.setOut(System.out);
    }
}