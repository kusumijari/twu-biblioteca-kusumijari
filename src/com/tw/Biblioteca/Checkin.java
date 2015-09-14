//Handles the checkin Menu Option
package com.tw.biblioteca;

public class Checkin implements MenuItem{

    private Library library;
    private ConsoleInput consoleInput;
    private Book book;

    public Checkin(Library library, ConsoleInput consoleInput) {
        this.library = library;
        this.consoleInput = consoleInput;
    }


    public String bookChoice() {
        return consoleInput.getInput();
    }

    @Override
    public void execute() {
        book = new Book(bookChoice(), "author", 0);
        if(hasBeenReturned(book)) {
            ConsoleOutput consoleOutput = new ConsoleOutput("Thank you for returning the book.");
            consoleOutput.displayMessage();
        }
        else {
            ConsoleOutput consoleOutput = new ConsoleOutput("That is not a valid book to return.");
            consoleOutput.displayMessage();
        }
    }

    public boolean hasBeenReturned(Book bookToBeReturned) {
        return library.returnBook(bookToBeReturned);
    }
}
