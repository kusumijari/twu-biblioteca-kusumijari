package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void out() {
        System.out.println("Welcome to Biblioteca");
        assertEquals("Welcome to Biblioteca\n", outContent.toString());
    }

    @Test
    public void shouldDisplayTheBookList() {
        View view = new View("Showing book list");

        assertEquals("Harry Potter"+"Tale of Two Cities", view.showBookList());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }
}