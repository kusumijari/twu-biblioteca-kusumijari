//Lists the available movies

package com.tw.biblioteca;

public class ListMovies {

    private MovieLibrary movieLibrary;

    public ListMovies(MovieLibrary movieLibrary) {
        this.movieLibrary = movieLibrary;
    }

    public String getMovies() {
        return movieLibrary.toString();
    }
}
