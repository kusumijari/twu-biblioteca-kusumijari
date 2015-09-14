package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckoutMovieTest {
    @Test
    public void shouldAcceptChoiceOfBookFromTheUser() {
        MovieLibrary movieLibrary = new MovieLibrary();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        CheckoutMovie checkoutMovie = new CheckoutMovie(movieLibrary, mockConsoleInput);

        when(mockConsoleInput.getInput()).thenReturn("Inception");

        assertEquals("Inception", checkoutMovie.acceptMovieChoice());
    }

}