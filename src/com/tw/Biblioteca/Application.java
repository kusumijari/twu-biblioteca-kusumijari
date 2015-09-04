package com.tw.biblioteca;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<String>();
        bookList.add("Harry Potter");
        bookList.add("Tale of two cities");
        View view = new View("Welcome to Biblioteca!", bookList);
        view.welcomeMesasge();
        view.showBookList();
    }
}
