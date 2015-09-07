//Building display classes

package com.tw.biblioteca;

public class Factory {

    private ConsoleOutput consoleOutput;
    public ConsoleOutput createConsoleOutputObject(String message) {
        consoleOutput = new ConsoleOutput(message);
        return consoleOutput;
    }
}
