//shows the list of books available in the library

package com.tw.biblioteca;

public class ListBooks implements MenuItem {
    private Library library;

    public ListBooks(Library library) {
        this.library = library;
    }

    @Override
    public String execute() {
        return library.toString();
    }

}
