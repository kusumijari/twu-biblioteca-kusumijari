package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ListBooksTest {

    @Test
    public void shouldReceiveTheListOfBooksFromLibrary() {

        BookLibrary bookLibrary = new BookLibrary();
        ListBooks listBooks = new ListBooks(bookLibrary);

        assertEquals("Name\tAuthor\tYear\nHarry Potter\tJ. K. Rowling\t1997\nTale of Two Cities\tCharles Dickens\t1859\n", listBooks.getBooks());

    }

    @Test
    public void shouldDisplayTheBookList() {

        BookLibrary bookLibrary = new BookLibrary();
        ListBooks listBooks = new ListBooks(bookLibrary);

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        listBooks.execute();

        assertEquals("Name\tAuthor\tYear\nHarry Potter\tJ. K. Rowling\t1997\nTale of Two Cities\tCharles Dickens\t1859\n\n", outContent.toString());
        System.setOut(System.out);
    }
}