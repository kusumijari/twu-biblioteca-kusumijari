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

    @Test
    public void shouldAcceptChoiceOfBookFromUser() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        CheckinBook checkinBook = new CheckinBook(bookLibrary, mockConsoleInput);

        when(mockConsoleInput.getInput()).thenReturn("Harry Potter");

        assertEquals("Harry Potter", checkinBook.bookChoice());
    }

    @Test
    public void shouldReturnTrueIfTheBookIsInTheCheckedOutList() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        CheckinBook checkinBook = new CheckinBook(bookLibrary, mockConsoleInput);
        Book bookToBeReturned = new Book("Harry Potter", "author", 0);

        when(mockConsoleInput.getInput()).thenReturn("Harry Potter");
        Session session = new Session(new User("Customer", "123-4567", "password1"));
        bookLibrary.removeBook(bookToBeReturned, session);

        assertTrue(checkinBook.hasBeenReturned(bookToBeReturned));
    }

    @Test
    public void shouldReturnFalseIfTheBookIsNotInTheCheckedOutList() {
        BookLibrary bookLibrary = new BookLibrary();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        CheckinBook checkinBook = new CheckinBook(bookLibrary, mockConsoleInput);
        Book bookToBeReturned = new Book("Inferno", "author", 0);
        Session session = new Session(new User("Customer", "123-4567", "password1"));


        when(mockConsoleInput.getInput()).thenReturn("Inferno");
        bookLibrary.removeBook(bookToBeReturned, session);

        assertFalse(checkinBook.hasBeenReturned(bookToBeReturned));
    }

    @Test
    public void shouldReturnSuccessfulMessageIfTheReturnWasSuccessful() {
        BookLibrary bookLibrary = mock(BookLibrary.class);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        CheckinBook checkinBook = new CheckinBook(bookLibrary, mockConsoleInput);
        CheckinBook spy = spy(checkinBook);
        when(spy.bookChoice()).thenReturn("Harry Potter");
        when(bookLibrary.returnBook(any(Book.class))).thenReturn(true);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkinBook.execute();

        assertEquals("Thank you for returning the book.\n", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void shouldReturnUnsuccessfulMessageIfTheReturnWasUnuccessful() {
        BookLibrary bookLibrary = mock(BookLibrary.class);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        CheckinBook checkinBook = new CheckinBook(bookLibrary, mockConsoleInput);
        CheckinBook spy = spy(checkinBook);
        when(spy.bookChoice()).thenReturn("Inferno");
        when(bookLibrary.returnBook(any(Book.class))).thenReturn(false);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkinBook.execute();

        assertEquals("That is not a valid book to return.\n", outContent.toString());
        System.setOut(System.out);
    }
}