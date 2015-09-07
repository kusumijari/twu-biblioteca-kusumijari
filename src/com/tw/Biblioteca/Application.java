package com.tw.biblioteca;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }

    private void start() {
        View view = new View("Welcome to Biblioteca");
        view.displayMessage();

        while(true) {
            Menu menu = new Menu();
            view = new View(menu.toString());
            view.displayMessage();

            Parser parser = new Parser(view.getInput());
            MenuItem menuItem = parser.createMenuItem();
            menuItem.execute();
        }
    }
}
