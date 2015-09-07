//Tells the user to enter a valid menu option

package com.tw.biblioteca;

public class InvalidMenuItem implements MenuItem{

    String errorMessage;
    View view;
    InvalidMenuItem() {

        this.errorMessage = "Select a valid option!";
        view = new View(errorMessage);
    }

    public void execute() {

        System.out.println(errorMessage);
    }

}
