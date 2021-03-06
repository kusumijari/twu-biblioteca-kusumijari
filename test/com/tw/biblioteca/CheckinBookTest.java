package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class CheckinBookTest {

    private static final String AUTHOR = "auhtor";
    private static final int YEAROFPUBLICATION = 0;
    
    @Test
    public void shouldAcceptChoiceOfBookFromUser() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);
        CheckinBook checkinBook = new CheckinBook(bookLibrary, mockConsoleInput, session);

        when(mockConsoleInput.getInput()).thenReturn("Harry Potter");

        assertEquals("Harry Potter", checkinBook.bookChoice());
    }

    @Test
    public void shouldReturnTrueIfTheBookIsInTheCheckedOutList() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);
        CheckinBook checkinBook = new CheckinBook(bookLibrary, mockConsoleInput, session);
        Book bookToBeReturned = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);

        when(mockConsoleInput.getInput()).thenReturn("Harry Potter");
        bookLibrary.removeBook(bookToBeReturned, session);

        assertTrue(checkinBook.hasBeenReturned(bookToBeReturned));
    }

    @Test
    public void shouldReturnFalseIfTheBookIsNotInTheCheckedOutList() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);
        CheckinBook checkinBook = new CheckinBook(bookLibrary, mockConsoleInput, session);
        Book bookToBeReturned = new Book("Inferno", AUTHOR, YEAROFPUBLICATION);


        when(mockConsoleInput.getInput()).thenReturn("Inferno");
        bookLibrary.removeBook(bookToBeReturned, session);

        assertFalse(checkinBook.hasBeenReturned(bookToBeReturned));
    }

    @Test
    public void shouldReturnSuccessfulMessageIfTheReturnWasSuccessful() {
        BookLibrary bookLibrary = mock(BookLibrary.class);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);
        CheckinBook checkinBook = new CheckinBook(bookLibrary, mockConsoleInput, session);
        CheckinBook spy = spy(checkinBook);
        when(spy.bookChoice()).thenReturn("Harry Potter");
        when(bookLibrary.returnBook(any(Book.class), any(Session.class))).thenReturn(true);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkinBook.execute();

        assertEquals("Enter the book you want to check in:\nThank you for returning the book.\n", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void shouldReturnUnsuccessfulMessageIfTheReturnWasUnuccessful() {
        BookLibrary bookLibrary = mock(BookLibrary.class);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);
        CheckinBook checkinBook = new CheckinBook(bookLibrary, mockConsoleInput, session);
        CheckinBook spy = spy(checkinBook);
        when(spy.bookChoice()).thenReturn("Inferno");
        when(bookLibrary.returnBook(any(Book.class), any(Session.class))).thenReturn(false);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkinBook.execute();

        assertEquals("Enter the book you want to check in:\nThat is not a valid book to return.\n", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void shouldDisplayMessageToAskForCheckoutBook() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput consoleInput = new ConsoleInput();
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);
        CheckinBook checkinBook = new CheckinBook(bookLibrary, consoleInput, session);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkinBook.checkinChoicePrompt();

        assertEquals("Enter the book you want to check in:\n", outContent.toString());
        System.setOut(System.out);

    }
}