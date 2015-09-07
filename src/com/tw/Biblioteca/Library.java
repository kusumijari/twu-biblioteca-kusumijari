//Contains a list of books which can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class Library{

    private ArrayList<Book> library = new ArrayList<Book>();
    View view;

    Library(ArrayList<Book> library) {
        this.library = library;
    }

    public String listOfBooks() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name\tAuthor\tYear\n");

        for(Book book : library) {
            stringBuilder.append(book.toString()+"\n");
        }
        return stringBuilder.toString();
    }
}
