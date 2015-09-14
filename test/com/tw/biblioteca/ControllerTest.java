package com.tw.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ControllerTest {

    @Test
    public void shouldDisplayTheMenu() {
        ConsoleOutput consoleOutput = mock(ConsoleOutput.class);
        Controller controller = new Controller();

        controller.showMenu(consoleOutput);

        verify(consoleOutput).displayMessage();
    }
}