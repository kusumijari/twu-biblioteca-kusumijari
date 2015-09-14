//shows the list of books available in the library

package com.tw.biblioteca;

public class ListBooks implements MenuItem {
    private BookLibrary bookLibrary;

    public ListBooks(BookLibrary bookLibrary) {
        this.bookLibrary = bookLibrary;
    }

    @Override
    public void execute() {
        ConsoleOutput consoleOutput = new ConsoleOutput( getBooks());
        consoleOutput.displayMessage();
    }

    public String getBooks() {
        return bookLibrary.toString();
    }
}
