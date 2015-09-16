package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookDetailsTest {
    @Test
    public void shouldDisplayTheBookDetails() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", "author", 0);
        Session session = new Session(new User("Customer", "123-4567", "password1"));

        bookLibrary.removeBook(book, session);
        BookDetails bookDetails = new BookDetails(bookLibrary);

        assertEquals("Book\t-\tUser\nHarry Potter\tJ. K. Rowling\t1997\t-\t123-4567\n", bookDetails.toString());
    }
}