package com.tw.biblioteca;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start() {
        View view = new View("Welcome to Biblioteca");
        view.displayMessage();
        ArrayList<Book> list = new ArrayList<>();
        Book book1 = new Book("Harry Potter", "J. K. Rowling", 1997);
        Book book2 = new Book("Tale of Two Cities", "Charles Dickens", 1859);
        list.add(book1);
        list.add(book2);
        BookList bookList = new BookList(list);
        Menu menu = new Menu();
        view = new View(menu.toString());
    }
}
