//Receives input fromt the user

package com.tw.biblioteca;

import java.util.Scanner;

public class ConsoleInput {

    String message;

    public String getInput() {
       Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
