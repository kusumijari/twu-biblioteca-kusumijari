package com.tw.biblioteca;

public class  Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start() {
        ConsoleOutput consoleOutput = new ConsoleOutput("Welcome to Biblioteca");
        consoleOutput.displayMessage();
        BookLibrary bookLibrary = new BookLibrary();
        MovieLibrary movieLibrary = new MovieLibrary();
        Session session = new Session(new User("default", "nousername", "nopassword"));
        User currentUser = new User("default", "nousername", "nopassword");
        Controller controller = new Controller(bookLibrary, movieLibrary, session);
        controller.delegate();
    }
}
