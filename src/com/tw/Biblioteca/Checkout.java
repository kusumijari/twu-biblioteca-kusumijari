//Checks out a book from the library

package com.tw.biblioteca;

public class Checkout implements MenuItem{

    int bookChoice;

    public String acceptBookChoice(ConsoleOutput consoleOutput) {
        return consoleOutput.getInput();
    }

    @Override
    public void execute() {

    }
}
