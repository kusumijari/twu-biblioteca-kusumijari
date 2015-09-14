//Parses the menu option entered by the user and performs operations on the library

package com.tw.biblioteca;

public class Parser {
    private String option;
    private Library library;

    public Parser(String option, Library library) {
        this.library = library;
        this.option = option;
    }

    public boolean isValid() {
        if(option.matches("[0-9]+") && convertOptionToInt() > 0 && convertOptionToInt() <= 4 ) {
            return true;
        }
        return false;
    }

    private int convertOptionToInt() {
        return Integer.parseInt(option);
    }

    public MenuItem createMenuItem() {
        if(isValid()) {
            if (convertOptionToInt() == 1) {
                return new ListBooks(library);
            }
            else if (convertOptionToInt() == 2) {
                ConsoleInput consoleInput = new ConsoleInput();
                return new Checkout(library, consoleInput);
            }
            else if(convertOptionToInt() == 3) {
                return new Exit();
            }
        }
        return new InvalidMenuItem();
    }
}
