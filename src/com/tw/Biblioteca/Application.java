package com.tw.biblioteca;

public class  Application {
    static final String USERNAME = "nousername";
    static final String PASSWORD = "nopassword";
    static final String NAME = "noname";
    static final String EMAIL = "noemail";
    static final int PHONENUMBER = 0;

    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start() {
        ConsoleOutput consoleOutput = new ConsoleOutput("Welcome to Biblioteca");
        consoleOutput.displayMessage();
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Session session = new Session(new User("Default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER));
        Controller controller = new Controller(bookLibrary, movieLibrary, session);
        controller.delegate();
    }
}
