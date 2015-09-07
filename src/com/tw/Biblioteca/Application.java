package com.tw.biblioteca;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start() {
        ConsoleOutput consoleOutput = new ConsoleOutput("Welcome to Biblioteca");
        consoleOutput.displayMessage();

        while(true) {
            Menu menu = new Menu();
            consoleOutput = new ConsoleOutput(menu.toString());
            consoleOutput.displayMessage();

            ConsoleInput consoleInput = new ConsoleInput();
            Parser parser = new Parser(consoleInput.getInput());
            MenuItem menuItem = parser.createMenuItem();
            menuItem.execute();
        }
    }
}
