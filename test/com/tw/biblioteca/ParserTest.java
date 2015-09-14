package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ParserTest {

    @Test
    public void shouldReturnTrueIfTheOptionEnteredIsADigit() {
        Library library = new Library();
        Parser parser = new Parser("1", library);

        assertTrue(parser.isValid());
    }

    @Test
    public void shouldReturnFalseIfTheOptionEnteredIsAValueGreaterThanTheAvailableOptions() {
        Library library = new Library();
        Parser parser = new Parser("5", library);

        assertFalse(parser.isValid());
    }

    @Test
    public void shouldReturnBookListObjectIfOptionIsOne() {
        Library library = new Library();
        Parser parser = new Parser("1", library);

        assertEquals(ListBooks.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnInvalidMenuItemObjectIfAnIncorrectOptionIsEntered() {
        Library library = new Library();
        Parser parser = new Parser("99", library);

        assertEquals(InvalidMenuItem.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnFalseIfTheOptionEnteredIsANegativeNumber() {
        Library library = new Library();
        Parser parser = new Parser("-1", library);

        assertFalse(parser.isValid());
    }

    @Test
    public void shouldExitObjectIfOptionIsThree() {
        Library library = new Library();
        Parser parser = new Parser("3", library);

        assertEquals(Exit.class, parser.createMenuItem().getClass());
    }

    @Test
    public void shouldReturnCheckoutObjectIfOptionIsTwo() {
        Library library = new Library();
        Parser parser = new Parser("2", library);

        assertEquals(Checkout.class, parser.createMenuItem().getClass());
    }

}