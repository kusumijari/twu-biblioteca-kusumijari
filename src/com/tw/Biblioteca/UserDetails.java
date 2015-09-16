//Displays the user details

package com.tw.biblioteca;

public class UserDetails implements MenuItem{

    private Session session;

    public UserDetails(Session session) {
        this.session = session;
    }

    public String getDetails() {
        return session.getUser().toString();
    }

    public void execute() {
        ConsoleOutput consoleOutput = new ConsoleOutput(getDetails());
        consoleOutput.displayMessage();
    }
}
