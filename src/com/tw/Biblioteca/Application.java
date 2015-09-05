package com.tw.biblioteca;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start() {
        View view = new View("Welcome to Biblioteca");
        BookList bookList = new BookList();

    }
}
