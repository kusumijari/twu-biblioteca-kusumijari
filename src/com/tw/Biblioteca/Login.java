//Asks for the login and password and authenticates the user

package com.tw.biblioteca;


import java.util.ArrayList;

public class Login implements MenuItem{

    User user;
    ConsoleInput consoleInput1, consoleInput2;
    ArrayList<User> users = new ArrayList<User>();

    public Login(ConsoleInput consoleInput1, ConsoleInput consoleInput2) {
        this.consoleInput1 = consoleInput1;
        this.consoleInput2 = consoleInput2;
        User user1 = new User("Role", "123-4567", "password1");
        User user2 = new User("role", "111-1111", "password2");
        users.add(user1);
        users.add(user2);
    }

    public String acceptUsername(ConsoleInput consoleInput) {
        return consoleInput.getInput();
    }

    public String acceptPassword(ConsoleInput consoleInput) {
        return consoleInput.getInput();
    }


    public boolean authenticate() {
        User user = new User("role", acceptUsername(consoleInput1), acceptPassword(consoleInput2));
        if(users.contains(user)) {
            return true;
        }
        return false;
    }

    @Override
    public void execute() {
        if(authenticate()) {
            ConsoleOutput consoleOutput = new ConsoleOutput("Successful Login");
            consoleOutput.displayMessage();
        }
    }
}
