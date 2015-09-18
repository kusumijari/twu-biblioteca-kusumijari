//performs logout operation

package com.tw.biblioteca;

public class Logout implements MenuItem{

    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String NAME = "name";
    private static final String EMAIL = "email";
    private static final int PHONENUMBER = 0;
    private Session session;

    public Logout(Session session) {
        this.session = session;
    }

    @Override
    public void execute() {
        stopSession();
        ConsoleOutput consoleOutput = new ConsoleOutput("Successful Logout.");
        consoleOutput.displayMessage();

    }

    public User stopSession() {
        User defaultUser = new User("default", USERNAME, PASSWORD, NAME, EMAIL, PHONENUMBER);

        return session.setUser(defaultUser);
    }
}
