//Parses the menu option entered by the user and performs operations on the library

package com.tw.biblioteca;

public class Parser {
    private String option;
    private BookLibrary bookLibrary;
    private MovieLibrary movieLibrary;
    private Session session;

    public Parser(String option, BookLibrary bookLibrary, MovieLibrary movieLibrary, Session session) {
        this.bookLibrary = bookLibrary;
        this.option = option;
        this.movieLibrary = movieLibrary;
        this.session = session;
    }

    public MenuItem createMenuItem() {
            if (option.equals("List Books")) {
                return new ListBooks(bookLibrary);
            }
            else if (option.equals("Checkout Book")) {
                ConsoleInput consoleInput = new ConsoleInput();
                return new CheckoutBook(bookLibrary, consoleInput,session);
            }
            else if(option.equals("Checkin Book")) {
                return new CheckinBook(bookLibrary, new ConsoleInput(),session);
            }
            else if(option.equals("List Movies")) {
                return new ListMovies(movieLibrary);
            }
            else if(option.equals("Checkout Movie")) {
                return new CheckoutMovie(movieLibrary, new ConsoleInput());
            }
            else if(option.equals("Exit")){
                return new Exit();
            }
            else if(option.equals("Login")) {
                return new Login(new ConsoleInput(), new ConsoleInput(), session);
            }
            else if(option.equals("Logout")) {
                return new Logout(session);
            }
            else if(option.equals("Checkedout Book Details")){
                return new CheckedoutBookDetails(bookLibrary);
            }
        return new InvalidMenuItem();
    }
}
