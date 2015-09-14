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

public class CheckinTest {

    @Test
    public void shouldAcceptChoiceOfBookFromUser() {
        Library library = new Library();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Checkin checkin = new Checkin(library, mockConsoleInput);

        when(mockConsoleInput.getInput()).thenReturn("Harry Potter");

        assertEquals("Harry Potter", checkin.bookChoice());
    }

    @Test
    public void shouldReturnTrueIfTheBookIsInTheCheckedOutList() {
        Library library = new Library();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Checkin checkin = new Checkin(library, mockConsoleInput);
        Book bookToBeReturned = new Book("Harry Potter", "author", 0);

        when(mockConsoleInput.getInput()).thenReturn("Harry Potter");
        library.removeBook(bookToBeReturned);

        assertTrue(checkin.hasBeenReturned(bookToBeReturned));
    }

    @Test
    public void shouldReturnFalseIfTheBookIsNotInTheCheckedOutList() {
        Library library = new Library();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Checkin checkin = new Checkin(library, mockConsoleInput);
        Book bookToBeReturned = new Book("Inferno", "author", 0);

        when(mockConsoleInput.getInput()).thenReturn("Inferno");
        library.removeBook(bookToBeReturned);

        assertFalse(checkin.hasBeenReturned(bookToBeReturned));
    }

    @Test
    public void shouldReturnSuccessfulMessageIfTheReturnWasSuccessful() {
        Library library = mock(Library.class);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Checkin checkin = new Checkin(library, mockConsoleInput);
        Checkin spy = spy(checkin);
        when(spy.bookChoice()).thenReturn("Harry Potter");
        when(library.returnBook(any(Book.class))).thenReturn(true);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkin.execute();

        assertEquals("Thank you for returning the book.\n", outContent.toString());
        System.setOut(System.out);
    }
}