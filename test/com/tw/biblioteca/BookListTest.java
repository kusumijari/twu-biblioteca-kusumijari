package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookListTest {

    @Test
    public void shouldContainAListOfBooks() {
        BookList bookList = new BookList();

        assertEquals("Harry Potter"+"Tale of Two Cities", bookList.getBooks());
    }

}