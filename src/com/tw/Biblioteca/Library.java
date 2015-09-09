//Contains a list of books which can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class Library{

    private ArrayList<Book> books = new ArrayList<Book>();

    Library() {
        Book book1 = new Book("Harry Potter", "J. K. Rowling", 1997);
        Book book2 = new Book("Tale of Two Cities", "Charles Dickens", 1859);
        books.add(book1);
        books.add(book2);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Name\tAuthor\tYear\n");

        for(Book book : books) {
            stringBuilder.append(book.toString()+"\n");
        }
        return stringBuilder.toString();
    }

    public boolean removeBook(Book nameOfBook) {
        if(books.contains(nameOfBook)) {
            books.remove(nameOfBook);
            System.out.println(toString());
            return true;
        }
        return false;
    }
}
