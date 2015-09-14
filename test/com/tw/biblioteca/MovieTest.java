package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MovieTest {

    @Test
    public void shouldReturnEachMovieInColumnForm() {
        Movie movie = new Movie("Inception", 2010, "Christopher Nolan", "8.8");

        assertEquals("Inception\t\t2010\t\tChristopher Nolan\t\t8.8", movie.toString());
    }

    @Test
    public void shouldBeEqualToItself() {
        Movie movie = new Movie("Inception", 2010, "Christopher Nolan", "8.8");

        assertEquals(movie, movie);
    }

    @Test
    public void shouldNotBeEqualToANullObject() {
        Movie movie = new Movie("Inception", 2010, "Christopher Nolan", "8.8");

        assertNotEquals(movie, null);
    }


}