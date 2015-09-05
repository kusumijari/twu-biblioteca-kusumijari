//Interacts with the user

package com.tw.biblioteca;

import java.util.Scanner;

public class View {

    String message;

    public View(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println(message);
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
