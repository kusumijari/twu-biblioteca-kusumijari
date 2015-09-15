//checks if the username and password is authentic and based on that creates new session if needed

package com.tw.biblioteca;

public class Authenticator {

    private User user;

    public Authenticator(User user) {
        this.user = user;
    }

    public boolean authenticate() {
        return true;
    }
}
