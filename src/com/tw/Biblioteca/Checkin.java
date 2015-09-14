//Handles the checkin Menu Option
package com.tw.biblioteca;

public class Checkin implements MenuItem{

    private Library library;
    private ConsoleInput consoleInput;

    public Checkin(Library library, ConsoleInput consoleInput) {
        this.library = library;
        this.consoleInput = consoleInput;
    }


    public String acceptBookChoice() {
        return consoleInput.getInput();
    }

    @Override
    public void execute() {

    }

    public boolean hasBeenReturned(Book bookToBeReturned) {
        return library.returnBook(bookToBeReturned);
    }
}
