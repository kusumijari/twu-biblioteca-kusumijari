package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MovieLibraryTest {

    @Test
    public void shouldListTheMovieNames() {
        MovieLibrary movieLibrary = new MovieLibrary();

        assertEquals("Name\t\tYear\t\tDirector\t\tRating\nInception\t\t2010\t\tChristopher Nolan\t\t8.8\nInterstellar\t\t2014\t\tChristopher Nolan\t\tunrated\n", movieLibrary.toString());
    }

    @Test
    public void shouldRemoveASpecifiedMovieFromTheLibrary() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Movie movie = new Movie("Inception", 0, "director", "0");

        assertTrue(movieLibrary.removeMovie(movie));
    }

    @Test
    public void shouldCheckThatASpecifiedMovieInTheLibraryExists() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Movie movie = new Movie("Inception", 0, "director", "0");

        assertTrue(movieLibrary.removeMovie(movie));
    }

    @Test
    public void shouldReturnFalseIfASpecifiedBookInTheDoesNotLibraryExist() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Movie movie = new Movie("Gone Girl", 0, "director", "0");

        assertFalse(movieLibrary.removeMovie(movie));
    }
}