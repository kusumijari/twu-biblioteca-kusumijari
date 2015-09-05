//Parses the menu option entered by the user

package com.tw.biblioteca;

public class Parser {
    private String option;

    public Parser(String option) {
        this.option = option;
    }

    public boolean isValid() {
        if(option.matches("[0-9]+") && convertToInt() == 1) {
            return true;
        }
        return false;
    }

    private int convertToInt() {
        return Integer.parseInt(option);
    }
}
