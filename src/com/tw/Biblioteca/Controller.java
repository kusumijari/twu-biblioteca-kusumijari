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
}
