//Tells the user to enter a valid menu option

package com.tw.biblioteca;

public class InvalidMenuItem implements MenuItem{

    String errorMessage;
    InvalidMenuItem() {
        this.errorMessage = "Select a valid option!";
    }

    public void execute() {
        System.out.println(errorMessage);
    }
    
}
