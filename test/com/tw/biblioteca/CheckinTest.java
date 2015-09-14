package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckinTest {

    @Test
    public void shouldAcceptChoiceOfBookFromUser() {
        Library library = new Library();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Checkin checkin = new Checkin(library, mockConsoleInput);

        when(mockConsoleInput.getInput()).thenReturn("Harry Potter");

        assertEquals("Harry Potter", checkin.acceptBookChoice());
    }

    @Test
    public void shouldCheckIfTheBookIsInTheCheckedOutList() {
        Library library = new Library();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        Checkin checkin = new Checkin(library, mockConsoleInput);
        Book bookToBeReturned = new Book("Harry Potter", "author", 0);

        when(mockConsoleInput.getInput()).thenReturn("Harry Potter");
        library.removeBook(bookToBeReturned);

        assertTrue(checkin.hasBeenReturned(bookToBeReturned));
    }
}