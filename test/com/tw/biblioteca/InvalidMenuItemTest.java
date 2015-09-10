package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class InvalidMenuItemTest {

    @Test
    public void shouldDisplayTheBookList() {

        InvalidMenuItem invalidMenuItem = new InvalidMenuItem();

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        invalidMenuItem.execute();

        assertEquals("Select a valid option!\n", outContent.toString());
        System.setOut(System.out);
    }

}