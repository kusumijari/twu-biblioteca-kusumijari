//Contains book details in a certain format

package com.tw.biblioteca;

public class Book {
    private String name, author;
    private int yearOfPublication;

    public Book(String name, String author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this. yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {

        return (name+"\t"+author+"\t"+yearOfPublication);
    }

}
