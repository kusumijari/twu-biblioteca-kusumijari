package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieLibraryTest {


    private static final int YEAR = 0;
    private static final String DIRECTOR = "director";
    private static final String RATING = "rating";

    @Test
    public void shouldListTheMovieNames() {
        MovieLibrary movieLibrary = new MovieLibrary();

        assertEquals("Name\t\tYear\t\tDirector\t\tRating\nInception\t\t2010\t\tChristopher Nolan\t\t8.8\nInterstellar\t\t2014\t\tChristopher Nolan\t\tunrated\n", movieLibrary.toString());
    }

    @Test
    public void shouldRemoveASpecifiedMovieFromTheLibrary() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Movie movie = new Movie("Inception", 2010, "Christopher Nolan", "8.8");

        assertTrue(movieLibrary.removeMovie(movie));
    }

    @Test
    public void shouldCheckThatASpecifiedMovieInTheLibraryExists() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Movie movie = new Movie("Inception", 2010, "Christopher Nolan", "8.8");

        assertTrue(movieLibrary.removeMovie(movie));
    }

    @Test
    public void shouldReturnFalseIfASpecifiedBookInTheDoesNotLibraryExist() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Movie movie = new Movie("Gone Girl", 2010, DIRECTOR, RATING);

        assertFalse(movieLibrary.removeMovie(movie));
    }

    @Test
    public void shouldNotRemoveABookIfItDoesNotExist() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Movie movie = new Movie("Gone Girl", YEAR, DIRECTOR, RATING);

        assertFalse(movieLibrary.removeMovie(movie));
    }

    @Test
    public void shouldReturnABookIfItDoesExist() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Movie movie = new Movie("Inception", 2010, "Christopher Nolan", "8.8");

        assertTrue(movieLibrary.removeMovie(movie));
    }

}