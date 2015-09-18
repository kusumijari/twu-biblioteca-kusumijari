package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CheckedoutBookStatusTest {

    private static final String AUTHOR = "auhtor";
    private static final int YEAROFPUBLICATION = 0;

    @Test
    public void shouldFormatTheBookDetails() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);
        Session session = new Session(new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345));

        bookLibrary.removeBook(book, session);
        CheckedoutBookStatus checkedoutBookStatus = new CheckedoutBookStatus(bookLibrary);

        assertEquals("Book\t-\tUser\nHarry Potter\tJ. K. Rowling\t1997\t-\t123-4567\n", checkedoutBookStatus.toString());
    }

    @Test
    public void shouldDisplayTheBookList() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);
        Session session = new Session(new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345));
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        bookLibrary.removeBook(book, session);
        CheckedoutBookStatus checkedoutBookStatus = new CheckedoutBookStatus(bookLibrary);
        checkedoutBookStatus.execute();

        assertEquals("Book\t-\tUser\nHarry Potter\tJ. K. Rowling\t1997\t-\t123-4567\n\n", outContent.toString());
        System.setOut(System.out);
    }
}