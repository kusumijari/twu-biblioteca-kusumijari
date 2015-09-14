//Checks out a book from the library

package com.tw.biblioteca;

public class CheckoutBook implements MenuItem{

    private String bookNameChoice;
    private BookLibrary bookLibrary;
    private ConsoleInput consoleInput;
    private Book book;


    CheckoutBook(BookLibrary bookLibrary, ConsoleInput mockConsoleInput) {
        this.bookLibrary = bookLibrary;
        consoleInput = mockConsoleInput;
    }

    public String acceptBookChoice() {
        return consoleInput.getInput();
    }

    @Override
    public void execute() {
        bookNameChoice = acceptBookChoice();
        book = new Book(bookNameChoice, "author", 0);
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
        return bookLibrary.removeBook(book);
    }
}
