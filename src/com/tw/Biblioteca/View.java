//should display any message it receives

package com.tw.biblioteca;

public class View {

    String message;

    public View(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println(message);
    }
}
