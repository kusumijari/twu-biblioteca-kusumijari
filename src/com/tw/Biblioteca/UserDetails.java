//Displays the user details

package com.tw.biblioteca;

public class UserDetails {

    private Session session;

    public UserDetails(Session session) {
        this.session = session;
    }

    public String getDetails() {
        return session.getUser().toString();
    }
}
