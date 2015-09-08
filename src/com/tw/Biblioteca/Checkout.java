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
        book = new Book(bookNameChoice, "author", 0);
        if(hasBeenCheckedOut(book)) {
            consoleOutput = new ConsoleOutput("Thank You! Enjoy the book.");
            consoleOutput.displayMessage();
            System.out.print(library.toString());
        }
        else {
            consoleOutput = new ConsoleOutput("That book is not available");
            consoleOutput.displayMessage();

        }
    }

    public boolean hasBeenCheckedOut(Book book) {
        return library.removeBook(book);
    }
}
