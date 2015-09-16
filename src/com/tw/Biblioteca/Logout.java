//performs logout operation

package com.tw.biblioteca;

public class Logout implements MenuItem{

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
        User defaultUser = new User("default", "nousername", "nopassword");

        return session.setUser(defaultUser);
    }
}
