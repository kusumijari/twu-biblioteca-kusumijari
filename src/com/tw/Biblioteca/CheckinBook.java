//Handles the checkin Menu Option
package com.tw.biblioteca;

public class CheckinBook implements MenuItem{

    private static final String AUTHOR = "author";
    private static final int YEAROFPUBLICATION = 0;
    private BookLibrary bookLibrary;
    private ConsoleInput consoleInput;
    private Book book;
    private Session session;

    public CheckinBook(BookLibrary bookLibrary, ConsoleInput consoleInput, Session session) {
        this.bookLibrary = bookLibrary;
        this.consoleInput = consoleInput;
        this.session = session;
    }


    public String bookChoice() {
        return consoleInput.getInput();
    }

    @Override
    public void execute() {
        book = new Book(bookChoice(), AUTHOR, YEAROFPUBLICATION);
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
        return bookLibrary.returnBook(bookToBeReturned, session);
    }
}
