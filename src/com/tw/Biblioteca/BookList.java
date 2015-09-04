//Contains a list of books which can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> booklist = new ArrayList<>();
    private Book book1 = new Book("Harry Potter", "J. K. Rowling", 1997);
    private Book book2 = new Book("Tale of Two Cities", "Charles Dickens", 1859);

    BookList(){
        booklist.add(book1);
        booklist.add(book2);
    }

    public void displayBooks () {
        for (Book book : booklist) {
            System.out.println(book);
        }
    }
}
