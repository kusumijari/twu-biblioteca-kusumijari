package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

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

}