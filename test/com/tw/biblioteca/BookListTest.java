package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayTheBookList() {
        ArrayList<Book>  list = new ArrayList<Book>();
        list.add(new Book("Harry Potter", "J. K. Rowling", 1997));
        BookList bookList = new BookList(list);

        bookList.execute();

        assertEquals("Name\tAuthor\tYear\nHarry Potter\tJ. K. Rowling\t1997\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

}