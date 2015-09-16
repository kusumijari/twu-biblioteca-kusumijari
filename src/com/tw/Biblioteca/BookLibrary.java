//Contains a list of books which can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class BookLibrary {

    private ArrayList<Book> availableBooks = new ArrayList<Book>();
    private ArrayList<Book> checkoutOutBooks = new ArrayList<Book>();
    private HashMap<Book, User> hashMap = new HashMap<Book, User>();

    BookLibrary() {
        Book book1 = new Book("Harry Potter", "J. K. Rowling", 1997);
        Book book2 = new Book("Tale of Two Cities", "Charles Dickens", 1859);
        availableBooks.add(book1);
        availableBooks.add(book2);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Name\tAuthor\tYear\n");

        for(Book book : availableBooks) {
            stringBuilder.append(book.toString()+"\n");
        }
        return stringBuilder.toString();
    }

    public boolean removeBook(Book nameOfBook, Session session) {
        if(availableBooks.contains(nameOfBook)) {
            checkoutOutBooks.add(availableBooks.get(availableBooks.indexOf(nameOfBook)));
            availableBooks.remove(nameOfBook);
            return true;
        }
        return false;
    }

    public boolean returnBook(Book returnedBook) {
        if(checkoutOutBooks.contains(returnedBook)) {
            availableBooks.add(checkoutOutBooks.get(checkoutOutBooks.indexOf(returnedBook)));
            checkoutOutBooks.remove(returnedBook);
            return true;
        }
        return false;
    }

    public HashMap addToHashmap(Book book, Session session) {
        hashMap.put(book,session.getUser());
        return hashMap;
    }
}
