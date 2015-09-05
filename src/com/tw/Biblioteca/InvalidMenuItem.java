//Tells the user to enter a valid menu option

package com.tw.biblioteca;

public class InvalidMenuItem {

    String errorMessage;
    InvalidMenuItem() {
        this.errorMessage = "Select a valid option!";
    }

    public void showErrorMessage() {
        System.out.println(errorMessage);
    }
}
