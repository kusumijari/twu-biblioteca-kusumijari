//Exexutes the menu item of checking out a movie

package com.tw.biblioteca;

public class CheckoutMovie implements MenuItem{

    private MovieLibrary movieLibrary;
    private ConsoleInput consoleInput;

    public CheckoutMovie(MovieLibrary movieLibrary, ConsoleInput consoleInput) {
        this.movieLibrary = movieLibrary;
        this.consoleInput= consoleInput;
    }


    public String acceptMovieChoice() {
        return consoleInput.getInput();
    }

    public boolean hasBeenRemoved(Movie movie) {
        return movieLibrary.removeMovie(movie);
    }

    public void execute() {
        String movieChoice = acceptMovieChoice();
        if(hasBeenRemoved(new Movie(movieChoice, 0, "director", "0"))) {
            ConsoleOutput consoleOutput = new ConsoleOutput("Thank you! Enjoy the movie.");
            consoleOutput.displayMessage();
        }
        else {
            ConsoleOutput consoleOutput = new ConsoleOutput("That is not a valid movie option.");
            consoleOutput.displayMessage();
        }
    }
}
