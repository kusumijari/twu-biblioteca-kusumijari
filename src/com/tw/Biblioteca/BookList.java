//Contains a list of books which can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class BookList {
    private ArrayList<String> booklist = new ArrayList<String>();

    BookList(){
        booklist.add("Harry Potter");
        booklist.add("Tale of Two Cities");
    }

    public void displayBooks () {
        for (String book : booklist) {
            System.out.println(book);
        }
    }
}
