package com.tw.biblioteca;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start() {
        System.out.println("Welcome to biblioteca");
        BookList bookList = new BookList();

    }
}
