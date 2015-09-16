//Asks for the login and password and authenticates the user, creating a session

package com.tw.biblioteca;


import java.util.ArrayList;

public class Login implements MenuItem{

    User user;
    ConsoleInput consoleInput1, consoleInput2;
    ArrayList<User> users = new ArrayList<User>();
    Session session;

    public Login(ConsoleInput consoleInput1, ConsoleInput consoleInput2, Session session) {
        this.consoleInput1 = consoleInput1;
        this.consoleInput2 = consoleInput2;
        User user1 = new User("Customer", "123-4567", "password1");
        User user2 = new User("Librarian", "111-1111", "password2");
        User user3 = new User("Customer", "222-2222", "password2");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        this.session = session;
    }

    public String acceptUsername(ConsoleInput consoleInput) {
        return consoleInput.getInput();
    }

    public String acceptPassword(ConsoleInput consoleInput) {
        return consoleInput.getInput();
    }

    public boolean authenticate() {
        user = new User("role", acceptUsername(consoleInput1), acceptPassword(consoleInput2));
        if(users.contains(user)) {
            for(User thatUser : users) {
                if( thatUser.authenticatePassword(user)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void execute() {
        if(authenticate()) {
            startSession();
            ConsoleOutput consoleOutput = new ConsoleOutput("Successful Login");
            consoleOutput.displayMessage();
        }
        else {
            ConsoleOutput consoleOutput = new ConsoleOutput("Login failed");
            consoleOutput.displayMessage();
        }
    }

    public boolean startSession() {
        return session.setUser(users.get(users.indexOf(user)));
    }
}
