package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ListMoviesTest {

    @Test
    public void shouldReceiveTheListOfMoviesFromMovieLibrary() {

        MovieLibrary movieLibrary = new MovieLibrary();
        ListMovies listMovies = new ListMovies(movieLibrary);

        assertEquals("Name\t\tYear\t\tDirector\t\tRating\nInception\t\t2010\t\tChristopher Nolan\t\t8.8\nInterstellar\t\t2014\t\tChristopher Nolan\t\tunrated\n", listMovies.getMovies());
    }

    @Test
    public void shouldDisplayTheBookList() {

        MovieLibrary movieLibrary = new MovieLibrary();
        ListMovies listMovies = new ListMovies(movieLibrary);

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        listMovies.execute();

        assertEquals("Name\t\tYear\t\tDirector\t\tRating\nInception\t\t2010\t\tChristopher Nolan\t\t8.8\nInterstellar\t\t2014\t\tChristopher Nolan\t\tunrated\n\n", outContent.toString());
        System.setOut(System.out);
    }
}