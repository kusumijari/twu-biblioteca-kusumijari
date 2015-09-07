package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream("1".getBytes());

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setIn(inContent);
    }

    @Test
    public void shouldPrintWelcomeMessage() {
        View view = new View("Welcome to Biblioteca");

        view.displayMessage();

        assertEquals("Welcome to Biblioteca\n", outContent.toString());
    }


    @Test
    public void shouldRecieveInput() {
        View view = new View("Welcome to Biblioteca");

        assertEquals("1", view.getInput());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
        System.setIn(System.in);
    }
}
