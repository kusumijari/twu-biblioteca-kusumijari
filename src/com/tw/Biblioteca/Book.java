//Contains book details in a certain format

package com.tw.biblioteca;

public class Book {
    private String name, author;
    private int yearOfPublication;
    private String checkedOut;

    public Book(String name, String author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this. yearOfPublication = yearOfPublication;
        checkedOut = "not checked out";
    }

    @Override
    public String toString() {

        return (name+"\t"+author+"\t"+yearOfPublication);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null || that.getClass() != Book.class ) {
            return false;
        }
        Book thatBook = (Book)that;
        if((this.name).equals(thatBook.name)){
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
