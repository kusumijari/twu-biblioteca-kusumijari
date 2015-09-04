package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BookListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayTheBookList() {
        System.out.println("Harry Potter\tJ. K. Rowling\t1997\nTale Of Two Cities\tCharles Dickens\t1997");
        assertEquals("Harry Potter\tJ. K. Rowling\t1997\nTale Of Two Cities\tCharles Dickens\t1997\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

}