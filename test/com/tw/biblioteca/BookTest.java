package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldReturnEachBookInColumnForm() {
        Book book = new Book("Harry Potter", "J. K. Rowling", 1997);

        assertEquals("Harry Potter\tJ. K. Rowling\t1997", book.toString());
    }
}