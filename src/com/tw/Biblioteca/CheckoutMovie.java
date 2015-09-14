//Exexutes the menu item of checking out a movie

package com.tw.biblioteca;

public class CheckoutMovie {

    private MovieLibrary movieLibrary;
    private ConsoleInput consoleInput;

    public CheckoutMovie(MovieLibrary movieLibrary, ConsoleInput consoleInput) {
        this.movieLibrary = movieLibrary;
        this.consoleInput= consoleInput;
    }


    public String acceptMovieChoice() {
        return consoleInput.getInput();
    }
}
