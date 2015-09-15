//Contains details about the current session which can be viewed

package com.tw.biblioteca;

public class Session {

    private User currentUser;
    
    public Session(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getUser() {
        return currentUser;
    }
}
