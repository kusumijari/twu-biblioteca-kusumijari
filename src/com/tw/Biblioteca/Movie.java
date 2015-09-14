//Has a movie with name, year, director and movie rating which can be viewed

package com.tw.biblioteca;

public class Movie {

    private String name;
    private int year;
    private String director;
    private String rating;

    public Movie(String name, int year, String director, String rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return(name + "\t\t" + year + "\t\t" + director + "\t\t" + rating);
    }

    @Override
    public boolean equals(Object that){
        return true;
    }
}
