package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldReturnBookListObjectIfOptionIsListBooks() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("List Books", bookLibrary, movieLibrary, new Session(new User("default", "nousername", "nopassword")));

        assertEquals(ListBooks.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnInvalidMenuItemObjectIfAnIncorrectOptionIsEntered() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("99", bookLibrary, movieLibrary, new Session(new User("default", "nousername", "nopassword")));

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldExitObjectIfOptionIsExit() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Exit", bookLibrary, movieLibrary, new Session(new User("default", "nousername", "nopassword")));

        assertEquals(Exit.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldListMoviesObjectIfOptionIsListMovies() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("List Movies", bookLibrary, movieLibrary, new Session(new User("default", "nousername", "nopassword")));

        assertEquals(ListMovies.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckoutMovieObjectIfOptionIsCheckoutMovie() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkout Movie", bookLibrary, movieLibrary, new Session(new User("default", "nousername", "nopassword")));

        assertEquals(CheckoutMovie.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnLoginObjectIfOptionIsLogin() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Login", bookLibrary, movieLibrary, new Session(new User("default", "nousername", "nopassword")));

        assertEquals(Login.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnLogoutObjectIfOptionIsLogout() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Logout", bookLibrary, movieLibrary, new Session(new User("default", "nousername", "nopassword")));

        assertEquals(Logout.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckedOutBookDetailsObjectIfOptionIsCheckedOutBookDetails() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkedout Book Details", bookLibrary, movieLibrary, new Session(new User("default", "nousername", "nopassword")));

        assertEquals(CheckedoutBookDetails.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckoutObjectIfOptionIsCheckoutBookAndUserIsCustomer() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkout Book", bookLibrary, movieLibrary, new Session(new User("Customer", "nousername", "nopassword")));

        assertEquals(CheckoutBook.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckoutObjectIfOptionIsCheckoutBookAndUserIsLibrarian() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkout Book", bookLibrary, movieLibrary, new Session(new User("Librarian", "nousername", "nopassword")));

        assertEquals(CheckoutBook.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldNotReturnCheckoutObjectIfOptionIsCheckoutBookAndUserIsDefault() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkout Book", bookLibrary, movieLibrary, new Session(new User("default", "nousername", "nopassword")));

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckinObjectIfOptionIsCheckinBookAndUserIsCustomer() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkin Book", bookLibrary, movieLibrary, new Session(new User("Customer", "nousername", "nopassword")));

        assertEquals(CheckinBook.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldNotReturnCheckoinObjectIfOptionIsCheckinBookAndUserIsDefault() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkin Book", bookLibrary, movieLibrary, new Session(new User("default", "nousername", "nopassword")));

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckinObjectIfOptionIsCheckinBookAndUserIsLibrarian() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkin Book", bookLibrary, movieLibrary, new Session(new User("Librarian", "nousername", "nopassword")));

        assertEquals(CheckinBook.class, parser.createMenuItem().getClass());

    }

    @Test
    public void shouldReturnCheckedOutBookDetailsObjectIfOptionIsCheckedOutBookDetailsAndUserIsLibrarian() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkedout Book Details", bookLibrary, movieLibrary, new Session(new User("Librarian", "nousername", "nopassword")));

        assertEquals(CheckedoutBookDetails.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnInvalidObjectIfOptionIsCheckedOutBookDetailsAndUserIsGuest() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkedout Book Details", bookLibrary, movieLibrary, new Session(new User("default", "nousername", "nopassword")));

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }
}