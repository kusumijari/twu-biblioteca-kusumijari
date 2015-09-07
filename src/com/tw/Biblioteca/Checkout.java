//Checks out a book from the library

package com.tw.biblioteca;

public class Checkout implements MenuItem{

    int bookChoice;

    public String acceptBookChoice(ConsoleInput consoleInput) {
        return consoleInput.getInput();
    }

    @Override
    public void execute() {

    }
}
