package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ParserTest {

    @Test
    public void shouldReturnTrueIfTheOptionEnteredIsADigit() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("1", bookLibrary, movieLibrary);

        assertTrue(parser.isValid());
    }

    @Test
    public void shouldReturnFalseIfTheOptionEnteredIsAValueGreaterThanTheAvailableOptions() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("7", bookLibrary, movieLibrary);

        assertFalse(parser.isValid());
    }

    @Test
    public void shouldReturnBookListObjectIfOptionIsOne() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("1", bookLibrary, movieLibrary);

        assertEquals(ListBooks.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnInvalidMenuItemObjectIfAnIncorrectOptionIsEntered() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("99", bookLibrary, movieLibrary);

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnFalseIfTheOptionEnteredIsANegativeNumber() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("-1", bookLibrary, movieLibrary);

        assertFalse(parser.isValid());
    }

    @Test
    public void shouldExitObjectIfOptionIsThree() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("6", bookLibrary, movieLibrary);

        assertEquals(Exit.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckoutObjectIfOptionIsTwo() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("2", bookLibrary, movieLibrary);

        assertEquals(CheckoutBook.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnReturnBookObjectIfOptionIsThree() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("3", bookLibrary, movieLibrary);

        assertEquals(CheckinBook.class, parser.createMenuItem().getClass());
    }


    @Test
    public void shouldListMoviesObjectIfOptionIsFour() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("4", bookLibrary, movieLibrary);

        assertEquals(ListMovies.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckoutMovieObjectIfOptionIsFive() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("5", bookLibrary, movieLibrary);

        assertEquals(CheckoutMovie.class, parser.createMenuItem().getClass());
    }
}