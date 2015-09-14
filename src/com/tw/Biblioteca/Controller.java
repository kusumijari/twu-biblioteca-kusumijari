//Controls the flow of the program

package com.tw.biblioteca;

public class Controller {

    private Menu menu;
    Library library;
    MovieLibrary movieLibrary;

    public Controller(Library library, MovieLibrary movieLibrary) {
        menu = new Menu();
        this.library = library;
        this.movieLibrary = movieLibrary;
    }

    public void showMenu(ConsoleOutput consoleOutput) {
        consoleOutput.displayMessage();
    }

    public String input(ConsoleInput consoleInput) {
        return consoleInput.getInput();
    }


    public MenuItem createMenuObject(Parser parser) {
        return parser.createMenuItem();
    }

    public void executeMenuObject(MenuItem menuItem) {
        menuItem.execute();
    }

    public void delegate() {
        while (true) {
            ConsoleOutput consoleOutput = new ConsoleOutput(menu.toString());
            showMenu(consoleOutput);
            Parser parser = new Parser(input(new ConsoleInput()), library, movieLibrary);
            MenuItem menuItem = createMenuObject(parser);
            executeMenuObject(menuItem);
        }
    }
}
