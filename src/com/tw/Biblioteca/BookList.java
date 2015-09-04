//Contains a list of books which can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class BookList {
    private ArrayList<String> booklist = new ArrayList<String>();

    BookList(){
        booklist.add("Harry Potter\tJ. K. Rowling\t1997");
        booklist.add("Tale of Two Cities\tCharles Dickens\t1859");
    }

    public void displayBooks () {
        for (String book : booklist) {
            System.out.println(book);
        }
    }
}
