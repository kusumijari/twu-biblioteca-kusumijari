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
        if(that == null || that.getClass() != Movie.class) {
            return false;
        }
        Movie thatMovie = (Movie) that;
        if((this.name).equals(thatMovie.name)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        if(this != null) {
            for (int i = 0; i < name.length(); i++) {
                hash = Character.getNumericValue(name.charAt(i)) + (hash << 6) + (hash << 16) - hash;
            }
        }
        return hash;
    }
}
