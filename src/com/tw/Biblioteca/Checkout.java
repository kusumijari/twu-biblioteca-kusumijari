//Checks out a book from the library

package com.tw.biblioteca;

public class Checkout implements MenuItem{

    String bookNameChoice;
    Library library;
    ConsoleOutput consoleOutput;
    ConsoleInput consoleInput;
    Book book;


    Checkout(Library library) {
        this.library = library;
        consoleInput = new ConsoleInput();
    }

    public String acceptBookChoice(ConsoleInput consoleInput) {
        return consoleInput.getInput();
    }

    @Override
    public void execute() {
        bookNameChoice = acceptBookChoice(consoleInput);
        library.removeBook(bookToBeCheckedOut());
        consoleOutput = new ConsoleOutput("Thank You! Enjoy the book.");
        consoleOutput.displayMessage();
    }

    private Book bookToBeCheckedOut() {
        return new Book(bookNameChoice, "author", 0);
    }

}
