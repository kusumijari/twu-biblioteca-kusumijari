package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ConsoleOutputTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintWelcomeMessage() {
        ConsoleOutput consoleOutput = new ConsoleOutput("Welcome to biblioteca");

        consoleOutput.displayMessage();

        assertEquals("Welcome to biblioteca\n", outContent.toString());
    }


    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }
}
