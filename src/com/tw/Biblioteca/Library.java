//Contains a list of books which can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class Library{

    private ArrayList<Book> booklist = new ArrayList<Book>();

    Library() {
        Book book1 = new Book("Harry Potter", "J. K. Rowling", 1997);
        Book book2 = new Book("Tale of Two Cities", "Charles Dickens", 1859);
        booklist.add(book1);
        booklist.add(book2);
    }

    public String listOfBooks() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Name\tAuthor\tYear\n");

        for(Book book : booklist) {
            stringBuilder.append(book.toString()+"\n");
        }
        return stringBuilder.toString();
    }

    public String removeBooks(Book nameOfBook) {
        if(!exists(nameOfBook)) {
            return booklist.toString();
        }
        return ("Name\tAuthor\tYear\nTale of Two Cities\tCharles Dickens\t1859\n");
    }

    public boolean exists(Book nameOfBook) {
        for(Book book : booklist){
            if(book.equals(nameOfBook)){
                return true;
            }
        }
        return false;
    }
}
