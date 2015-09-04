//Displays any message

package com.tw.biblioteca;

import java.util.ArrayList;

public class View {

    String message;
    ArrayList<String>  bookList = new ArrayList<String>();

    public View(String message, ArrayList<String> bookList) {
        this.message = message;
        this.bookList = bookList;

    }

    public void welcomeMesasge() {
        System.out.println(message);
    }

    public void showBookList() {
        System.out.println(bookList.get(0).toString() + bookList.get(1).toString());
    }
}
