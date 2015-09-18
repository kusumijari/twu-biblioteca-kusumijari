package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ParserTest {

    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String NAME = "name";
    private static final String EMAIL = "email";
    private static final int PHONENUMBER = 0;
    
    @Test
    public void shouldReturnBookListObjectIfOptionIsListBooks() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("List Books", bookLibrary, movieLibrary, new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(ListBooks.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnInvalidMenuItemObjectIfAnIncorrectOptionIsEntered() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("99", bookLibrary, movieLibrary, new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldExitObjectIfOptionIsExit() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Exit", bookLibrary, movieLibrary, new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(Exit.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldListMoviesObjectIfOptionIsListMovies() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("List Movies", bookLibrary, movieLibrary, new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(ListMovies.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckoutMovieObjectIfOptionIsCheckoutMovie() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkout Movie", bookLibrary, movieLibrary, new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(CheckoutMovie.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnLoginObjectIfOptionIsLogin() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Login", bookLibrary, movieLibrary, new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(Login.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnLogoutObjectIfOptionIsLogout() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Logout", bookLibrary, movieLibrary, new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(Logout.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckoutObjectIfOptionIsCheckoutBookAndUserIsCustomer() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkout Book", bookLibrary, movieLibrary, new Session(new User("Customer", "123-4567", PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(CheckoutBook.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckoutObjectIfOptionIsCheckoutBookAndUserIsLibrarian() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkout Book", bookLibrary, movieLibrary, new Session(new User("Librarian", "111-1111", PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(CheckoutBook.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldNotReturnCheckoutObjectIfOptionIsCheckoutBookAndUserIsDefault() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkout Book", bookLibrary, movieLibrary, new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckinObjectIfOptionIsCheckinBookAndUserIsCustomer() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkin Book", bookLibrary, movieLibrary, new Session(new User("Customer", "123-4567", PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(CheckinBook.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldNotReturnCheckoinObjectIfOptionIsCheckinBookAndUserIsDefault() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkin Book", bookLibrary, movieLibrary, new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckinObjectIfOptionIsCheckinBookAndUserIsLibrarian() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkin Book", bookLibrary, movieLibrary, new Session(new User("Librarian", "111-1111", PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(CheckinBook.class, parser.createMenuItem().getClass());

    }

    @Test
    public void shouldReturnCheckedOutBookDetailsObjectIfOptionIsCheckedOutBookDetailsAndUserIsLibrarian() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkedout Book Details", bookLibrary, movieLibrary, new Session(new User("Librarian", "111-1111", PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(CheckedoutBookStatus.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnInvalidObjectIfOptionIsCheckedOutBookDetailsAndUserIsGuest() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkedout Book Details", bookLibrary, movieLibrary, new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnInvalidObjectIfOptionIsCheckedOutBookDetailsAndUserIsCustomer() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("Checkedout Book Details", bookLibrary, movieLibrary, new Session(new User("Customer", "123-4567", "password1", NAME, EMAIL, PHONENUMBER)));

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnUserDetailsObjectIfOptionIsUserDetailsAndUserIsLibrarian() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("User Details", bookLibrary, movieLibrary, new Session(new User("Librarian", "111-1111", PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(UserDetails.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnInvalidObjectIfOptionIsUserDetailsAndUserIsGuest() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("User Details", bookLibrary, movieLibrary, new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnUserDetailsObjectIfOptionIsUserDetailsAndUserIsCustomer() {
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("User Details", bookLibrary, movieLibrary, new Session(new User("Customer", "123-4567", PASSWORD, NAME, EMAIL, PHONENUMBER)));

        assertEquals(UserDetails.class, parser.createMenuItem().getClass());
    }
}