//Controls the flow of the program

package com.tw.biblioteca;

public class Controller {

    private Menu menu;
    Library library;

    public Controller(Library library) {
        menu = new Menu();
        this.library = library;
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
            Parser parser = new Parser(input(new ConsoleInput()), library);
            MenuItem menuItem = createMenuObject(parser);
            executeMenuObject(menuItem);
        }
    }
}
