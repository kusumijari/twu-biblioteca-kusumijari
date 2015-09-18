package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ControllerTest {

    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String NAME = "name";
    private static final String EMAIL = "email";
    private static final int PHONENUMBER = 0;

    @Test
    public void shouldDisplayTheMenu() {
        Session session = new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER));
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        controller.showMenu();

        assertEquals("DefaultMenu\nList Books\nList Movies\nCheckout Movie\nLogin\nExit\n\n", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void  shouldAcceptInput() {
        Session session = new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER));
        ConsoleInput consoleInput = mock(ConsoleInput.class);
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        when(consoleInput.getInput()).thenReturn("1");

        assertEquals("1", controller.input(consoleInput));
    }

    @Test
    public void shouldCreateTheMenuObject() {
        Session session = new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER));
        Parser parser = mock(Parser.class);
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        controller.createMenuObject(parser);

        verify(parser).createMenuItem();
    }

    @Test
    public void shouldExexuteTheMenuObject() {
        Session session = new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER));
        MenuItem menuItem = mock(MenuItem.class);
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        controller.executeMenuObject(menuItem);

        verify(menuItem).execute();
    }

    @Test
    public void shouldReturnDefaultMenu() {
        Session session = new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER));
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        assertEquals(DefaultMenu.class, controller.MenuItem().getClass());
    }

    @Test
    public void shouldReturnUserMenuIfRoleIsUser() {
        Session session = new Session(new User("Customer", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER));
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        assertEquals(CustomerMenu.class, controller.MenuItem().getClass());
    }

    @Test
    public void shouldReturnLibrarianMenuIfRoleIsLibrarian() {
        Session session = new Session(new User("Librarian", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER));
        Controller controller = new Controller(new BookLibrary(), new MovieLibrary(), session);

        assertEquals(LibrarianMenu.class, controller.MenuItem().getClass());
    }
}