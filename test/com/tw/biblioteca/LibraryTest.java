package com.tw.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void shouldReturnContentsOfLibrary() {
        ArrayList<Book> booklist = new ArrayList<Book>();
        booklist.add(new Book("Harry Potter", "J. K. Rowling", 1997));
        booklist.add(new Book("Tale of Two cities", "Charles Dickens", 1859));
        Library library = new Library(booklist);

        assertEquals("Name\tAuthor\tYear", library.listOfBooks());
    }

}