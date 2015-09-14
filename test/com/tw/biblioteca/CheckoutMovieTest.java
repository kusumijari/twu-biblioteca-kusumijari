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

    @Test
    public void shouldReturnSuccessMessageIfMovieIsAvailable() {
        MovieLibrary movieLibrary = mock(MovieLibrary.class);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        CheckoutMovie checkoutMovie= new CheckoutMovie(movieLibrary, mockConsoleInput);
        CheckoutMovie spy = spy(checkoutMovie);
        when(spy.acceptMovieChoice()).thenReturn("Inception");
        when(movieLibrary.removeMovie(any(Movie.class))).thenReturn(true);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkoutMovie.execute();

        assertEquals("Thank you! Enjoy the movie.\n", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void shouldReturnUnsuccessfulMessageIfMovieIsUnavailable() {
        MovieLibrary movieLibrary = mock(MovieLibrary.class);
        ConsoleInput mockConsoleInput = mock(ConsoleInput.class);
        CheckoutMovie checkoutMovie= new CheckoutMovie(movieLibrary, mockConsoleInput);
        CheckoutMovie spy = spy(checkoutMovie);
        when(spy.acceptMovieChoice()).thenReturn("Gone Girl");
        when(movieLibrary.removeMovie(any(Movie.class))).thenReturn(false);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        checkoutMovie.execute();

        assertEquals("That is not a valid movie option.\n", outContent.toString());
        System.setOut(System.out);
    }
}