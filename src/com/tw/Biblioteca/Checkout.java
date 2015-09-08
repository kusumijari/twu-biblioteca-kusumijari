//Checks out a book from the library

package com.tw.biblioteca;

public class Checkout implements MenuItem{

    int bookChoice;
    Library library;

    Checkout(Library library) {
        this.library = library;
    }

    public String acceptBookChoice(ConsoleInput consoleInput) {
        return consoleInput.getInput();
    }

    @Override
    public void execute() {

    }

    public String receiveNewBookList() {
        return library.listOfBooks().toString();
    }
}
