//Contains a list of books which can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class BookList {
    private ArrayList<String> booklist = new ArrayList<String>();

    BookList(){
        booklist.add("Harry Potter");
        booklist.add("Tale of Two Cities");
    }

    public Object getBooks() {
        return booklist.get(0)+booklist.get(1);
    }
}
