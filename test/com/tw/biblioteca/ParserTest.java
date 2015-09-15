package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldReturnBookListObjectIfOptionIsOne() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("List Books", bookLibrary, movieLibrary);

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
    public void shouldExitObjectIfOptionIsExit() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Exit", bookLibrary, movieLibrary);

        assertEquals(Exit.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckoutObjectIfOptionIsCheckoutBook() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkout Book", bookLibrary, movieLibrary);

        assertEquals(CheckoutBook.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnReturnBookObjectIfOptionIsCheckinBook() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkin Book", bookLibrary, movieLibrary);

        assertEquals(CheckinBook.class, parser.createMenuItem().getClass());
    }


    @Test
    public void shouldListMoviesObjectIfOptionIsListMovies() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("List Movies", bookLibrary, movieLibrary);

        assertEquals(ListMovies.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckoutMovieObjectIfOptionIsCheckoutMovie() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkout Movie", bookLibrary, movieLibrary);

        assertEquals(CheckoutMovie.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnLoginObjectIfOptionIsLogin() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Login", bookLibrary, movieLibrary);

        assertEquals(Login.class, parser.createMenuItem().getClass());
    }
}