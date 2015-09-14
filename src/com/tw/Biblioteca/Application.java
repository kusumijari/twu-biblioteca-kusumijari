package com.tw.biblioteca;

public class  Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start() {
        ConsoleOutput consoleOutput = new ConsoleOutput("Welcome to Biblioteca");
        consoleOutput.displayMessage();
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Controller controller = new Controller(library, movieLibrary);
        controller.delegate();
    }
}
