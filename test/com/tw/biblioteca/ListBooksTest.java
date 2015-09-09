package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListBooksTest {

    @Test
    public void shouldReceiveTheListOfBooksFromLibrary() {

        Library library = new Library();
        ListBooks listBooks = new ListBooks(library);

        assertEquals("Name\tAuthor\tYear\nHarry Potter\tJ. K. Rowling\t1997\nTale of Two Cities\tCharles Dickens\t1859\n", listBooks.execute());


    }
}