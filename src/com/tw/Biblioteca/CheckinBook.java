//Handles the checkin Menu Option
package com.tw.biblioteca;

public class CheckinBook implements MenuItem{

    private BookLibrary bookLibrary;
    private ConsoleInput consoleInput;
    private Book book;

    public CheckinBook(BookLibrary bookLibrary, ConsoleInput consoleInput) {
        this.bookLibrary = bookLibrary;
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
        return bookLibrary.returnBook(bookToBeReturned);
    }
}
