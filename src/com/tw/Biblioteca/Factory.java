//Building display classes

package com.tw.biblioteca;

public class Factory {

    private ConsoleOutput consoleOutput;
    public ConsoleOutput createConsoleOutputObject(String message) {
        return new ConsoleOutput(message);
    }
}
