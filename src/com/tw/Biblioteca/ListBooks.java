//shows the list of books available in the library

package com.tw.biblioteca;

public class ListBooks implements MenuItem {
    private Library library;
    private ConsoleOutput consoleOutput;

    public ListBooks(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        consoleOutput = new ConsoleOutput(getBooks());
        consoleOutput.displayMessage();
    }

    public String getBooks() {
        return library.listOfBooks();
    }
}
