package com.tw.biblioteca;

import java.util.ArrayList;

public class MovieLibrary {

    private ArrayList<Movie> availableMovies = new ArrayList<Movie>();

    public MovieLibrary() {
        Movie movie1 = new Movie("Inception", 2010, "Christopher Nolan", "8.8");
        availableMovies.add(movie1);
        Movie movie2 = new Movie("Interstellar", 2014, "Christopher Nolan", "unrated");
        availableMovies.add(movie2);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Name\t\tYear\t\tDirector\t\tRating\n");

        for(Movie movie : availableMovies) {
            stringBuilder.append(movie.toString()+"\n");
        }
        return stringBuilder.toString();
    }

    public boolean removeMovie(Movie movieToBeRemoved) {
        return true;
    }
}
