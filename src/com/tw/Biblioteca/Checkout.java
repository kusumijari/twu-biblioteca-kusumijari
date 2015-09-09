//Checks out a book from the library

package com.tw.biblioteca;

public class Checkout implements MenuItem{

    private String bookNameChoice;
    private Library library;
    private ConsoleInput consoleInput;
    private Book book;


    Checkout(Library library) {
        this.library = library;
        consoleInput = new ConsoleInput();
    }

    public String acceptBookChoice(ConsoleInput consoleInput) {
        return consoleInput.getInput();
    }

    @Override
    public String execute() {
        bookNameChoice = acceptBookChoice(consoleInput);
        book = new Book(bookNameChoice, "author", 0);
        if(library.removeBook(book)) {
            return "Thank You! Enjoy the book.";
        }
        return "That book is not available";
    }

    public boolean hasBeenCheckedOut(Book book) {
        return library.removeBook(book);
    }
}
