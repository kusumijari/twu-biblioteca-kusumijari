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

    @Test
    public void shouldNotBeEqualToAnObjectOtherThanMovie() {
        Movie movie = new Movie("Inception", 2010, "Christopher Nolan", "8.8");

        assertNotEquals(movie,"not a Movie object");
    }

    @Test
    public void shouldNotBeEqualToAnotherMovieObjectWithDifferentName() {
        Movie movie = new Movie("Inception", 2010, "Christopher Nolan", "8.8");

        assertNotEquals("Interstellar", movie);
    }

    @Test
    public void shouldBeEqualToAnotherMovieObjectWithSameName() {
        Movie movie = new Movie("Inception", 2010, "Christopher Nolan", "8.8");

        assertNotEquals("Inception", movie);
    }

    @Test
    public void shouldHaveEqualHashcodesIfMoviesAreEqual() {
        Movie movie1 = new Movie("Inception", 2010, "Christopher Nolan", "8.8");
        Movie movie2 = new Movie("Inception", 2010, "Christopher Nolan", "8.8");

        assertEquals(movie1.hashCode(), movie2.hashCode());
    }
}