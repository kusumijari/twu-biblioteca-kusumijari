package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class ConsoleInputTest {
    private final ByteArrayInputStream inContent = new ByteArrayInputStream("1".getBytes());

    @Before
    public void setUpStreams() {
        System.setIn(inContent);
    }

    @Test
    public void shouldRecieveInput() {
        ConsoleInput consoleInput = new ConsoleInput();

        assertEquals("1", consoleInput.getInput());
    }

    @After
    public void cleanUpStreams() {
        System.setIn(System.in);
    }
}