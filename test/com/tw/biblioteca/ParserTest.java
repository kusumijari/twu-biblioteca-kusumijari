package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ParserTest {

    @Test
    public void shouldReturnTrueIfTheOptionEnteredIsADigit() {
        Parser parser = new Parser("1");

        assertTrue(parser.isValid());
    }


}