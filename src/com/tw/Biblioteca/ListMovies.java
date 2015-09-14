//Lists the available movies

package com.tw.biblioteca;

public class ListMovies implements MenuItem{

    private MovieLibrary movieLibrary;

    public ListMovies(MovieLibrary movieLibrary) {
        this.movieLibrary = movieLibrary;
    }

    public String getMovies() {
        return movieLibrary.toString();
    }

    public void execute() {
        ConsoleOutput consoleOutput = new ConsoleOutput(getMovies());
        consoleOutput.displayMessage();
    }
}
