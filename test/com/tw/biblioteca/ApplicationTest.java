package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    @Test
    public void shouldPrintWelcomeMessage() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ConsoleOutput consoleOutput = new ConsoleOutput("Welcome to Biblioteca");

        consoleOutput.displayMessage();

        assertEquals("Welcome to Biblioteca\n", outContent.toString());
        System.setOut(System.out);
    }
}
