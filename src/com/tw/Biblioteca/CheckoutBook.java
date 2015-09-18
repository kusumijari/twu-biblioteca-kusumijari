//Checks out a book from the library

package com.tw.biblioteca;

public class CheckoutBook implements MenuItem{

    private static final String AUTHOR = "auhtor";
    private static final int YEAROFPUBLICATION = 0;
    private String bookNameChoice;
    private BookLibrary bookLibrary;
    private ConsoleInput consoleInput;
    private Book book;
    private Session session;


    CheckoutBook(BookLibrary bookLibrary, ConsoleInput mockConsoleInput, Session session) {
        this.bookLibrary = bookLibrary;
        consoleInput = mockConsoleInput;
        this.session = session;
    }

    public String acceptBookChoice() {
        checkoutChoicePrompt();
        return consoleInput.getInput();
    }

    @Override
    public void execute() {
        bookNameChoice = acceptBookChoice();
        book = new Book(bookNameChoice, AUTHOR, YEAROFPUBLICATION);
        if(hasBeenRemoved(book)) {
            ConsoleOutput consoleOutput = new ConsoleOutput("Thank you! Enjoy the book.");
            consoleOutput.displayMessage();
        }
        else {
            ConsoleOutput consoleOutput = new ConsoleOutput("That book is not available.");
            consoleOutput.displayMessage();
        }
    }

    public boolean hasBeenRemoved(Book book) {
        return bookLibrary.removeBook(book, session);
    }

    public void checkoutChoicePrompt() {
        ConsoleOutput consoleOutput = new ConsoleOutput("Enter the book you want to checkout:");
        consoleOutput.displayMessage();
    }
}
