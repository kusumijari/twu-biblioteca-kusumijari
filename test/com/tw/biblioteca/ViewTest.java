package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintWelcomeMessage() {
        System.out.println("Welcome to Biblioteca");
        assertEquals("Welcome to Biblioteca\n", outContent.toString());
    }

    @Test
    public void shouldPrintTheListOfBooks() {
        ArrayList<String> booklist = new ArrayList<String>();
        booklist.add("Harry Potter");
        booklist.add("Tale of Two Citites");

        System.out.println("Harry Potter"+"Tale of Two Cities");

        assertEquals("Harry Potter"+"Tale of Two Cities\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }
}