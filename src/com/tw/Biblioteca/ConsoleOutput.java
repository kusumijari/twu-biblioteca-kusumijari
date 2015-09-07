//Interacts with the user

package com.tw.biblioteca;

public class ConsoleOutput {

    String message;

    public ConsoleOutput(String message) {

        this.message = message;
    }

    public void displayMessage() {

        System.out.println(message);
    }

}
