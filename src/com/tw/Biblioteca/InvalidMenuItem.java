//Tells the user to enter a valid menu option

package com.tw.biblioteca;

public class InvalidMenuItem implements MenuItem{

    String errorMessage;
    ConsoleOutput consoleOutput;
    InvalidMenuItem() {

        this.errorMessage = "Select a valid option!";
        consoleOutput = new ConsoleOutput(errorMessage);
    }

    public void execute() {

        System.out.println(errorMessage);
    }

}
