package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
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
}