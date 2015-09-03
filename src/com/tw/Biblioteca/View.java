//Displays any message

package com.tw.biblioteca;

import java.util.ArrayList;

public class View {

    String message;
    ArrayList<String>  bookList = new ArrayList<String>();

    public View(String message) {
        this.message = message;

    }

    public String welcomeMesasge() {
        return message;
    }

    public String showBookList() {
        bookList.add("Harry Potter");
        bookList.add("Tale of Two Cities");
        return (bookList.get(0) + bookList.get(1));
    }
}
