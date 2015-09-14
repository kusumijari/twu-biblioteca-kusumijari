package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ControllerTest {

    @Test
    public void shouldDisplayTheMenu() {
        ConsoleOutput consoleOutput = mock(ConsoleOutput.class);
        Controller controller = new Controller();

        controller.showMenu(consoleOutput);

        verify(consoleOutput).displayMessage();
    }

    @Test
    public void  shouldAcceptInput() {
        ConsoleInput consoleInput = mock(ConsoleInput.class);
        Controller controller = new Controller();

        when(consoleInput.getInput()).thenReturn("1");

        assertEquals("1", controller.input(consoleInput));
    }
}