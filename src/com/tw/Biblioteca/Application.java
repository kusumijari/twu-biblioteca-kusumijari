package com.tw.biblioteca;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<String>();
        bookList.add("Harry Potter");
        bookList.add("Tale of two cities");
        Application application = new Application();
        application.start();
    }

    private void start() {
        System.out.println("Welcome to biblioteca");
    }
}
