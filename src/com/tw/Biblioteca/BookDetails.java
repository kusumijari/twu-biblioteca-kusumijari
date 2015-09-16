//has details of which boook is checked out by which user and displays it

package com.tw.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class BookDetails {

    private BookLibrary bookLibrary;

    public BookDetails(BookLibrary bookLibrary) {
        this.bookLibrary = bookLibrary;
    }

    @Override
    public String toString() {
        HashMap<User, Book> bookDetails =  bookLibrary.getCheckOutBookDetails();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Book-User\n");
        for(Map.Entry<User,Book> entry : bookDetails.entrySet() ){
            stringBuilder.append(entry.getKey() + "-" + entry.getValue() + "\n");
        }
        return stringBuilder.toString();
    }
}
