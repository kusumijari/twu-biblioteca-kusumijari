package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ControllerTest {

    @Test
    public void shouldDisplayTheMenu() {
        ConsoleOutput consoleOutput = mock(ConsoleOutput.class);
        Controller controller = new Controller(new Library());

        controller.showMenu(consoleOutput);

        verify(consoleOutput).displayMessage();
    }

    @Test
    public void  shouldAcceptInput() {
        ConsoleInput consoleInput = mock(ConsoleInput.class);
        Controller controller = new Controller(new Library());

        when(consoleInput.getInput()).thenReturn("1");

        assertEquals("1", controller.input(consoleInput));
    }

    @Test
    public void shouldCreateTheMenuObject() {
        Parser parser = mock(Parser.class);
        Controller controller = new Controller(new Library());

        controller.createMenuObject(parser);

        verify(parser).createMenuItem();
    }

    @Test
    public void shouldExexuteTheMenuObject() {
        MenuItem menuItem = mock(MenuItem.class);
        Controller controller = new Controller(new Library());

        controller.executeMenuObject(menuItem);

        verify(menuItem).execute();
    }
}