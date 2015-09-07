package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest {
    @Test
    public void shouldReturnNewDisplayObjects() {
        Factory factory = new Factory();

        assertEquals(ConsoleOutput.class, factory.createConsoleOutputObject("message"));
    }

}