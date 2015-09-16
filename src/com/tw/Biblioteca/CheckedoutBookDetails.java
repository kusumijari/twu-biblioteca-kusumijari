//has details of which boook is checked out by which user and displays it

package com.tw.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class CheckedoutBookDetails implements MenuItem{

    private BookLibrary bookLibrary;

    public CheckedoutBookDetails(BookLibrary bookLibrary) {
        this.bookLibrary = bookLibrary;
    }

    @Override
    public String toString() {
        HashMap<Book, User> bookDetails =  bookLibrary.getCheckOutBookDetails();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Book\t-\tUser\n");
        for(Map.Entry<Book, User> entry : bookDetails.entrySet() ){
            stringBuilder.append(entry.getKey() + "\t-\t" + entry.getValue().getUsername() + "\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public void execute() {
        ConsoleOutput consoleOutput = new ConsoleOutput(toString());
        consoleOutput.displayMessage();
    }
}
