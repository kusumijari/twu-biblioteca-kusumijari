//checks if the username and password is authentic

package com.tw.biblioteca;

import java.util.ArrayList;

public class Authenticator {

    private User user;
    private ArrayList<User> users = new ArrayList<User>();

    public Authenticator(User user) {
        this.user = user;
        User user1 = new User("Customer", "123-4567", "password1");
        User user2 = new User("Librarian", "111-1111", "password2");
        users.add(user1);
        users.add(user2);
    }

    public boolean authenticate() {
        if(users.contains(user)){
            for(User thatUser : users) {
                if( thatUser.authenticatePassword(user)) {
                    return true;
                }
            }
        }
        return false;
    }
}
