package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ControllerTest {

    @Test
    public void shouldDisplayTheMenu() {
        Session session = new Session(new User("default", "nousername", "nopassword", "abc", "abc@mail.com", 12345));
        ConsoleOutput consoleOutput = mock(ConsoleOutput.class);
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        controller.showMenu(consoleOutput);

        verify(consoleOutput).displayMessage();
    }

    @Test
    public void  shouldAcceptInput() {
        Session session = new Session(new User("default", "nousername", "nopassword", "abc", "abc@mail.com", 12345));
        ConsoleInput consoleInput = mock(ConsoleInput.class);
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        when(consoleInput.getInput()).thenReturn("1");

        assertEquals("1", controller.input(consoleInput));
    }

    @Test
    public void shouldCreateTheMenuObject() {
        Session session = new Session(new User("default", "nousername", "nopassword", "abc", "abc@mail.com", 12345));
        Parser parser = mock(Parser.class);
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        controller.createMenuObject(parser);

        verify(parser).createMenuItem();
    }

    @Test
    public void shouldExexuteTheMenuObject() {
        Session session = new Session(new User("default", "nousername", "nopassword", "abc", "abc@mail.com", 12345));
        MenuItem menuItem = mock(MenuItem.class);
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        controller.executeMenuObject(menuItem);

        verify(menuItem).execute();
    }

    @Test
    public void shouldReturnDefaultMenu() {
        Session session = new Session(new User("default", "nousername", "nopassword", "abc", "abc@mail.com", 12345));
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        assertEquals(DefaultMenu.class, controller.MenuItem().getClass());
    }

    @Test
    public void shouldReturnUserMenuIfRoleIsUser() {
        Session session = new Session(new User("Customer", "nousername", "nopassword", "abc", "abc@mail.com", 12345));
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        assertEquals(CustomerMenu.class, controller.MenuItem().getClass());
    }

    @Test
    public void shouldReturnLibrarianMenuIfRoleIsLibrarian() {
        Session session = new Session(new User("Librarian", "nousername", "nopassword", "abc", "abc@mail.com", 12345));
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        assertEquals(LibrarianMenu.class, controller.MenuItem().getClass());
    }
}