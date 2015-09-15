//Asks for the login and password and authenticates it

package com.tw.biblioteca;

import java.util.ArrayList;

public class Login {

    ArrayList<User> users = new ArrayList<User>();

     Login() {
        User user1 = new User("Customer", "123-4567", "password");
        User user2 = new User("Librarian", "123-4568", "password");
        users.add(user1);
        users.add(user2);
    }

    public String acceptUsername(ConsoleInput consoleInput) {
        ConsoleOutput consoleOutput = new ConsoleOutput("Enter Username:");
        consoleOutput.displayMessage();
        return consoleInput.getInput();
    }

    public String acceptPassword(ConsoleInput consoleInput) {
        ConsoleOutput consoleOutput = new ConsoleOutput("Enter Password:");
        consoleOutput.displayMessage();
        return consoleInput.getInput();
    }
    
}
