package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ParserTest {

    @Test
    public void shouldReturnTrueIfTheOptionEnteredIsADigit() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("1", library, movieLibrary);

        assertTrue(parser.isValid());
    }

    @Test
    public void shouldReturnFalseIfTheOptionEnteredIsAValueGreaterThanTheAvailableOptions() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("7", library, movieLibrary);

        assertFalse(parser.isValid());
    }

    @Test
    public void shouldReturnBookListObjectIfOptionIsOne() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("1", library, movieLibrary);

        assertEquals(ListBooks.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnInvalidMenuItemObjectIfAnIncorrectOptionIsEntered() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("99", library, movieLibrary);

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnFalseIfTheOptionEnteredIsANegativeNumber() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("-1", library, movieLibrary);

        assertFalse(parser.isValid());
    }

    @Test
    public void shouldExitObjectIfOptionIsThree() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("6", library, movieLibrary);

        assertEquals(Exit.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckoutObjectIfOptionIsTwo() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("2", library, movieLibrary);

        assertEquals(Checkout.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnReturnBookObjectIfOptionIsThree() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("3", library, movieLibrary);

        assertEquals(Checkin.class, parser.createMenuItem().getClass());
    }


    @Test
    public void shouldListMoviesObjectIfOptionIsFour() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("4", library, movieLibrary);

        assertEquals(ListMovies.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckoutMovieObjectIfOptionIsFive() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("5", library, movieLibrary);

        assertEquals(CheckoutMovie.class, parser.createMenuItem().getClass());
    }
}