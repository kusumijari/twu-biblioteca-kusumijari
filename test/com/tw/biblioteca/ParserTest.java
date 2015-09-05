package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ParserTest {

    @Test
    public void shouldReturnTrueIfTheOptionEnteredIsADigit() {
        Parser parser = new Parser("1");

        assertTrue(parser.isValid());
    }

    @Test
    public void shouldReturnFalseIfTheOptionEnteredIsAValueGreaterThanTheAvailableOptions() {
        Parser parser = new Parser("3");

        assertFalse(parser.isValid());
    }

    @Test
    public void shouldReturnBookListObjectIfOptionIsOne() {
        Parser parser = new Parser("1");

        assertEquals(BookList.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnInvalidMenuItemObjectIfAnIncorrectOptionIsEntered() {
        Parser parser = new Parser("2");

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnFalseIfTheOptionEnteredIsANegativeNumber() {
        Parser parser = new Parser("-1");

        assertFalse(parser.isValid());
    }
}