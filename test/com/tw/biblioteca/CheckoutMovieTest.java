package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckoutMovieTest {

    @Test
    public void shouldAcceptChoiceOfMovieFromTheUser() {
        MovieLibrary movieLibrary = new MovieLibrary();
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        CheckoutMovie checkoutMovie = new CheckoutMovie(movieLibrary, mockConsoleInput);

        when(mockConsoleInput.getInput()).thenReturn("Inception");

        assertEquals("Inception", checkoutMovie.acceptMovieChoice());
    }

    @Test
    public void shouldReturnTrueIfTheMovieExists() {
        MovieLibrary movieLibrary = new MovieLibrary();
        ConsoleInput mockConsoleInput = new ConsoleInput();
        CheckoutMovie checkoutMovie = new CheckoutMovie(movieLibrary, mockConsoleInput);
        Movie movie = new Movie("Inception", 0, "director", "0");

        assertTrue(checkoutMovie.hasBeenRemoved(movie));
    }

    @Test
    public void shouldReturnFalseIfTheMovieDoesntExist() {
        MovieLibrary movieLibrary = new MovieLibrary();
        ConsoleInput mockConsoleInput = new ConsoleInput();
        CheckoutMovie checkoutMovie = new CheckoutMovie(movieLibrary, mockConsoleInput);
        Movie movie = new Movie("Gone Girl", 0, "director", "0");

        assertFalse(checkoutMovie.hasBeenRemoved(movie));
    }

}