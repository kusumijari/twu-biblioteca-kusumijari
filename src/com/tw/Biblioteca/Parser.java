//Parses the menu option entered by the user and performs operations on the library

package com.tw.biblioteca;

public class Parser {
    private String option;
    private BookLibrary bookLibrary;
    private MovieLibrary movieLibrary;

    public Parser(String option, BookLibrary bookLibrary, MovieLibrary movieLibrary) {
        this.bookLibrary = bookLibrary;
        this.option = option;
        this.movieLibrary = movieLibrary;
    }

    public MenuItem createMenuItem() {
            if (option.equals("List Books")) {
                return new ListBooks(bookLibrary);
            }
            else if (option.equals("Checkout Book")) {
                ConsoleInput consoleInput = new ConsoleInput();
                return new CheckoutBook(bookLibrary, consoleInput);
            }
            else if(option.equals("Checkin Book")) {
                return new CheckinBook(bookLibrary, new ConsoleInput());
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
        return new InvalidMenuItem();
    }
}
