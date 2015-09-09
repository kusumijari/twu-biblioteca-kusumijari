//Checks out a book from the library

package com.tw.biblioteca;

public class Checkout implements MenuItem{

    private String bookNameChoice;
    private Library library;
    private ConsoleInput consoleInput;
    private Book book;


    Checkout(Library library, ConsoleInput mockConsoleInput) {
        this.library = library;
        consoleInput = mockConsoleInput;
    }

    public String acceptBookChoice() {
        return consoleInput.getInput();
    }

    @Override
    public void execute() {
        bookNameChoice = acceptBookChoice();
        book = new Book(bookNameChoice, "author", 0);
        if(hasBeenCheckedOut(book)) {
            ConsoleOutput consoleOutput = new ConsoleOutput("Thank you! Enjoy the book.");
            consoleOutput.displayMessage();
        }
        else {
            ConsoleOutput consoleOutput = new ConsoleOutput("That book is not available.");
            consoleOutput.displayMessage();
        }
    }

    public boolean hasBeenCheckedOut(Book book) {
        return library.removeBook(book);
    }
}
