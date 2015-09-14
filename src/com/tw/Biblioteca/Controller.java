//Controls the flow of the program

package com.tw.biblioteca;

public class Controller {

    private Menu menu;

    public Controller() {
        menu = new Menu();
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
}
